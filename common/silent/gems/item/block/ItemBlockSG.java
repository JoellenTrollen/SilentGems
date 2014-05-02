package silent.gems.item.block;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import silent.gems.core.registry.SRegistry;
import silent.gems.core.util.LocalizationHelper;
import silent.gems.lib.EnumGem;
import silent.gems.lib.Strings;


public class ItemBlockSG extends ItemBlock {

    protected boolean gemSubtypes = false;
    protected String itemName = "";
    
    public ItemBlockSG(int id) {

        super(id);
        setHasSubtypes(true);
        setUnlocalizedName(Integer.toString(id));
    }
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        
        String s = LocalizationHelper.getMessageText(itemName, EnumChatFormatting.DARK_GRAY);
        if (!s.equals(EnumChatFormatting.DARK_GRAY + LocalizationHelper.MISC_PREFIX + itemName)) {
            list.add(s);
        }
    }
    
    @Override
    public Icon getIconFromDamage(int meta) {

        if (hasSubtypes && SRegistry.getBlockSG(itemName) != null) {
            return SRegistry.getBlockSG(itemName).icons[meta];
        }
        else {
            return super.getIconFromDamage(meta);
        }
    }

    @Override
    public int getMetadata(int meta) {

        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {

        int d = stack.getItemDamage();
        
        if (gemSubtypes && d < EnumGem.all().length) {
            return getUnlocalizedName(itemName + EnumGem.all()[d].id);
        }
        else if (hasSubtypes) {
            return getUnlocalizedName(itemName + "-" + Integer.toString(d));
        }
        else {
            return getUnlocalizedName(itemName);
        }
    }

    public String getUnlocalizedName(String tileName) {

        return (new StringBuilder()).append("tile.").append(Strings.RESOURCE_PREFIX).append(tileName).toString();
    }
    
    @Override
    public Item setUnlocalizedName(String itemName) {
        
        this.itemName = itemName;
        return super.setUnlocalizedName(itemName);
    }
    
    public void setHasGemSubtypes(boolean value) {
        
        gemSubtypes = value;
    }
}
