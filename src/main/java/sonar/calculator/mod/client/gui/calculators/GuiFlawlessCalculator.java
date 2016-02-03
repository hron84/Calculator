package sonar.calculator.mod.client.gui.calculators;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import sonar.calculator.mod.common.containers.ContainerFlawlessCalculator;
import sonar.core.common.item.InventoryItem;
import sonar.core.utils.helpers.FontHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiFlawlessCalculator extends GuiContainer {
	private ResourceLocation texture = new ResourceLocation("Calculator:textures/gui/flawlesscalculator.png");

	public GuiFlawlessCalculator(EntityPlayer player, InventoryPlayer inv, InventoryItem inventoryItem) {
		super(new ContainerFlawlessCalculator(player, inv, inventoryItem));
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		FontHelper.textCentre(FontHelper.translate("item.FlawlessCalculator.name"), xSize, 8, 0);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
		drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
}
