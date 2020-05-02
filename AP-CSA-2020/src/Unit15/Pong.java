package Unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Ball ball1;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int player1Score = 0;
	private int player2Score = 0;
	private Wall rightWall;
	private Wall leftWall;
	private Wall topWall;
	private Wall bottomWall;

	public Pong() {
		// set up all variables related to the game
		ball = new SpeedUpBall(300, 300, 10, 10, Color.blue, 1, 1);
		ball1 = new BlinkyBall(300, 300, 10, 10, Color.blue, 1, 1);
		leftPaddle = new Paddle(40, 200, 10, 100, Color.red, 3);
		rightPaddle = new Paddle(730, 200, 10, 100, Color.red, 3);
		rightWall = new Wall(780, 0, 0, 1000);
		leftWall = new Wall(0, 0, 0, 1000);
		topWall = new Wall(0, 0, 1000, 0);
		bottomWall = new Wall(0, 550, 1000, 0);

		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		ball1.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		graphToBack.drawString("P1: " + player1Score + "P2: " + player2Score, 300, 500);

		// see if ball hits left wall or right wall
		if (ball.didCollideRight(rightWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("P1: " + player1Score + "P2: " + player2Score, 300, 500);
			player1Score++;
			ball.test(graphToBack);
			ball.setXSpeed(1);
			ball.setYSpeed(1);
			ball.setPos(400, 400);
		}
		if (ball.didCollideLeft(leftWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("P1: " + player1Score + "P2: " + player2Score, 300, 500);
			player2Score++;
			ball.test(graphToBack);
			ball.setXSpeed(1);
			ball.setYSpeed(1);
			ball.setPos(400, 400);
		}
		if (ball1.didCollideRight(rightWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("P1: " + player1Score + "P2: " + player2Score, 300, 500);
			player1Score++;
			ball1.test(graphToBack);
			ball1.setPos(400, 400);
		}
		if (ball1.didCollideLeft(leftWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("P1: " + player1Score + "P2: " + player2Score, 300, 500);
			player2Score++;
			ball1.test(graphToBack);
			ball1.setPos(400, 400);
		}
		// see if the ball hits the top or bottom wall
		if (ball.didCollideBottom(bottomWall) || ball.didCollideTop(topWall)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if (ball1.didCollideBottom(bottomWall) || ball1.didCollideTop(topWall)) {
			ball1.setYSpeed(-ball1.getYSpeed());
		}

		// see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle) && !(ball.didCollideBottom(leftPaddle)) && !(ball.didCollideTop(leftPaddle))) {
			ball.setXSpeed(-ball.getXSpeed() + 1);
			if(ball.getYSpeed() > 0) {
				ball.setYSpeed(ball.getYSpeed() + 1);
			}
			else {
				ball.setYSpeed(ball.getYSpeed() - 1);
			}
		}
		
		if (ball1.didCollideLeft(leftPaddle) && !(ball1.didCollideBottom(leftPaddle)) && !(ball1.didCollideTop(leftPaddle))) {
			ball1.setXSpeed(-ball1.getXSpeed());
		}

		// see if the ball hits the right paddle
		if (ball.didCollideRight(rightPaddle) && !(ball.didCollideBottom(rightPaddle)) && !(ball.didCollideTop(rightPaddle))) {
			ball.setXSpeed(-ball.getXSpeed() - 1);
			if(ball.getYSpeed() > 0) {
				ball.setYSpeed(ball.getYSpeed() + 1);
			}
			else {
				ball.setYSpeed(ball.getYSpeed() - 1);
			}
			
		}
		if (ball1.didCollideRight(rightPaddle) && !(ball1.didCollideBottom(rightPaddle)) && !(ball1.didCollideTop(rightPaddle))) {
			ball1.setXSpeed(-ball1.getXSpeed());
			
		}

		// see if the paddles need to be moved
		if (keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}

		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}

		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}