package FinalLabAssesment;

public class Seed {
	private int size;
	
	public Seed(){
		size = 0;
	}
	public Seed(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return "Seed Size: " + size;
	}
}
