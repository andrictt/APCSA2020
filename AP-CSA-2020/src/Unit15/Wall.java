package Unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block{
	public Wall(){
		super();
	}
	public Wall(int x, int y) {
		super(x, y);
	}
	public Wall(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	public Wall(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}
	public void draw(Graphics window) {
		super.draw(window);
	}
}