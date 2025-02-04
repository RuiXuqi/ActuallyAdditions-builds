/*
 * This file ("IEnergyDisplay.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public interface IEnergyDisplay {

    @OnlyIn(Dist.CLIENT)
    CustomEnergyStorage getEnergyStorage();

    @OnlyIn(Dist.CLIENT)
    boolean needsHoldShift();
}
