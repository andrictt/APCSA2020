package FinalLabAssesment;

import java.util.ArrayList;
public class Apple {
	private ArrayList<Seed> seeds;
	private int size;
	
	public Apple(){
		size = 0;
		seeds = new ArrayList<Seed>();
	}
	public Apple(int size) {
		this.size = size;
		seeds = new ArrayList<Seed>();
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addSeed(int size)
	{
		seeds.add(new Seed(size));
	}
	
	public Seed getSeed(int index) {
		return seeds.get(index);
	}
	public int getSeedCount() {
		return seeds.size();
	}
	public double averageSeedSize() {
		double count = 0;
		for(int i = 0; i < seeds.size(); i++) {
			count += seeds.get(i).getSize();
		}
		return count/getSeedCount();
	}
	public String toString() {
		return "Apple Size: " + size + "\nNumber of Seeds in apple: " + getSeedCount() + "\nAverage Seed Size in apple: " + averageSeedSize();
	}
}
