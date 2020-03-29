package FinalLabAssesment;

import java.util.ArrayList;
public class Tree {
	private ArrayList<Apple> apples;
	private int size;
	
	public Tree(){
		size = 0;
		apples = new ArrayList<Apple>();
	}
	public Tree(int size) {
		this.size = size;
		apples = new ArrayList<Apple>();
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addApple(int size)
	{
		apples.add(new Apple(size));
	}
	public int getAppleCount() {
		return apples.size();
	}
	public double averageAppleSize() {
		double count = 0;
		for(int i = 0; i < apples.size(); i++) {
			count += apples.get(i).getSize();
		}
		return count/getAppleCount();
	}
	public int getSeedCount() {
		int seedCount = 0;
		for(int i = 0; i < apples.size(); i++) {
			seedCount += apples.get(i).getSeedCount();
		}
		return seedCount;
	}
	public double averageSeedSize() {
		double count = 0;
		for(int i = 0; i < apples.size(); i++) {
			for(int j = 0; j < apples.get(i).getSeedCount(); j++) {
				count += apples.get(i).getSeed(j).getSize();
			}
		}
		return count/getSeedCount();
	}
	public String toString() {
		return "Tree Size: " + size + "\nNumber of Apples in tree: " + getAppleCount() + "\nAverage Apple Size of tree: " + averageAppleSize()  + "\nAverage Seed Size of tree: " + averageSeedSize();
	}
	public Apple getApple(int index) {
		return apples.get(index);
	}
}
