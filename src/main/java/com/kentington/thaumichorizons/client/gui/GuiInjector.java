//
// Decompiled by Procyon v0.5.30
//

package com.kentington.thaumichorizons.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import thaumcraft.client.lib.UtilsFX;

import com.kentington.thaumichorizons.common.container.ContainerInjector;

public class GuiInjector extends GuiContainer {

    public GuiInjector(final EntityPlayer p) {
        super((Container) new ContainerInjector(p));
        this.xSize = 175;
        this.ySize = 191;
    }

    protected void drawGuiContainerBackgroundLayer(final float p_146976_1_, final int p_146976_2_,
            final int p_146976_3_) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        UtilsFX.bindTexture(new ResourceLocation("thaumichorizons", "textures/gui/guiinjector.png"));
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int var5 = (this.width - this.xSize) / 2;
        final int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
}
