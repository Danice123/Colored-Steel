package net.minecraft.src;

public class BlockOreStorage extends Block
{
    public BlockOreStorage(int par1, int par2)
    {
        super(par1, Material.iron);
        blockIndexInTexture = par2;
    }
    
    public int getRenderColor(int par1)
    {
        if (par1 == 1){return 0xff9900;} //orange
        if (par1 == 2){return 0x990099;} //magenta
        if (par1 == 3){return 0x33ffff;} //light blue
        if (par1 == 4){return 0xffff00;} //yellow
        if (par1 == 5){return 0x33ff00;} //lime
        if (par1 == 6){return 0xff00ff;} //pink
        if (par1 == 7){return 0x999999;} //grey
        if (par1 == 8){return 0xcccccc;} //light grey
        if (par1 == 9){return 0x33cccc;} //cyan
        if (par1 == 10){return 0x660066;} //purple
        if (par1 == 11){return 0x0000ff;} //blue
        if (par1 == 12){return 0x996600;} //brown
        if (par1 == 13){return 0x006600;} //green
        if (par1 == 14){return 0xff0000;} //red
        if (par1 == 15){return 0x666666;} //black
        if (par1 == 16){return 0x990000;} //dark red
        return 0xffffff;
    }
    
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
    	int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
        if (l == 1){return 0xff9900;} //orange
        if (l == 2){return 0x990099;} //magenta
        if (l == 3){return 0x33ffff;} //light blue
        if (l == 4){return 0xffff00;} //yellow
        if (l == 5){return 0x33ff00;} //lime
        if (l == 6){return 0xff00ff;} //pink
        if (l == 7){return 0x999999;} //grey
        if (l == 8){return 0xcccccc;} //light grey
        if (l == 9){return 0x33cccc;} //cyan
        if (l == 10){return 0x660066;} //purple
        if (l == 11){return 0x0000ff;} //blue
        if (l == 12){return 0x996600;} //brown
        if (l == 13){return 0x006600;} //green
        if (l == 14){return 0xff0000;} //red
        if (l == 15){return 0x666666;} //black
        if (l == 16){return 0x990000;} //dark red
        return 0xffffff;
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
    	return blockIndexInTexture;
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    protected int damageDropped(int par1)
    {
        return par1;
    }
}
