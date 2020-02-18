package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		/*
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		*/
		System.out.println(Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.starRating("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
		System.out.println(Review.starRating("src/ConsumerLab/26WestReview.txt"));
	}
}