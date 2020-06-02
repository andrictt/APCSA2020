package MemorizationGame;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Button {
	String name;
	String text;

	public Button() {
		name = "";
		text = "";
	}

	public Button(String name, String text) {
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
	public abstract Color getColor();
}
