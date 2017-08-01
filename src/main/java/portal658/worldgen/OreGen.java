package portal658.worldgen;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import portal658.blocks.BlockBerti;
import portal658.init.ModBlocks;

public class OreGen implements IWorldGenerator
{

	private WorldGenerator copper_coin_ore;
	private WorldGenerator iron_coin_ore;
	private WorldGenerator silver_coin_ore;
	private WorldGenerator epic_coin_ore;
	
	public OreGen()
	{
		copper_coin_ore = new WorldGenMinable(ModBlocks.copper_coin_ore.getDefaultState(), 5);
		iron_coin_ore = new WorldGenMinable(ModBlocks.iron_coin_ore.getDefaultState(), 3);
		silver_coin_ore = new WorldGenMinable(ModBlocks.silver_coin_ore.getDefaultState(), 3);
		epic_coin_ore = new WorldGenMinable(ModBlocks.epic_coin_ore.getDefaultState(), 3);
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
		runGenerator(copper_coin_ore, world, random, chunkX, chunkZ, 12, 16, 64);
		runGenerator(iron_coin_ore, world, random, chunkX, chunkZ, 6, 16, 64);
		runGenerator(silver_coin_ore, world, random, chunkX, chunkZ, 4, 16, 64);
		runGenerator(epic_coin_ore, world, random, chunkX, chunkZ, 4, 0, 32);
	}
}