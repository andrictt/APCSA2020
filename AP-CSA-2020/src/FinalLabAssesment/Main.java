package FinalLabAssesment;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("src/FinalLabAssesment/data.txt"));
		Tree tree = new Tree(file.nextInt());
		
		
		int tempp = file.nextInt();
		for(int i = 0; i < tempp; i++) {
			tree.addApple(file.nextInt());
			int temp = file.nextInt();
			for(int j = 0; j < temp; j++) {
				tree.getApple(i).addSeed(file.nextInt());
			}
			tree.getApple(i).sortSeeds();
			System.out.print(tree.getApple(i));
			System.out.println("Index of seed size 4: " + tree.getApple(i).binarySearch(0, tree.getApple(i).getSeedCount(), 4) + "\n");
		}
		System.out.print(tree);
		tree.sortApples();
		System.out.println(tree);
		System.out.println("Index of apple size 4: " + tree.binarySearch(0, tree.getAppleCount(), 11));
	}
}
