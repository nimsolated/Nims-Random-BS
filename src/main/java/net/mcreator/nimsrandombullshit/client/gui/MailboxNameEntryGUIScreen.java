package net.mcreator.nimsrandombullshit.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.nimsrandombullshit.world.inventory.MailboxNameEntryGUIMenu;
import net.mcreator.nimsrandombullshit.network.MailboxNameEntryGUIButtonMessage;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MailboxNameEntryGUIScreen extends AbstractContainerScreen<MailboxNameEntryGUIMenu> {
	private final static HashMap<String, Object> guistate = MailboxNameEntryGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox mailbox_name_field;
	Button button_done;

	public MailboxNameEntryGUIScreen(MailboxNameEntryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		mailbox_name_field.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (mailbox_name_field.isFocused())
			return mailbox_name_field.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		mailbox_name_field.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String mailbox_name_fieldValue = mailbox_name_field.getValue();
		super.resize(minecraft, width, height);
		mailbox_name_field.setValue(mailbox_name_fieldValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_name_entry_gui.label_mailbox_name"), 51, 48, -16724839, false);
	}

	@Override
	public void init() {
		super.init();
		mailbox_name_field = new EditBox(this.font, this.leftPos + 30, this.topPos + 62, 118, 18, Component.translatable("gui.nims_random_bullshit.mailbox_name_entry_gui.mailbox_name_field"));
		mailbox_name_field.setMaxLength(32767);
		guistate.put("text:mailbox_name_field", mailbox_name_field);
		this.addWidget(this.mailbox_name_field);
		button_done = Button.builder(Component.translatable("gui.nims_random_bullshit.mailbox_name_entry_gui.button_done"), e -> {
			if (true) {
				NimsRandomBullshitMod.PACKET_HANDLER.sendToServer(new MailboxNameEntryGUIButtonMessage(0, x, y, z));
				MailboxNameEntryGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 93, 46, 20).build();
		guistate.put("button:button_done", button_done);
		this.addRenderableWidget(button_done);
	}
}
