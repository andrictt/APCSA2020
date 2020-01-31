package Unit0;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andric Li
//Date - 1/30/20
//Class - APCSA
//Lab  - AsciiArt

public class AsciiBox {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 14; k++) {
					System.out.print(Plus());
				}
				System.out.println();
			}
			for (int j = 0; j < 2; j++) {
				try {
					for (int k = 0; k < 14; k++) {
						if (i >= 3) {
							throw new Exception();
						}
						System.out.print(A());
					}
					System.out.println();
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
		}
	}

	public static String Plus() {
		return "+";
	}

	public static String A() {
		return "A";
	}
}