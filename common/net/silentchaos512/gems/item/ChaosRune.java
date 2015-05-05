package net.silentchaos512.gems.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.silentchaos512.gems.core.util.LocalizationHelper;
import net.silentchaos512.gems.lib.Names;
import net.silentchaos512.gems.lib.Strings;
import net.silentchaos512.gems.lib.buff.ChaosBuff;

public class ChaosRune extends ItemSG {

  public final static String COST = "Cost";
  public final static String MAX_LEVEL = "MaxLevel";

  public ChaosRune() {

    setMaxStackSize(16);
    setHasSubtypes(true);
    setMaxDamage(0);
    setUnlocalizedName(Names.CHAOS_RUNE);
    rarity = EnumRarity.rare;
  }

  @Override
  public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {

    int d = stack.getItemDamage();

    if (d >= 0 && d < ChaosBuff.all.size()) {
      // Name
      list.add(EnumChatFormatting.GOLD
          + LocalizationHelper.getLocalizedString(Strings.BUFF_RESOURCE_PREFIX
              + ChaosBuff.all.get(d).name));
      // Cost
      String s = LocalizationHelper.getOtherItemKey(itemName, COST);
      list.add(EnumChatFormatting.DARK_GREEN + String.format(s, ChaosBuff.all.get(d).cost));
      // Max Level
      s = LocalizationHelper.getOtherItemKey(itemName, MAX_LEVEL);
      list.add(EnumChatFormatting.DARK_GREEN + String.format(s, ChaosBuff.all.get(d).maxLevel));
      // Buff description
      list.add(LocalizationHelper.getOtherItemKey(itemName, ChaosBuff.all.get(d).name));
    } else {
      list.add(EnumChatFormatting.RED + "Invalid meta value!");
    }

    // Information on how to use.
    list.add(EnumChatFormatting.DARK_GRAY + LocalizationHelper.getItemDescription(itemName, 0));
  }

  @Override
  public void getSubItems(Item item, CreativeTabs tabs, List list) {

    for (int i = 0; i < ChaosBuff.all.size(); ++i) {
      list.add(new ItemStack(this, 1, i));
    }
  }

  @Override
  public String getUnlocalizedName(ItemStack stack) {

    return getUnlocalizedName(itemName);
  }
}
