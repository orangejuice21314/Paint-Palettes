package com.mzoj.mzojPaint.data.client;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mzoj.mzojPaint.core.init.BlockInit;
import com.mzoj.mzojPaint.core.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;

public class ModLootTableProvider extends LootTableProvider {
	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, 
		LootContextParamSet>> loot_tables =
		ImmutableList.of(Pair.of(ModBlockLootTables::new, LootContextParamSets.BLOCK));
	
	public ModLootTableProvider(DataGenerator p_124437_) {
		super(p_124437_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables() {
		// TODO Auto-generated method stub
		return loot_tables;
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
		// TODO Auto-generated method stub
		map.forEach((id, table) -> LootTables.validate(validationtracker, id, table));
	}
	
	public static class ModBlockLootTables extends BlockLoot {
		@Override
		protected void addTables() {
			//this.dropSelf(BlockInit.WALLPAPER_SIGN.get());
			this.dropOther(BlockInit.WALLPAPER_WALLSIGN.get(), (ItemLike) ItemInit.WALLPAPER_SIGN.get());

			//this.dropSelf(BlockInit.RED_SIGN.get());
			this.dropOther(BlockInit.RED_WALLSIGN.get(), (ItemLike) ItemInit.RED_SIGN.get());
			
			//this.dropSelf(BlockInit.PINK_SIGN.get());
			this.dropOther(BlockInit.PINK_WALLSIGN.get(), (ItemLike) ItemInit.PINK_SIGN.get());

			//this.dropSelf(BlockInit.MAGENTA_SIGN.get());
			this.dropOther(BlockInit.MAGENTA_WALLSIGN.get(), (ItemLike) ItemInit.MAGENTA_SIGN.get());
			
			//this.dropSelf(BlockInit.PURPLE_SIGN.get());
			this.dropOther(BlockInit.PURPLE_WALLSIGN.get(), (ItemLike) ItemInit.PURPLE_SIGN.get());

			//this.dropSelf(BlockInit.ORANGE_SIGN.get());
			this.dropOther(BlockInit.ORANGE_WALLSIGN.get(), (ItemLike) ItemInit.ORANGE_SIGN.get());
			
			//this.dropSelf(BlockInit.YELLOW_SIGN.get());
			this.dropOther(BlockInit.YELLOW_WALLSIGN.get(), (ItemLike) ItemInit.YELLOW_SIGN.get());

			//this.dropSelf(BlockInit.LIGHT_GRAY_SIGN.get());
			this.dropOther(BlockInit.LIGHT_GRAY_WALLSIGN.get(), (ItemLike) ItemInit.LIGHT_GRAY_SIGN.get());
			
			//this.dropSelf(BlockInit.GRAY_SIGN.get());
			this.dropOther(BlockInit.GRAY_WALLSIGN.get(), (ItemLike) ItemInit.GRAY_SIGN.get());

			//this.dropSelf(BlockInit.BLACK_SIGN.get());
			this.dropOther(BlockInit.BLACK_WALLSIGN.get(), (ItemLike) ItemInit.BLACK_SIGN.get());
			
			//this.dropSelf(BlockInit.BLUE_SIGN.get());
			this.dropOther(BlockInit.BLUE_WALLSIGN.get(), (ItemLike) ItemInit.BLUE_SIGN.get());

			//this.dropSelf(BlockInit.LIGHT_BLUE_SIGN.get());
			this.dropOther(BlockInit.LIGHT_BLUE_WALLSIGN.get(), (ItemLike) ItemInit.LIGHT_BLUE_SIGN.get());
			
			//this.dropSelf(BlockInit.CYAN_SIGN.get());
			this.dropOther(BlockInit.CYAN_WALLSIGN.get(), (ItemLike) ItemInit.CYAN_SIGN.get());

			//this.dropSelf(BlockInit.GREEN_SIGN.get());
			this.dropOther(BlockInit.GREEN_WALLSIGN.get(), (ItemLike) ItemInit.GREEN_SIGN.get());
			
			//this.dropSelf(BlockInit.LIME_SIGN.get());
			this.dropOther(BlockInit.LIME_WALLSIGN.get(), (ItemLike) ItemInit.LIME_SIGN.get());

			//this.dropSelf(BlockInit.WHITE_SIGN.get());
			this.dropOther(BlockInit.WHITE_WALLSIGN.get(), (ItemLike) ItemInit.WHITE_SIGN.get());
			
			//this.dropSelf(BlockInit.BROWN_SIGN.get());
			this.dropOther(BlockInit.BROWN_WALLSIGN.get(), (ItemLike) ItemInit.BROWN_SIGN.get());
			
		}
		
		@Override
		protected Iterable<Block> getKnownBlocks() {
			// TODO Auto-generated method stub
			//TODO figure out what this does
			return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
		}
	}
	
}
