package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		System.out.println("Total Sentiment value for simpleReview: " + Review.totalSentiment("src/ConsumerLab/simpleReview.txt"));
		System.out.println("Star Rating for simpleReview: " + Review.starRating("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.fakeReview("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.positiveReview("src/ConsumerLab/simpleReview.txt"));
		System.out.println(Review.negativeReview("src/ConsumerLab/simpleReview.txt"));
		System.out.println("Total Sentiment value for 26WestReview: " + Review.totalSentiment("src/ConsumerLab/26WestReview.txt"));
		System.out.println("Star Rating for 26WestReview: " + Review.starRating("src/ConsumerLab/26WestReview.txt"));
	}
}