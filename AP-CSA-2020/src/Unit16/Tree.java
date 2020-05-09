package Unit16;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape {
	public Tree(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		// add code here to make a tree
		window.setColor(Color.WHITE);
		window.fillRect(super.getXPos(), super.getYPos() - 50, super.getWidth() * 2, super.getHeight());
		window.fillRect(super.getXPos() + super.getWidth()/2, super.getYPos(), super.getWidth(), super.getHeight() * 2);
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}