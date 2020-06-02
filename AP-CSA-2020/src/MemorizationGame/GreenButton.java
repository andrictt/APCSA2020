package MemorizationGame;

import java.awt.Color;

public class GreenButton extends Button{
	private String name;
	private String text;

	public GreenButton() {
		name = "";
		text = "";
	}

	public GreenButton(String name, String text) {
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

	public Color getColor() {
		return Color.GREEN;
	}	
}