package net.silentchaos512.gems.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.silentchaos512.gems.core.util.RecipeHelper;
import net.silentchaos512.gems.item.CraftingMaterial;
import net.silentchaos512.gems.lib.Names;
import net.silentchaos512.gems.lib.Strings;

public class MiscBlock extends BlockSG {

  public final static String[] names = { Names.CHAOS_ESSENCE_BLOCK };

  public MiscBlock() {

    super(Material.iron);
    icons = new IIcon[names.length];
    setHasSubtypes(true);
    setUnlocalizedName(Names.MISC_BLOCKS);
  }

  @Override
  public void addRecipes() {

    ItemStack chaosEssence = CraftingMaterial.getStack(Names.CHAOS_ESSENCE);
    ItemStack block = this.getStack(Names.CHAOS_ESSENCE_BLOCK);
    RecipeHelper.addCompressionRecipe(chaosEssence, block, 9);
  }

  public static ItemStack getStack(String name) {

    for (int i = 0; i < names.length; ++i) {
      if (names[i].equals(name)) {
        return new ItemStack(ModBlocks.miscBlock, 1, i);
      }
    }

    return null;
  }

  public static ItemStack getStack(String name, int count) {

    for (int i = 0; i < names.length; ++i) {
      if (names[i].equals(name)) {
        return new ItemStack(ModBlocks.miscBlock, count, i);
      }
    }

    return null;
  }

  @Override
  public void registerBlockIcons(IIconRegister iconRegister) {

    for (int i = 0; i < names.length; ++i) {
      icons[i] = iconRegister.registerIcon(Strings.RESOURCE_PREFIX + names[i]);
    }
  }
}
