package StarFighter;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		for (int i = 0; i < size; i++) {
			int x = 50 + (i % 10) * 100;
			int y = 100;
			aliens.add(new Alien(x, y, 50, 50, 5));
		}
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll() {
		for (Alien a : aliens) {
			a.move("");
		}
	}

	public void removeDeadOnes(Ammo shots) {
		outer: for (int a = 0; a < aliens.size(); a++) {
			if (shots.hitAlien(aliens.get(a))) {
				aliens.remove(a);
				a--;
				continue outer;
			}
		}
	}

	public String toString() {
		return "";
	}
}
