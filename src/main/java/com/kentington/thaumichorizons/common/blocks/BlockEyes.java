//
// Decompiled by Procyon v0.5.30
//

package com.kentington.thaumichorizons.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import thaumcraft.common.config.Config;

import com.kentington.thaumichorizons.common.ThaumicHorizons;

public class BlockEyes extends Block {

    public BlockEyes() {
        super(Config.taintMaterial);
        this.setHardness(0.5f);
        this.setResistance(0.5f);
        this.setBlockName("ThaumicHorizons_eye");
        this.setBlockTextureName("ThaumicHorizons:eyecluster");
        this.setCreativeTab(ThaumicHorizons.tabTH);
    }

    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Items.spider_eye;
    }

    public int quantityDroppedWithBonus(final int p_149679_1_, final Random p_149679_2_) {
        return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
    }

    public int quantityDropped(final Random p_149745_1_) {
        return 3 + p_149745_1_.nextInt(3);
    }
}
