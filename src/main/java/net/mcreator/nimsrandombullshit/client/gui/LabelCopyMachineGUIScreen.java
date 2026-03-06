package net.mcreator.nimsrandombullshit.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.nimsrandombullshit.world.inventory.LabelCopyMachineGUIMenu;
import net.mcreator.nimsrandombullshit.procedures.LabelCopyMachineGUISlot3TooltipConditionProcedure;
import net.mcreator.nimsrandombullshit.procedures.LabelCopyMachineGUISlot2TooltipConditionProcedure;
import net.mcreator.nimsrandombullshit.procedures.LabelCopyMachineGUISlot1TooltipConditionProcedure;
import net.mcreator.nimsrandombullshit.procedures.LabelCopyMachineGUISlot0TooltipConditionProcedure;
import net.mcreator.nimsrandombullshit.network.LabelCopyMachineGUIButtonMessage;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LabelCopyMachineGUIScreen extends AbstractContainerScreen<LabelCopyMachineGUIMenu> {
	private final static HashMap<String, Object> guistate = LabelCopyMachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_copy;

	public LabelCopyMachineGUIScreen(LabelCopyMachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 188;
	}

	private static final ResourceLocation texture = new ResourceLocation("nims_random_bullshit:textures/screens/label_copy_machine_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (LabelCopyMachineGUISlot0TooltipConditionProcedure.execute(entity))
			if (mouseX > leftPos + 15 && mouseX < leftPos + 39 && mouseY > topPos + 45 && mouseY < topPos + 69)
				guiGraphics.renderTooltip(font, Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.tooltip_shipping_label_slot"), mouseX, mouseY);
		if (LabelCopyMachineGUISlot1TooltipConditionProcedure.execute(entity))
			if (mouseX > leftPos + 51 && mouseX < leftPos + 75 && mouseY > topPos + 18 && mouseY < topPos + 42)
				guiGraphics.renderTooltip(font, Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.tooltip_paper_slot"), mouseX, mouseY);
		if (LabelCopyMachineGUISlot2TooltipConditionProcedure.execute(entity))
			if (mouseX > leftPos + 92 && mouseX < leftPos + 116 && mouseY > topPos + 18 && mouseY < topPos + 42)
				guiGraphics.renderTooltip(font, Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.tooltip_ink_sac_slot"), mouseX, mouseY);
		if (LabelCopyMachineGUISlot3TooltipConditionProcedure.execute(entity))
			if (mouseX > leftPos + 128 && mouseX < leftPos + 152 && mouseY > topPos + 45 && mouseY < topPos + 69)
				guiGraphics.renderTooltip(font, Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.tooltip_output_copy_of_shipping_label"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("nims_random_bullshit:textures/screens/plus_sign.png"), this.leftPos + 78, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("nims_random_bullshit:textures/screens/copy_icon.png"), this.leftPos + 78, this.topPos + 50, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("nims_random_bullshit:textures/screens/right_arrow_sign.png"), this.leftPos + 42, this.topPos + 50, 0, 0, 32, 16, 32, 16);

		guiGraphics.blit(new ResourceLocation("nims_random_bullshit:textures/screens/right_arrow_sign.png"), this.leftPos + 96, this.topPos + 50, 0, 0, 32, 16, 32, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.label_label_copy_machine"), 6, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_copy = Button.builder(Component.translatable("gui.nims_random_bullshit.label_copy_machine_gui.button_copy"), e -> {
			if (true) {
				NimsRandomBullshitMod.PACKET_HANDLER.sendToServer(new LabelCopyMachineGUIButtonMessage(0, x, y, z));
				LabelCopyMachineGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 72, 46, 20).build();
		guistate.put("button:button_copy", button_copy);
		this.addRenderableWidget(button_copy);
	}
}
