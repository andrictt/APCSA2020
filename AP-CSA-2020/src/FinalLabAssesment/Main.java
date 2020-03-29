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
				System.out.println(tree.getApple(i).getSeed(j));
			}
			System.out.println(tree.getApple(i));
		}
		System.out.print(tree);
	}
}
