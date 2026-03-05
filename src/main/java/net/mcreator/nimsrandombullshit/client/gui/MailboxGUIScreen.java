package net.mcreator.nimsrandombullshit.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.nimsrandombullshit.world.inventory.MailboxGUIMenu;
import net.mcreator.nimsrandombullshit.network.MailboxGUIButtonMessage;
import net.mcreator.nimsrandombullshit.NimsRandomBullshitMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MailboxGUIScreen extends AbstractContainerScreen<MailboxGUIMenu> {
	private final static HashMap<String, Object> guistate = MailboxGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox outbox_x_coord;
	EditBox outbox_y_coord;
	EditBox outbox_z_coord;
	Button button_send;

	public MailboxGUIScreen(MailboxGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 360;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("nims_random_bullshit:textures/screens/mailbox_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		outbox_x_coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		outbox_y_coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		outbox_z_coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (outbox_x_coord.isFocused())
			return outbox_x_coord.keyPressed(key, b, c);
		if (outbox_y_coord.isFocused())
			return outbox_y_coord.keyPressed(key, b, c);
		if (outbox_z_coord.isFocused())
			return outbox_z_coord.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		outbox_x_coord.tick();
		outbox_y_coord.tick();
		outbox_z_coord.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String outbox_x_coordValue = outbox_x_coord.getValue();
		String outbox_y_coordValue = outbox_y_coord.getValue();
		String outbox_z_coordValue = outbox_z_coord.getValue();
		super.resize(minecraft, width, height);
		outbox_x_coord.setValue(outbox_x_coordValue);
		outbox_y_coord.setValue(outbox_y_coordValue);
		outbox_z_coord.setValue(outbox_z_coordValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_gui.label_inbox"), 98, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_gui.label_outbox"), 161, 14, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_gui.label_x"), 224, 19, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_gui.label_y"), 224, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nims_random_bullshit.mailbox_gui.label_z"), 224, 64, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		outbox_x_coord = new EditBox(this.font, this.leftPos + 234, this.topPos + 15, 118, 18, Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_x_coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_x_coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_x_coord").getString());
				else
					setSuggestion(null);
			}
		};
		outbox_x_coord.setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_x_coord").getString());
		outbox_x_coord.setMaxLength(32767);
		guistate.put("text:outbox_x_coord", outbox_x_coord);
		this.addWidget(this.outbox_x_coord);
		outbox_y_coord = new EditBox(this.font, this.leftPos + 234, this.topPos + 38, 118, 18, Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_y_coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_y_coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_y_coord").getString());
				else
					setSuggestion(null);
			}
		};
		outbox_y_coord.setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_y_coord").getString());
		outbox_y_coord.setMaxLength(32767);
		guistate.put("text:outbox_y_coord", outbox_y_coord);
		this.addWidget(this.outbox_y_coord);
		outbox_z_coord = new EditBox(this.font, this.leftPos + 234, this.topPos + 60, 118, 18, Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_z_coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_z_coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_z_coord").getString());
				else
					setSuggestion(null);
			}
		};
		outbox_z_coord.setSuggestion(Component.translatable("gui.nims_random_bullshit.mailbox_gui.outbox_z_coord").getString());
		outbox_z_coord.setMaxLength(32767);
		guistate.put("text:outbox_z_coord", outbox_z_coord);
		this.addWidget(this.outbox_z_coord);
		button_send = Button.builder(Component.translatable("gui.nims_random_bullshit.mailbox_gui.button_send"), e -> {
			if (true) {
				NimsRandomBullshitMod.PACKET_HANDLER.sendToServer(new MailboxGUIButtonMessage(0, x, y, z));
				MailboxGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 269, this.topPos + 86, 46, 20).build();
		guistate.put("button:button_send", button_send);
		this.addRenderableWidget(button_send);
	}
}
