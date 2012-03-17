package net.minecraft.src;

public class ItemSteel extends ItemBlock {

	public ItemSteel(int par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
	}

    /**
     * Gets an icon index based on an item's damage value
     */
    public int getIconFromDamage(int par1)
    {
        return Block.blockSteel.getBlockTextureFromSideAndMetadata(2, BlockCloth.getBlockFromDye(par1));
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int par1)
    {
        return par1;
    }
}
