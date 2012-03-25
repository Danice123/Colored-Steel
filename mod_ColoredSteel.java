package net.minecraft.src;

public class mod_ColoredSteel extends BaseMod {

	public static final Item ColoredSteel = new ItemMetadata(Block.blockSteel.blockID - 256, Block.blockSteel).setItemName("Steel");
	
	public void load() {
		Item.itemsList[Block.blockSteel.blockID] = ColoredSteel;
        for (int i = 0; i < 16; i++)
        {
        	ModLoader.addShapelessRecipe(new ItemStack(Block.blockSteel, 1, BlockCloth.getDyeFromBlock(i)), new Object[]
                    {
                        new ItemStack(Item.dyePowder, 1, i), new ItemStack(Item.itemsList[Block.blockSteel.blockID], 1, 0)
                    });
        }
	}
	
	public String getVersion() {
		return "1.1";
	}
}
