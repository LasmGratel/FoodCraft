package com.cfyifei.plant.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.item.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeGenBase;


public class BlockBannana extends Block {
	
	private String name;
	private Item fruit;
	
	public BlockBannana(String name,Item fruit){
		 super(Material.wood);
		 this.setTickRandomly(true);
		 this.setHardness(0.2F);
		 this.setLightOpacity(1);
		 this.setStepSound(soundTypeWood);
		 this.setUnlocalizedName(name);
		 this.name=name;
		 this.fruit = fruit;
		 this.setCreativeTab(FoodCraft.FcTabJiqi);
	}
   
    public int quantityDropped(Random p_149745_1_) {
        return p_149745_1_.nextInt(2) + 1;
    }
    
	 @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	        return fruit;
	}
}
