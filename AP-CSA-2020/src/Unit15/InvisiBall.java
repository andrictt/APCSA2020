package Unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisiBall extends Ball {

	// constructors
	public InvisiBall() {
		super();
	}

	public InvisiBall(int x, int y) {

		super(x, y);

	}

	public InvisiBall(int x, int y, int xSpd, int ySpd) {

		super(x, y, xSpd, ySpd);

	}

	public InvisiBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {

		super(x, y, wid, ht, col, xSpd, ySpd);

	}

	public Color randomColor() {
		Random rand = new Random();
		int hey = rand.nextInt(100);
		if (hey == 20) {
			if (super.getColor() == Color.black) {
				return Color.white;
			}
			if (super.getColor() == Color.white) {
				return Color.black;
			}
		}
		return super.getColor();
	}

	public void moveAndDraw(Graphics window) {
		setColor(randomColor());
		super.moveAndDraw(window);
	}
}