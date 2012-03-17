package net.minecraft.src;

public class mod_ColoredSteel extends BaseMod {

	public static int color[] = new int[15];
	public static final Item ColoredSteel = new ItemSteel(Block.blockSteel.blockID - 256).setItemName("Steel");
	
	public void load() {
		color[0] = ModLoader.addOverride("/terrain.png", "/img/orange.png");
		color[1] = ModLoader.addOverride("/terrain.png", "/img/magenta.png");
		color[2] = ModLoader.addOverride("/terrain.png", "/img/lightblue.png");
		color[3] = ModLoader.addOverride("/terrain.png", "/img/yellow.png");
		color[4] = ModLoader.addOverride("/terrain.png", "/img/lime.png");
		color[5] = ModLoader.addOverride("/terrain.png", "/img/pink.png");
		color[6] = ModLoader.addOverride("/terrain.png", "/img/grey.png");
		color[7] = ModLoader.addOverride("/terrain.png", "/img/lightgrey.png");
		color[8] = ModLoader.addOverride("/terrain.png", "/img/cyan.png");
		color[9] = ModLoader.addOverride("/terrain.png", "/img/purple.png");
		color[10] = ModLoader.addOverride("/terrain.png", "/img/blue.png");
		color[11] = ModLoader.addOverride("/terrain.png", "/img/brown.png");
		color[12] = ModLoader.addOverride("/terrain.png", "/img/green.png");
		color[13] = ModLoader.addOverride("/terrain.png", "/img/red.png");
		color[14] = ModLoader.addOverride("/terrain.png", "/img/black.png");
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
		return "1.0";
	}
}
