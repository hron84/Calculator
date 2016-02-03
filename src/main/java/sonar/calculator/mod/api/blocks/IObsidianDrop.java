package sonar.calculator.mod.api.blocks;

import net.minecraft.world.World;

/** implemented on blocks which can be dropped by the Obsidian Key */
public interface IObsidianDrop {

	/**can the Obsidian Key drop this block*/
	public boolean canKeyDrop(World world, int x, int y, int z);
}
