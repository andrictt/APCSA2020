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
	public void sortApples() {
		for (int i = 0; i < apples.size(); i++) {
			for (int j = 0; j < apples.size() - 1; j++) {
				if(apples.get(j).getSize() > apples.get(j + 1).getSize()) {
					Apple temp = apples.get(j);
					apples.set(j, apples.get(j+1));
					apples.set(j + 1, temp);
				}
			}
		}
	}
	int binarySearch(int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (apples.get(mid).getSize() == x) 
                return mid;
            if (apples.get(mid).getSize() > x) 
                return binarySearch(l, mid - 1, x); 
            return binarySearch(mid + 1, r, x); 
        }
        return -1; 
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
		for(Apple i : apples) {
			System.out.print("Apple Size: " + i.getSize() + ", ");
		}
		System.out.println("Tree Size: " + size + "\nNumber of Apples in tree: " + getAppleCount() + "\nAverage Apple Size of tree: " + averageAppleSize()  + "\nAverage Seed Size of tree: " + averageSeedSize());
		return "";
	}
	public Apple getApple(int index) {
		return apples.get(index);
	}
}
