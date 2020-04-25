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

	public void sortSeeds() {
		for (int i = 0; i < seeds.size(); i++) {
			for (int j = 0; j < seeds.size() - 1; j++) {
				if(seeds.get(j).getSize() > seeds.get(j + 1).getSize()) {
					Seed temp = seeds.get(j);
					seeds.set(j, seeds.get(j+1));
					seeds.set(j + 1, temp);
				}
			}
		}
	}
	int binarySearch(int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (seeds.get(mid).getSize() == x) 
                return mid;
            if (seeds.get(mid).getSize() > x) 
                return binarySearch(l, mid - 1, x); 
            return binarySearch(mid + 1, r, x); 
        }
        return -1; 
    }
	public String toString() {
		System.out.println("Apple Size: " + size + "\nNumber of Seeds in apple: " + getSeedCount() + "\nAverage Seed Size in apple: " + averageSeedSize());
		System.out.println(seeds);
		return "";
	}
}
