package portal658.worldgen;

import java.util.Random;

import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import portal658.blocks.BlockBerti;
import portal658.blocks.blocklist.ListCoinOres;
import portal658.init.ModBlocks;

public class OreGen implements IWorldGenerator
{
	private WorldGenerator copper_up;
	private WorldGenerator copper_down;
	private WorldGenerator iron_up;
	private WorldGenerator iron_down;
	private WorldGenerator silver_up;
	private WorldGenerator silver_down;
	private WorldGenerator epic;
	
	public OreGen()
	{
		copper_up = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.COPPER.getMetadata()), 5);
		copper_down = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.COPPER.getMetadata()), 5);
		iron_up = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.IRON.getMetadata()), 3);
		iron_down = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.IRON.getMetadata()), 2);
		silver_up = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.SILVER.getMetadata()), 3);
		silver_down = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.SILVER.getMetadata()), 3);
		epic = new WorldGenMinable(ModBlocks.coinOre.getStateFromMeta(ListCoinOres.EPIC.getMetadata()), 3);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		{
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; ++i)
		{
			int x = chunk_X * 16 + rand.nextInt(16);
		    int y = minHeight + rand.nextInt(heightDiff);
		    int z = chunk_Z * 16 + rand.nextInt(16);
		    generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		runGenerator(copper_up, world, random, chunkX, chunkZ, 12, 16, 64);
		runGenerator(copper_down, world, random, chunkX, chunkZ, 6, 0, 31);
		runGenerator(iron_up, world, random, chunkX, chunkZ, 6, 16, 64);
		runGenerator(iron_down, world, random, chunkX, chunkZ, 4, 0, 15);
		runGenerator(silver_up, world, random, chunkX, chunkZ, 4, 16, 64);
		runGenerator(silver_down, world, random, chunkX, chunkZ, 3, 0, 15);
		runGenerator(epic, world, random, chunkX, chunkZ, 4, 0, 32);
	}
}