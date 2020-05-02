package Unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball {

	// constructors
	public BlinkyBall() {
		super();
	}

	public BlinkyBall(int x, int y) {

		super(x, y);

	}

	public BlinkyBall(int x, int y, int xSpd, int ySpd) {

		super(x, y, xSpd, ySpd);

	}

	public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {

		super(x, y, wid, ht, col, xSpd, ySpd);

	}

	public Color randomColor() {
		Random rand = new Random();
		int r = rand.nextInt(255); // use Math.random()
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		return new Color(r, g, b);
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.WHITE);
		setX(getX() + getXSpeed());
		// setY
		setY(getY() + getYSpeed());
		// draw the ball at its new location

		draw(window, randomColor());
	}
}