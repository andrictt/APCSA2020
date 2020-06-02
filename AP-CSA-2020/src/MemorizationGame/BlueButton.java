package MemorizationGame;

import java.awt.Color;

public class BlueButton extends Button{
	private String name;
	private String text;

	public BlueButton() {
		name = "";
		text = "";
	}

	public BlueButton(String name, String text) {
		this.name = name;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	@Override
	public Color getColor() {
		return Color.BLUE;
	}	
}