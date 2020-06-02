package MemorizationGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main implements ActionListener {
	JFrame window;
	JPanel panel;
	JPanel panel1;
	Random rand = new Random();
	static JButton[] buttons;
	Button yellowButton;
	Button redButton;
	Button blueButton;
	Button greenButton;
	static JButton changing;
	static ArrayList<Integer> pressed;
	static ArrayList<Integer> actual;
	static JLabel score;
	static int level;
	static boolean no = false;

	public static void main(String[] args) {
		new Main().start();
		while (true) {
			while (no == false) {
				System.out.print("");
			}
			update();
			while (pressed.size() != actual.size()) {
				System.out.print("");
			}
			if (pressed.equals(actual)) {
				JOptionPane.showMessageDialog(null, "Good Job :D");
				level++;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(false);
				}
				changing.setVisible(true);
				pressed.clear();
				actual.clear();
				score.setText("Level: " + level);
				try {
					FileWriter wr = new FileWriter("src/MemorizationGame/MemorizationSave.txt");
					wr.write(level + "");
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "Too bad :(");
				level = 1;
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setVisible(false);
				}
				changing.setVisible(true);
				pressed.clear();
				actual.clear();
				score.setText("Level: " + level);
				try {
					FileWriter wr = new FileWriter("src/MemorizationGame/MemorizationSave.txt");
					wr.write(level + "");
					wr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void start() {
		yellowButton = new YellowButton("Yellow Button", "Yellow Button");
		redButton = new RedButton("Red Button", "Red Button");
		blueButton = new BlueButton("Blue Button", "Blue Button");
		greenButton = new GreenButton("Green Button", "Green Button");
		pressed = new ArrayList<Integer>();
		actual = new ArrayList<Integer>();
		window = new JFrame("Memorization Game");
		panel = new JPanel();
		panel1 = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttons = new JButton[4];

		File file = new File("src/MemorizationGame/MemorizationSave.txt");
		try {

			Scanner sc = new Scanner(file);
			level = sc.nextInt();

			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		score = new JLabel("Level: " + level);

		buttons[0] = new JButton(yellowButton.getText());
		buttons[0].addActionListener(this);
		buttons[0].setBackground(yellowButton.getColor());
		panel.add(buttons[0]);

		buttons[1] = new JButton(redButton.getText());
		buttons[1].addActionListener(this);
		buttons[1].setBackground(redButton.getColor());
		panel.add(buttons[1]);

		buttons[2] = new JButton(blueButton.getText());
		buttons[2].addActionListener(this);
		buttons[2].setBackground(blueButton.getColor());
		panel.add(buttons[2]);

		buttons[3] = new JButton(greenButton.getText());
		buttons[3].addActionListener(this);
		buttons[3].setBackground(greenButton.getColor());
		panel.add(buttons[3]);

		changing = new JButton("start");
		changing.addActionListener(this);
		panel.add(changing);
		panel1.add(score);
		window.add(panel);
		panel.add(panel1);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setVisible(false);
		}
	}

	public static void update() {
		no = false;
		Random rand = new Random();
		for (int i = 0; i < level; i++) {
			int temp = rand.nextInt(4);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (temp == 0) {
				changing.setBackground(Color.YELLOW);
				System.out.println(0);
				actual.add(0);
			} else if (temp == 1) {
				changing.setBackground(Color.RED);
				System.out.println(1);
				actual.add(1);
			}

			else if (temp == 2) {
				changing.setBackground(Color.BLUE);
				System.out.println(2);
				actual.add(2);
			}

			else if (temp == 3) {
				changing.setBackground(Color.GREEN);
				System.out.println(3);
				actual.add(3);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			changing.setBackground(null);
		}
		System.out.println();
		no = false;

		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setVisible(true);
		}
		changing.setVisible(false);
	}

	public boolean Check() {
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == buttons[0]) {
			pressed.add(0);
		} else if (buttonClicked == buttons[1]) {
			pressed.add(1);
		} else if (buttonClicked == buttons[2]) {
			pressed.add(2);
		} else if (buttonClicked == buttons[3]) {
			pressed.add(3);
		}
		if (buttonClicked == changing) {
			no = true;
		}
	}
}