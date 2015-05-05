package net.silentchaos512.gems.recipe;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.silentchaos512.gems.item.Gem;
import net.silentchaos512.gems.item.TorchBandolier;
import net.silentchaos512.gems.lib.EnumGem;
import net.silentchaos512.gems.lib.Strings;

public class TorchBandolierRecipe implements IRecipe {

  @Override
  public boolean matches(InventoryCrafting inv, World world) {

    int numBandolier = 0;
    int numGem = 0;

    ItemStack stack;

    for (int i = 0; i < inv.getSizeInventory(); ++i) {
      stack = inv.getStackInSlot(i);
      if (stack != null) {
        if (inv.getStackInSlot(i).getItem() instanceof TorchBandolier) {
          ++numBandolier;
        } else if (inv.getStackInSlot(i).getItem() instanceof Gem) {
          ++numGem;
        }
      }
    }

    return numBandolier == 1 && numGem == 1;
  }

  @Override
  public ItemStack getCraftingResult(InventoryCrafting inv) {

    ItemStack bandolier = null, gem = null, result, stack;

    for (int i = 0; i < inv.getSizeInventory(); ++i) {
      stack = inv.getStackInSlot(i);
      if (stack != null) {
        if (stack.getItem() instanceof TorchBandolier) {
          bandolier = stack;
        } else if (stack.getItem() instanceof Gem && stack.getItemDamage() < EnumGem.all().length) {
          gem = stack;
        }
      }
    }

    if (bandolier == null || gem == null) {
      return null;
    }

    result = bandolier.copy();
    if (result.stackTagCompound == null) {
      result.stackTagCompound = new NBTTagCompound();
    }
    int k = gem.getItemDamage();
    result.stackTagCompound.setByte(Strings.TORCH_BANDOLIER_GEM, (byte) k);

    return result;
  }

  @Override
  public int getRecipeSize() {

    return 10;
  }

  @Override
  public ItemStack getRecipeOutput() {

    return null;
  }

}
