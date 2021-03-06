package com.cfyifei.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
/**
 * 
 * This class is not my.
 *
 */
public class RemoveRecipe
{
	public static void removeAnyRecipe (ItemStack ItemStack)
	{
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < recipes.size(); i++)
		{
			IRecipe tmpRecipe = recipes.get(i);
			ItemStack recipeResult = tmpRecipe.getRecipeOutput();
			if (ItemStack.areItemStacksEqual(ItemStack, recipeResult)) recipes.remove(i--);
		}
	}
	public static void removeFurnace(ItemStack ItemStack)
	{
		Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();

		 Iterator iterator = recipes.entrySet().iterator();
	        Entry entry;
	        do
	        {
	            if (!iterator.hasNext())
	            {
	                return;
	            }
	            entry = (Entry)iterator.next();
	        }
	        while (!func_151397_a(ItemStack, (ItemStack)entry.getKey()));
	        recipes.remove((ItemStack)entry.getKey());
	}
	private static boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

}