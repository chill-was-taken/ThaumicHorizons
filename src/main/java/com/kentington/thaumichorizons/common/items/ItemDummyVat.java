//
// Decompiled by Procyon v0.5.30
//

package com.kentington.thaumichorizons.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDummyVat extends Item {

    @SideOnly(Side.CLIENT)
    public IIcon icon;

    public ItemDummyVat() {
        this.setCreativeTab((CreativeTabs) null);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister ir) {
        this.icon = ir.registerIcon("thaumichorizons:vat");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(final int par1) {
        return this.icon;
    }

    public String getUnlocalizedName(final ItemStack par1ItemStack) {
        return "item.vat";
    }
}
