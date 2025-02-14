//
// Decompiled by Procyon v0.5.30
//

package com.kentington.thaumichorizons.client.renderer.tile;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import thaumcraft.client.lib.UtilsFX;

import com.kentington.thaumichorizons.common.tiles.TileNodeMonitor;

public class TileNodeMonitorRender extends TileEntitySpecialRenderer {

    private IModelCustom model;
    private IModelCustom modelScreen;
    private static final ResourceLocation SCANNER;
    private static final ResourceLocation SCANNERSCREEN;
    static String tx1;
    static String tx2;
    static String tx3;

    public TileNodeMonitorRender() {
        this.model = AdvancedModelLoader.loadModel(TileNodeMonitorRender.SCANNER);
        this.modelScreen = AdvancedModelLoader.loadModel(TileNodeMonitorRender.SCANNERSCREEN);
    }

    public void renderTileEntityAt(final TileEntity te, final double x, final double y, final double z, final float f) {
        final TileNodeMonitor tco = (TileNodeMonitor) te;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) (y + 0.5), (float) z + 0.5f);
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        switch (tco.direction) {
            case 1: {
                GL11.glTranslatef(0.0f, -0.8f, 0.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
            case 0: {
                GL11.glTranslatef(0.0f, 0.8f, 0.0f);
                GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
            case 2: {
                GL11.glTranslatef(0.0f, 0.0f, 0.8f);
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
            case 3: {
                GL11.glTranslatef(0.0f, 0.0f, -0.8f);
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
            case 4: {
                GL11.glTranslatef(0.8f, 0.0f, 0.0f);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
            case 5: {
                GL11.glTranslatef(-0.8f, 0.0f, 0.0f);
                GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef((float) tco.rotation, 0.0f, 1.0f, 0.0f);
                break;
            }
        }
        UtilsFX.bindTexture("thaumichorizons", TileNodeMonitorRender.tx1);
        this.model.renderAll();
        GL11.glEnable(2977);
        GL11.glEnable(3042);
        GL11.glEnable(32826);
        GL11.glBlendFunc(770, 771);
        if (tco.switchy) {
            UtilsFX.bindTexture("thaumichorizons", TileNodeMonitorRender.tx3);
        } else {
            UtilsFX.bindTexture("thaumichorizons", TileNodeMonitorRender.tx2);
        }
        this.modelScreen.renderAll();
        GL11.glPopMatrix();
    }

    static {
        SCANNER = new ResourceLocation("thaumcraft", "textures/models/scanner.obj");
        SCANNERSCREEN = new ResourceLocation("thaumichorizons", "textures/models/hexagon.obj");
        TileNodeMonitorRender.tx1 = "textures/models/nodemon.png";
        TileNodeMonitorRender.tx2 = "textures/models/nodemonscreen.png";
        TileNodeMonitorRender.tx3 = "textures/models/nodemonscreenactive.png";
    }
}
