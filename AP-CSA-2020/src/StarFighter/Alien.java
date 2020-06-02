package StarFighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {
	private int speed;
	private Image image;
	private int counter1 = 0;
	private int counter2 = 0;

	public Alien() {
		this(0, 0, 30, 30, 0);
	}

	public Alien(int x, int y) {
		// add code here
		this(x, y, 30, 30, 0);
	}

	public Alien(int x, int y, int s) {
		// add code here
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			e.printStackTrace();
		}
	}

	public void setSpeed(int s) {
		// add code
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		// add code here
		if (counter1%4 == 0) {
			setX(getX() + speed);
			counter2++;
			if (counter2 > 10) {
				counter1++;
				counter2 = 0;
			}
		}

		if (counter1%4 == 2) {
			setX(getX() - speed);
			counter2++;
			if (counter2 > 10) {
				counter1++;
				counter2 = 0;
			}
		}

		if (counter1%4 == 3) {
			setY(getY() - speed);
			counter2++;
			if (counter2 > 10) {
				counter1++;
				counter2 = 0;
			}
		}

		if (counter1%4 == 1) {
			setY(getY() + speed);
			counter2++;
			if (counter2 > 10) {
				counter1++;
				counter2 = 0;
			}
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}