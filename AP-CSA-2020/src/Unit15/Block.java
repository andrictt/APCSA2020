package Unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		this.width = 10;
		this.height = 10;
		xPos = 100;
		yPos = 150;
		this.color = Color.BLACK;
	}

	public Block(int width, int height) {
		this.width = width;
		this.height = height;
		xPos = 0;
		yPos = 0;
		this.color = Color.BLACK;
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int width, int height, Color color) {
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Block(int x, int y, int width, int height) {
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = Color.BLACK;
	}

	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}

	public void setColor(Color col) {
		color = col;
	}

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block hey = (Block) obj;
		if (xPos == hey.getX() && yPos == hey.getY() && width == hey.getWidth() && height == hey.getHeight()
				&& color.equals(hey.getColor()))
			return true;
		return false;
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	// add the other get methods

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}