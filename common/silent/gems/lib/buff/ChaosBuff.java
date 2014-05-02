package silent.gems.lib.buff;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import silent.gems.core.registry.SRegistry;
import silent.gems.core.util.LocalizationHelper;
import silent.gems.item.CraftingMaterial;
import silent.gems.lib.Names;
import silent.gems.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class ChaosBuff {
    
    public final static String SPEED = "speed";
    public final static String HASTE = "haste";
    public final static String JUMP = "jump";
    public final static String FLIGHT = "flight";
    public final static String NIGHT_VISION = "nightVision";
    public final static String REGENERATION = "regen";
    public final static String RESISTANCE = "resist";
    public final static String FIRE_RESISTANCE = "fireResist";
    public final static String WATER_BREATHING = "waterBreathing";
    public final static String STRENGTH = "strength";
    public final static String CAPACITY = "capacity";
    public final static String BOOSTER = "booster";

    public final static ArrayList<ChaosBuff> all = new ArrayList<ChaosBuff>();

    public final int id;
    public final String name;
    public final int maxLevel;
    public final int potionId;
    public final int cost;

    private static int lastId = -1;

    public ChaosBuff(int id, String name, int maxLevel, int potionId, int cost) {

        this.id = id;
        this.name = name;
        this.maxLevel = maxLevel;
        this.potionId = potionId;
        this.cost = cost;
    }

    public static void init() {

        if (!all.isEmpty()) {
            return;
        }

        //addBuff("none", 1, -1, Item.ingotIron);
        addBuff(SPEED,              4, Potion.moveSpeed.id,         20, Item.ingotGold);
        addBuff(HASTE,              4, Potion.digSpeed.id,          20, Item.goldenCarrot);
        addBuff(JUMP,               4, Potion.jump.id,              10, CraftingMaterial.getStack(Names.PLUME));
        addBuff(FLIGHT,             4, -1,                          80, CraftingMaterial.getStack(Names.GOLDEN_PLUME));
        addBuff(NIGHT_VISION,       1, Potion.nightVision.id,       10, Item.goldenCarrot);
        addBuff(REGENERATION,       2, Potion.regeneration.id,      50, Item.ghastTear);
        addBuff(RESISTANCE,         2, Potion.resistance.id,        40, Item.plateLeather);
        addBuff(FIRE_RESISTANCE,    1, Potion.fireResistance.id,    40, Item.blazeRod);
        addBuff(WATER_BREATHING,    1, Potion.waterBreathing.id,    40, Block.blockLapis);
        addBuff(STRENGTH,           2, Potion.damageBoost.id,       40, Block.blockRedstone);
        addBuff(CAPACITY,           4, -1,                           0, CraftingMaterial.getStack(Names.CHAOS_CAPACITOR));
        addBuff(BOOSTER,            4, -1,                           0, CraftingMaterial.getStack(Names.CHAOS_BOOSTER));
    }

    private static void addBuff(String name, int maxLevel, int potionId, int cost, Object material) {

        ChaosBuff buff = new ChaosBuff(++lastId, name, maxLevel, potionId, cost);
        all.add(buff);
        GameRegistry.addShapedRecipe(new ItemStack(SRegistry.getItem(Names.CHAOS_RUNE), 1, lastId), "mcm", "cmc", "rcr", 'm', material,
                'c', CraftingMaterial.getStack(Names.CHAOS_ESSENCE_PLUS), 'r', Item.redstone);
    }
    
    public static ChaosBuff getBuffByName(String name) {
        
        for (ChaosBuff buff : all) {
            if (buff.name.equals(name)) {
                return buff;
            }
        }
        
        return null;
    }

    public void apply(EntityPlayer player, int level) {

        if (potionId > -1) {
            player.addPotionEffect(new PotionEffect(potionId, 250, level - 1, true));
        }

        // Apply other effects here.
        // TODO
    }
    
    public void remove(EntityPlayer player) {
        
        if (potionId > -1) {
            player.removePotionEffect(potionId);
        }
    }

    public String getDisplayName(int level) {

        String s = LocalizationHelper.getLocalizedString(Strings.BUFF_RESOURCE_PREFIX + this.name);
        s += " ";

        if (level == 1) {
            s += "I";
        }
        else if (level == 2) {
            s += "II";
        }
        else if (level == 3) {
            s += "III";
        }
        else if (level == 4) {
            s += "IV";
        }
        else if (level == 5) {
            s += "V";
        }
        else {
            s += level;
        }

        return s;
    }
}
