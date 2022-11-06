package net.mzoj.mzojpaint.dataGen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.mzoj.mzojpaint.init.BlockInit;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //fabricDataGenerator.addProvider(ModelGenerator::new);
    }

    public static class ModelGenerator extends FabricModelProvider {
        public ModelGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            //blockStateModelGenerator.registerSimpleCubeAll(BlockInit.CANVAS_BLOCK);
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        }
    }

}
