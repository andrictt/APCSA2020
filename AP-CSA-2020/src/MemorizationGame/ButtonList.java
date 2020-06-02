package MemorizationGame;

import java.util.ArrayList;

public class ButtonList {
	private ArrayList<Button> buttonList;

	public ButtonList() {
		buttonList = new ArrayList<Button>();
	}

	public void add(Button button) {
		buttonList.add(button);
	}

	public void remove(int index) {
		buttonList.remove(index);
	}
}
