package Unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors

	public Ball(int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height, color);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
		// TODO Auto-generated constructor stub
		super(x, y, width, height, color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.WHITE);
		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);
		// draw the ball at its new location
		draw(window, super.getColor());
	}

	public boolean equals(Object obj) {
		Ball hey = (Ball) obj;
		if (xSpeed == hey.getXSpeed() && ySpeed == hey.getYSpeed())
			return true;

		return false;
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	// add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}