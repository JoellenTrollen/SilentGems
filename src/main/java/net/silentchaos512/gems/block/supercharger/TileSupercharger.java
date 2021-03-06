/*
 * Silent's Gems -- TileSupercharger
 * Copyright (C) 2018 SilentChaos512
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 3
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.silentchaos512.gems.block.supercharger;

import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.silentchaos512.gems.SilentGems;
import net.silentchaos512.gems.api.energy.IChaosAccepter;
import net.silentchaos512.gems.block.BlockMisc;
import net.silentchaos512.gems.compat.gear.SGearProxy;
import net.silentchaos512.gems.init.ModBlocks;
import net.silentchaos512.gems.init.ModEnchantments;
import net.silentchaos512.gems.init.ModItems;
import net.silentchaos512.lib.tile.SyncVariable;
import net.silentchaos512.lib.tile.TileSidedInventorySL;
import net.silentchaos512.lib.util.MathUtils;
import net.silentchaos512.lib.util.TimeHelper;

public class TileSupercharger extends TileSidedInventorySL implements ITickable, IChaosAccepter {
    static final int MAX_CHAOS_STORED = 1_000_000;
    private static final int INVENTORY_SIZE = 3;
    private static final int UPDATE_FREQUENCY = TimeHelper.ticksFromSeconds(15);

    @SyncVariable(name = "Energy")
    private int chaosStored;
    @SyncVariable(name = "Progress")
    private int progress;
    @SyncVariable(name = "StructureLevel")
    private int structureLevel;
    private int updateTimer = 0;

    @Override
    public void update() {
        if (this.world.isRemote) return;

        ++updateTimer;

        if (updateTimer > UPDATE_FREQUENCY) {
            if (checkStructureLevel()) {
                SilentGems.logHelper.info("Supercharger at {}: structure level updated to {}",
                        this.pos, this.structureLevel);
            }
            sendUpdate();
            updateTimer = 0;
        }

        ItemStack input = getInputItem();
        ItemStack catalyst = getCatalystItem();

        if (!input.isEmpty() && !catalyst.isEmpty())
            handleCharging(input, catalyst);
        else progress = 0;

    }

    private void handleCharging(ItemStack input, ItemStack catalyst) {
        int chargeTier = ModItems.chargingAgent.getTier(catalyst);
        if (chargeTier > 0 && chargeTier <= this.structureLevel) {
            int totalCost = getChaosCostForCharging();
            int chaosDrained = MathUtils.min(chaosStored,
                    getChaosDrainPerTick(),
                    totalCost - progress);

            if (wouldFitInOutputSlot(input, chargeTier)) {
                if (chaosDrained > 0) {
                    chaosStored -= chaosDrained;
                    progress += chaosDrained;
                }
                if (progress >= totalCost) {
                    if (getStackInSlot(2).isEmpty()) {
                        ItemStack output = input.copy();
                        output.setCount(1);
                        output.addEnchantment(ModEnchantments.supercharged, chargeTier);
                        setInventorySlotContents(2, output);
                    } else {
                        getStackInSlot(2).grow(1);
                    }

                    progress = 0;
                    decrStackSize(0, 1);
                    decrStackSize(1, 1);
                }

                if (chaosDrained > 0) sendUpdate();
            }
        }
    }

    private ItemStack getInputItem() {
        ItemStack stack = getStackInSlot(0);
        return SGearProxy.isMainPart(stack) ? stack : ItemStack.EMPTY;
    }

    private ItemStack getCatalystItem() {
        ItemStack stack = getStackInSlot(1);
        return stack.getItem() == ModItems.chargingAgent ? stack : ItemStack.EMPTY;
    }

    private boolean checkStructureLevel() {
        int oldValue = this.structureLevel;
        this.structureLevel = MathUtils.min(
                this.getPillarLevel(this.pos.offset(EnumFacing.NORTH, 3).offset(EnumFacing.WEST, 3)),
                this.getPillarLevel(this.pos.offset(EnumFacing.NORTH, 3).offset(EnumFacing.EAST, 3)),
                this.getPillarLevel(this.pos.offset(EnumFacing.SOUTH, 3).offset(EnumFacing.WEST, 3)),
                this.getPillarLevel(this.pos.offset(EnumFacing.SOUTH, 3).offset(EnumFacing.EAST, 3)));
        return this.structureLevel != oldValue;
    }

    private int getPillarLevel(BlockPos pos) {
        IBlockState state1 = this.world.getBlockState(pos);
        IBlockState state2 = this.world.getBlockState(pos.up());
        if (isMiscBlock(state1, BlockMisc.Type.CHAOS_IRON) && isGemBlock(state2))
            return 1;

        IBlockState state3 = this.world.getBlockState(pos.up(2));
        if (isMiscBlock(state1, BlockMisc.Type.CHAOS_ESSENCE_ENRICHED)
                && isMiscBlock(state2, BlockMisc.Type.CHAOS_IRON)
                && isGemBlock(state3))
            return 2;

        IBlockState state4 = this.world.getBlockState(pos.up(3));
        IBlockState state5 = this.world.getBlockState(pos.up(4));
        if (isMiscBlock(state1, BlockMisc.Type.ENDER_ESSENCE)
                && isMiscBlock(state2, BlockMisc.Type.ENDER_ESSENCE)
                && isMiscBlock(state3, BlockMisc.Type.CHAOS_ESSENCE_ENRICHED)
                && isMiscBlock(state4, BlockMisc.Type.CHAOS_IRON)
                && isGemBlock(state5))
            return 3;

        return 0;
    }

    private static boolean isGemBlock(IBlockState state) {
        return state.getBlock() == ModBlocks.gemBlock || state.getBlock() == ModBlocks.gemBlockDark || state.getBlock() == ModBlocks.gemBlockLight;
    }

    private static boolean isMiscBlock(IBlockState state, BlockMisc.Type type) {
        return state.getBlock() == ModBlocks.miscBlock && state.getBlock().getMetaFromState(state) == type.getMetadata();
    }

    private boolean wouldFitInOutputSlot(ItemStack input, int chargeTier) {
        ItemStack output = getStackInSlot(2);
        if (output.isEmpty()) return true;
        return output.getCount() < output.getMaxStackSize()
                && input.isItemEqual(output)
                && EnchantmentHelper.getEnchantmentLevel(ModEnchantments.supercharged, output) == chargeTier
                && SGearProxy.getGradeString(input).equalsIgnoreCase(SGearProxy.getGradeString(output));
    }

    int getChaosCostForCharging() {
        return getChaosCostForCharging(this.getInputItem(), this.getCatalystItem());
    }

    private static int getChaosCostForCharging(ItemStack gearPart, ItemStack catalyst) {
        if (gearPart.isEmpty() || catalyst.isEmpty()) return -1;
        final int tier = SGearProxy.getPartTier(gearPart);
        final int chargeTier = ModItems.chargingAgent.getTier(catalyst);
        return tier >= 0 && chargeTier > 0 ? chargeTier * (chargeTier + 1) * (int) Math.pow(10, tier + 1) : -1;
    }

    int getChaosDrainPerTick() {
        final int partTier = SGearProxy.getPartTier(this.getInputItem());
        final int chargeTier = ModItems.chargingAgent.getTier(this.getCatalystItem());
        if (partTier < 0 || chargeTier <= 0) return 0;
        int rate = getChaosDrainPerTick(partTier, chargeTier);
        // Limit the rate so low tier materials don't supercharge instantly
        return Math.min(rate, getChaosCostForCharging() / 20);
    }

    private static int getChaosDrainPerTick(int partTier, int chargeTier) {
        if (chargeTier < 1) return 0;
        return (int) (2 * chargeTier * Math.pow(5, partTier));
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        if (index == 0) return SGearProxy.isMainPart(stack);
        if (index == 1) return stack.getItem() == ModItems.chargingAgent;
        return false;
    }

    @Override
    public int receiveCharge(int maxReceive, boolean simulate) {
        int received = Math.min(MAX_CHAOS_STORED - chaosStored, maxReceive);
        if (!simulate) {
            chaosStored += received;
            if (received != 0) {
                sendUpdate();
            }
        }
        return received;
    }

    @Override
    public int getCharge() {
        return chaosStored;
    }

    @Override
    public int getMaxCharge() {
        return MAX_CHAOS_STORED;
    }

    @Override
    public int getSizeInventory() {
        return INVENTORY_SIZE;
    }

    @Override
    public int getFieldCount() {
        return 2;
    }

    @Override
    public int getField(int id) {
        if (id == 0) return this.chaosStored;
        if (id == 1) return this.progress;
        return 0;
    }

    @Override
    public void setField(int id, int value) {
        if (id == 0) this.chaosStored = value;
        if (id == 1) this.progress = value;
    }
}
