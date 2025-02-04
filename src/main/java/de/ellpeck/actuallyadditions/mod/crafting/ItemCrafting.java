/*
 * This file ("ItemCrafting.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.crafting;

// TODO: [port] MOVE TO DATA_GENERATOR
@Deprecated
public final class ItemCrafting {
    //
    //    public static void init() {
    //
    //        //Advanced Goggles
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemEngineerGogglesAdvanced), " R ", "IGI", 'R', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.REDSTONE.ordinal()), 'I', new ItemStack(Blocks.IRON_BARS), 'G', new ItemStack(InitItems.itemEngineerGoggles));
    //        recipeGogglesAdvanced = RecipeUtil.lastIRecipe();
    //
    //        //Goggles
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemEngineerGoggles), " R ", "IGI", 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), 'I', new ItemStack(Blocks.IRON_BARS), 'G', "blockGlass");
    //        recipeGoggles = RecipeUtil.lastIRecipe();
    //
    //        //Laser Invis Upgrade
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemLaserUpgradeInvisibility, 4), "GGG", "RCR", "GGG", 'G', "blockGlassBlack", 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.COAL.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeLaserUpgradeInvisibility = RecipeUtil.lastIRecipe();
    //
    //        //Laser Range Upgrade
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemLaserUpgradeRange, 2), "GGC", "RCR", "CGG", 'R', new ItemStack(Items.COMPASS), 'G', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeLaserUpgradeRange = RecipeUtil.lastIRecipe();
    //
    //        //Filling Wand
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemFillingWand), "IPI", "DCD", " B ", 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'P', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.LAPIS.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()), 'D', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'B', new ItemStack(InitItems.itemBatteryTriple));
    //        recipeFillingWand = RecipeUtil.lastIRecipe();
    //
    //        //Bag
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemBag), "SLS", "SCS", "LVL", 'S', new ItemStack(Items.STRING), 'L', new ItemStack(Items.LEATHER), 'C', "chestWood", 'V', new ItemStack(InitBlocks.blockCrystal, 1, TheCrystals.COAL.ordinal()));
    //        recipeBag = RecipeUtil.lastIRecipe();
    //
    //        //Void Bag
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemVoidBag), new ItemStack(InitItems.itemBag), new ItemStack(Items.ENDER_PEARL), new ItemStack(Blocks.OBSIDIAN), new ItemStack(InitBlocks.blockCrystal, 1, TheCrystals.COAL.ordinal()));
    //        recipeVoidBag = RecipeUtil.lastIRecipe();
    //
    //        //Lens
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.LENS.ordinal()), "GGG", "GBG", "GGG", 'G', "blockGlass", 'B', "gemQuartzBlack");
    //        recipeLens = RecipeUtil.lastIRecipe();
    //
    //        //Black Dye
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemMisc, 2, TheMiscItems.BLACK_DYE.ordinal()), new ItemStack(InitBlocks.blockBlackLotus));
    //        recipeBlackDye = RecipeUtil.lastIRecipe();
    //
    //        //Booklet
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemBooklet), new ItemStack(InitItems.itemCanolaSeed), new ItemStack(Items.PAPER));
    //        recipeBook = RecipeUtil.lastIRecipe();
    //
    //        //Clearing NBT Storage
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemLaserWrench), new ItemStack(InitItems.itemLaserWrench));
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemPhantomConnector), new ItemStack(InitItems.itemPhantomConnector));
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemSpawnerChanger), new ItemStack(InitItems.itemSpawnerChanger));
    //
    //        //Chest To Crate Upgrade
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemChestToCrateUpgrade), " W ", "WCW", " W ", 'C', new ItemStack(InitBlocks.blockGiantChest), 'W', "plankWood");
    //        recipeChestToCrateUpgrade = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemSmallToMediumCrateUpgrade), " W ", "WCW", " W ", 'C', new ItemStack(InitBlocks.blockGiantChestMedium), 'W', "plankWood");
    //        recipeSmallToMediumCrateUpgrade = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMediumToLargeCrateUpgrade), " W ", "WCW", " W ", 'C', new ItemStack(InitBlocks.blockGiantChestLarge), 'W', "plankWood");
    //        recipeMediumToLargeCrateUpgrade = RecipeUtil.lastIRecipe();
    //
    //        //Disenchanting Lens
    //        ItemStack crystal = new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal());
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemDisenchantingLens), new ItemStack(Blocks.ENCHANTING_TABLE), crystal.copy(), crystal.copy(), crystal.copy(), crystal.copy(), crystal.copy(), crystal.copy(), crystal.copy(), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.LENS.ordinal()));
    //        recipeDisenchantingLens = RecipeUtil.lastIRecipe();
    //
    //        //Mining Lens
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMiningLens), "DGI", "CLB", "QPE", 'D', "gemDiamond", 'G', "ingotGold", 'I', "ingotIron", 'C', "coal", 'L', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.LENS.ordinal()), 'B', "gemQuartzBlack", 'Q', "gemQuartz", 'P', "gemLapis", 'E', "gemEmerald");
    //        recipeMiningLens = RecipeUtil.lastIRecipe();
    //
    //        //Killer Lens
    //        ItemStack enchBook = new ItemStack(Items.ENCHANTED_BOOK);
    //        ItemEnchantedBook.addEnchantment(enchBook, new EnchantmentData(Enchantments.SHARPNESS, 5));
    //
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemMoreDamageLens), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(InitItems.itemDamageLens), enchBook);
    //        recipeLensMoreDeath = RecipeUtil.lastIRecipe();
    //
    //        //Filter
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemFilter), "III", "IQI", "III", 'I', new ItemStack(Blocks.IRON_BARS), 'Q', "gemQuartzBlack");
    //        recipeFilter = RecipeUtil.lastIRecipe();
    //
    //        //Crate Keeper
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemCrateKeeper), "WIW", "IQI", "WIW", 'I', "ingotIron", 'W', "plankWood", 'Q', "gemQuartzBlack");
    //        recipeCrateKeeper = RecipeUtil.lastIRecipe();
    //
    //        //Spawner Changer
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemSpawnerChanger), "MSM", "SDS", "MSM", 'M', new ItemStack(Items.MAGMA_CREAM), 'S', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.SPAWNER_SHARD.ordinal()), 'D', new ItemStack(InitBlocks.blockCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()));
    //        recipeSpawnerChanger = RecipeUtil.lastIRecipe();
    //
    //        //Laser Wrench
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemLaserWrench), "C  ", " S ", "  S", 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()), 'S', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()));
    //        recipeLaserWrench = RecipeUtil.lastIRecipe();
    //
    //        //Rice Stuff
    //        RecipeHandler.addOreDictRecipe(new ItemStack(Items.PAPER, 3), "R  ", " R ", "  R", 'R', new ItemStack(InitItems.itemFoods, 1, TheFoods.RICE.ordinal()));
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 4, TheMiscItems.RICE_SLIME.ordinal()), " R ", "RBR", " R ", 'R', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RICE_DOUGH.ordinal()), 'B', Items.WATER_BUCKET);
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 4, TheMiscItems.RICE_SLIME.ordinal()), " R ", "RBR", " R ", 'R', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RICE_DOUGH.ordinal()), 'B', new ItemStack(Items.POTIONITEM));
    //
    //        //Leaf Blower
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemLeafBlower), " F", "IP", "IC", 'F', new ItemStack(Items.FLINT), 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'P', new ItemStack(Blocks.PISTON), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeLeafBlower = RecipeUtil.lastIRecipe();
    //
    //        //Drill
    //        ItemStack lightBlueDrill = new ItemStack(InitItems.itemDrill, 1, TheColoredLampColors.LIGHT_BLUE.ordinal());
    //        RecipeHandler.addOreDictRecipe(lightBlueDrill.copy(), "DDD", "CRC", "III", 'D', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()), 'R', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.DRILL_CORE.ordinal()), 'I', new ItemStack(InitBlocks.blockCrystal, 1, TheCrystals.IRON.ordinal()));
    //        recipeDrill = RecipeUtil.lastIRecipe();
    //
    //        for (int i = 0; i < 16; i++) {
    //            if (i != TheColoredLampColors.LIGHT_BLUE.ordinal()) {
    //                new RecipeKeepDataShapeless(new ResourceLocation(ActuallyAdditions.MODID, "dril_color_change" + i), new ItemStack(InitItems.itemDrill, 1, i), new ItemStack(InitItems.itemDrill, 1, Util.WILDCARD), lightBlueDrill.copy(), "dye" + TheColoredLampColors.values()[i].oreName);
    //                RECIPES_DRILL_COLORING.add(RecipeUtil.lastIRecipe());
    //            }
    //        }
    //
    //        //Drill Core
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.DRILL_CORE.ordinal()), "ICI", "CRC", "ICI", 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL.ordinal()), 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), 'I', new ItemStack(InitBlocks.blockCrystal, 1, TheCrystals.IRON.ordinal()));
    //        recipeDrillCore = RecipeUtil.lastIRecipe();
    //
    //        //Tele Staff
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemTeleStaff), " FE", " S ", "SB ", 'F', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()), 'E', new ItemStack(InitBlocks.blockMisc, 1, TheMiscBlocks.ENDERPEARL_BLOCK.ordinal()), 'S', new ItemStack(InitBlocks.blockMisc, 1, TheMiscBlocks.ENDER_CASING.ordinal()), 'B', new ItemStack(InitItems.itemBattery, 1, Util.WILDCARD));
    //        recipeStaff = RecipeUtil.lastIRecipe();
    //
    //        //Drill Speed
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeSpeed), "ISI", "SRS", "ISI", 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'S', Items.SUGAR, 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()));
    //        recipeDrillSpeedI = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeSpeedII), "ISI", "SCS", "ISI", 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'S', Items.SUGAR, 'C', Items.CAKE);
    //        recipeDrillSpeedII = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeSpeedIII), "ISI", "SFS", "ISI", 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'S', Items.SUGAR, 'F', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()));
    //        recipeDrillSpeedIII = RecipeUtil.lastIRecipe();
    //
    //        //Drill Fortune
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeFortune), "ISI", "SRS", "ISI", 'I', Blocks.GLOWSTONE, 'S', Items.REDSTONE, 'R', new ItemStack(InitBlocks.blockCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()));
    //        recipeDrillFortuneI = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeFortuneII), "ISI", "SRS", "ISI", 'I', Blocks.GLOWSTONE, 'S', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.REDSTONE.ordinal()), 'R', new ItemStack(InitBlocks.blockMisc, 1, TheMiscBlocks.ENDER_CASING.ordinal()));
    //        recipeDrillFortuneII = RecipeUtil.lastIRecipe();
    //
    //        //Drill Size
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeThreeByThree), "DID", "ICI", "DID", 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'D', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL.ordinal()));
    //        recipeDrillThree = RecipeUtil.lastIRecipe();
    //
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeFiveByFive), "DID", "ICI", "DID", 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'D', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeDrillFive = RecipeUtil.lastIRecipe();
    //
    //        //Drill Silk Touch
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeSilkTouch), "DSD", "SCS", "DSD", 'D', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.EMERALD.ordinal()), 'S', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeDrillSilk = RecipeUtil.lastIRecipe();
    //
    //        //Drill Placing
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemDrillUpgradeBlockPlacing), "CEC", "RAR", "CEC", 'C', "cobblestone", 'E', Items.PAPER, 'A', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL.ordinal()), 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()));
    //        recipeDrillPlacing = RecipeUtil.lastIRecipe();
    //
    //        //Battery
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemBattery), " R ", "ICI", "III", 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeBattery = RecipeUtil.lastIRecipe();
    //
    //        //Double Battery
    //        new RecipeKeepDataShaped(new ResourceLocation(ActuallyAdditions.MODID, "double_battery"), new ItemStack(InitItems.itemBatteryDouble), new ItemStack(InitItems.itemBattery), " R ", "ICI", "III", 'R', new ItemStack(InitItems.itemBattery), 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeBatteryDouble = RecipeUtil.lastIRecipe();
    //
    //        //Magnet Ring
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMagnetRing), "RIB", "IOI", "BIR", 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()), 'I', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.IRON.ordinal()), 'B', new ItemStack(Items.DYE, 1, 4), 'O', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RING.ordinal()));
    //        recipeMagnetRing = RecipeUtil.lastIRecipe();
    //
    //        //Growth Ring
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemGrowthRing), "SIS", "IOI", "SIS", 'S', new ItemStack(Items.WHEAT_SEEDS), 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'O', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RING.ordinal()));
    //        recipeGrowthRing = RecipeUtil.lastIRecipe();
    //
    //        //Water Ring
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemWaterRemovalRing), "BIB", "IOI", "BIB", 'B', new ItemStack(Items.WATER_BUCKET), 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()), 'O', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RING.ordinal()));
    //        recipeWaterRing = RecipeUtil.lastIRecipe();
    //
    //        //Triple Battery
    //        new RecipeKeepDataShaped(new ResourceLocation(ActuallyAdditions.MODID, "triple_battery"), new ItemStack(InitItems.itemBatteryTriple), new ItemStack(InitItems.itemBatteryDouble), " R ", "ICI", "III", 'R', new ItemStack(InitItems.itemBatteryDouble), 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeBatteryTriple = RecipeUtil.lastIRecipe();
    //
    //        //Quadruple Battery
    //        new RecipeKeepDataShaped(new ResourceLocation(ActuallyAdditions.MODID, "quadruple_battery"), new ItemStack(InitItems.itemBatteryQuadruple), new ItemStack(InitItems.itemBatteryTriple), " R ", "ICI", "III", 'R', new ItemStack(InitItems.itemBatteryTriple), 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.IRON.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeBatteryQuadruple = RecipeUtil.lastIRecipe();
    //
    //        //Quintuple Battery
    //        new RecipeKeepDataShaped(new ResourceLocation(ActuallyAdditions.MODID, "quintuple_battery"), new ItemStack(InitItems.itemBatteryQuintuple), new ItemStack(InitItems.itemBatteryQuadruple), " R ", "ICI", "III", 'R', new ItemStack(InitItems.itemBatteryQuadruple), 'I', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeBatteryQuintuple = RecipeUtil.lastIRecipe();
    //
    //        //Bat Wings
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemWingsOfTheBats), "WNW", "WDW", "WNW", 'W', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.BAT_WING.ordinal()), 'N', new ItemStack(InitBlocks.blockCrystalEmpowered, 1, TheCrystals.DIAMOND.ordinal()), 'D', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.ENDER_STAR.ordinal()));
    //        recipeWings = RecipeUtil.lastIRecipe();
    //
    //        //Coil
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL.ordinal()), " R ", "RIR", " R ", 'I', ConfigBoolValues.SUPER_DUPER_HARD_MODE.isEnabled() ? new ItemStack(InitItems.itemMisc, 1, TheMiscItems.ENDER_STAR.ordinal()) : "gemQuartzBlack", 'R', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.REDSTONE.ordinal()));
    //        recipeCoil = RecipeUtil.lastIRecipe();
    //
    //        //Cup
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.CUP.ordinal()), "S S", "SCS", "SSS", 'S', "stone", 'C', "cropCoffee");
    //        recipeCup = RecipeUtil.lastIRecipe();
    //
    //        //Resonant Rice
    //        if (!OreDictionary.getOres("nuggetEnderium", false).isEmpty()) {
    //            RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemResonantRice), new ItemStack(InitItems.itemFoods, 1, TheFoods.RICE.ordinal()), "nuggetEnderium", Items.GUNPOWDER);
    //        }
    //
    //        //Advanced Coil
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()), "GGG", "GCG", "GGG", 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL.ordinal()), 'G', "nuggetGold");
    //        recipeCoilAdvanced = RecipeUtil.lastIRecipe();
    //
    //        //Advanced Leaf Blower
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemLeafBlowerAdvanced), " F", "DP", "DC", 'F', new ItemStack(Items.FLINT), 'D', new ItemStack(InitItems.itemCrystal, 1, TheCrystals.DIAMOND.ordinal()), 'P', new ItemStack(Blocks.PISTON), 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.COIL_ADVANCED.ordinal()));
    //        recipeLeafBlowerAdvanced = RecipeUtil.lastIRecipe();
    //
    //        //Phantom Connector
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemPhantomConnector), "YE", "EY", "S ", 'Y', Items.ENDER_EYE, 'E', Items.ENDER_PEARL, 'S', "stickWood");
    //        recipePhantomConnector = RecipeUtil.lastIRecipe();
    //
    //        //Player Probe
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemPlayerProbe), "A A", "AIA", "RHR", 'A', new ItemStack(Blocks.IRON_BARS), 'R', new ItemStack(InitItems.itemCrystalEmpowered, 1, TheCrystals.REDSTONE.ordinal()), 'H', new ItemStack(Items.SKULL, 1, 1), 'I', new ItemStack(Items.IRON_HELMET));
    //        recipePlayerProbe = RecipeUtil.lastIRecipe();
    //
    //        //Quartz
    //        GameRegistry.addSmelting(new ItemStack(InitBlocks.blockMisc, 1, TheMiscBlocks.ORE_QUARTZ.ordinal()), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), 1F);
    //
    //        //Knife
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemKnife), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.KNIFE_BLADE.ordinal()), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.KNIFE_HANDLE.ordinal()));
    //        recipeKnife = RecipeUtil.lastIRecipe();
    //
    //        //Crafter on a Stick
    //        RecipeHandler.addShapelessOreDictRecipe(new ItemStack(InitItems.itemCrafterOnAStick), new ItemStack(Blocks.CRAFTING_TABLE), new ItemStack(Items.SIGN));
    //
    //        //Tiny Coal
    //        if (ConfigBoolValues.TINY_COAL_STUFF.isEnabled()) {
    //            RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemMisc, 8, TheMiscItems.TINY_COAL.ordinal()), new ItemStack(Items.COAL));
    //            recipeTinyCoal = RecipeUtil.lastIRecipe();
    //            RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemMisc, 8, TheMiscItems.TINY_CHAR.ordinal()), new ItemStack(Items.COAL, 1, 1));
    //            recipeTinyChar = RecipeUtil.lastIRecipe();
    //            RecipeHandler.addOreDictRecipe(new ItemStack(Items.COAL), "CCC", "C C", "CCC", 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.TINY_COAL.ordinal()));
    //            RecipeHandler.addOreDictRecipe(new ItemStack(Items.COAL, 1, 1), "CCC", "C C", "CCC", 'C', new ItemStack(InitItems.itemMisc, 1, TheMiscItems.TINY_CHAR.ordinal()));
    //        }
    //
    //        //Rice Seeds
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemRiceSeed), new ItemStack(InitItems.itemFoods, 1, TheFoods.RICE.ordinal()));
    //
    //        //Canola Seeds
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemCanolaSeed), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.CANOLA.ordinal()));
    //
    //        //Rings
    //        initPotionRingRecipes();
    //
    //        //Ingots from Dusts
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.IRON.ordinal()), new ItemStack(Items.IRON_INGOT), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.GOLD.ordinal()), new ItemStack(Items.GOLD_INGOT), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.DIAMOND.ordinal()), new ItemStack(Items.DIAMOND), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.EMERALD.ordinal()), new ItemStack(Items.EMERALD), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.LAPIS.ordinal()), new ItemStack(Items.DYE, 1, 4), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.QUARTZ_BLACK.ordinal()), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.QUARTZ.ordinal()), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.QUARTZ.ordinal()), new ItemStack(Items.QUARTZ), 1F);
    //        GameRegistry.addSmelting(new ItemStack(InitItems.itemDust, 1, TheDusts.COAL.ordinal()), new ItemStack(Items.COAL), 1F);
    //
    //    }
    //
    //    public static void initPotionRingRecipes() {
    //        RecipeHandler.addOreDictRecipe(new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RING.ordinal()), "IGI", "GDG", "IGI", 'G', "ingotGold", 'I', "ingotIron", 'D', "dustGlowstone");
    //        recipeRing = RecipeUtil.lastIRecipe();
    //
    //        addRingRecipeWithStack(ThePotionRings.SPEED.craftingItem, ThePotionRings.SPEED.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.HASTE.craftingItem, ThePotionRings.HASTE.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.STRENGTH.craftingItem, ThePotionRings.STRENGTH.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.JUMP_BOOST.craftingItem, ThePotionRings.JUMP_BOOST.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.REGEN.craftingItem, ThePotionRings.REGEN.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.RESISTANCE.craftingItem, ThePotionRings.RESISTANCE.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.FIRE_RESISTANCE.craftingItem, ThePotionRings.FIRE_RESISTANCE.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.WATER_BREATHING.craftingItem, ThePotionRings.WATER_BREATHING.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.INVISIBILITY.craftingItem, ThePotionRings.INVISIBILITY.ordinal());
    //        addRingRecipeWithStack(ThePotionRings.NIGHT_VISION.craftingItem, ThePotionRings.NIGHT_VISION.ordinal());
    //    }
    //
    //    public static void addRingRecipeWithStack(ItemStack mainStack, int meta) {
    //        ItemStack potion = new ItemStack(Items.POTIONITEM);
    //        PotionUtils.addPotionToItemStack(potion, PotionTypes.AWKWARD);
    //
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemPotionRing, 1, meta), mainStack, mainStack, mainStack, mainStack, new ItemStack(InitBlocks.blockCrystal, 1, TheCrystals.DIAMOND.ordinal()), new ItemStack(Items.NETHER_WART), potion, new ItemStack(InitItems.itemMisc, 1, TheMiscItems.RING.ordinal()));
    //        RECIPES_POTION_RINGS.add(RecipeUtil.lastIRecipe());
    //
    //        RecipeHandler.addShapelessRecipe(new ItemStack(InitItems.itemPotionRingAdvanced, 1, meta), new ItemStack(InitItems.itemPotionRing, 1, meta), new ItemStack(InitItems.itemMisc, 1, TheMiscItems.ENDER_STAR.ordinal()));
    //        RECIPES_POTION_RINGS.add(RecipeUtil.lastIRecipe());
    //    }
}
