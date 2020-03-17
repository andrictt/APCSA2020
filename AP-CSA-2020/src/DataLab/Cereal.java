package DataLab;

public class Cereal {
	String cereal;
	int Carbohydrates;
	int protein;
	char type;
	int fat;
	int fiber;
	int sugar;
	int potassium;
	int vitamins;
	int shelf;
	double weight;
	double cups;
	double rating;
	
	public Cereal(String cereal, int carbohydrates, int protein, char type, int fat, int fiber, int sugar,
			int potassium, int vitamins, int shelf, double weight, double cups, double rating) {
		
		this.cereal = cereal;
		Carbohydrates = carbohydrates;
		this.protein = protein;
		this.type = type;
		this.fat = fat;
		this.fiber = fiber;
		this.sugar = sugar;
		this.potassium = potassium;
		this.vitamins = vitamins;
		this.shelf = shelf;
		this.weight = weight;
		this.cups = cups;
		this.rating = rating;
	}
	
	public String getCereal() {
		return cereal;
	}
	public void setCereal(String cereal) {
		this.cereal = cereal;
	}
	public int getCarbohydrates() {
		return Carbohydrates;
	}
	public void setCarbohydrates(int carbohydrates) {
		Carbohydrates = carbohydrates;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getFiber() {
		return fiber;
	}
	public void setFiber(int fiber) {
		this.fiber = fiber;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public int getPotassium() {
		return potassium;
	}
	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}
	public int getVitamins() {
		return vitamins;
	}
	public void setVitamins(int vitamins) {
		this.vitamins = vitamins;
	}
	public int getShelf() {
		return shelf;
	}
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCups() {
		return cups;
	}
	public void setCups(double cups) {
		this.cups = cups;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String toString() {
		return "The cereal is " + cereal + " and it has "+ Carbohydrates+" Carbohydrates and "+ protein+" Protein";
	}
	public static void main(String[] args) {
		Cereal bran100 = new Cereal("100% bran",5,4,'C',1, 10, 6, 280, 25, 3, 1, 0.33,68.402973 );
		Cereal creamOfWheat = new Cereal("Cream of Wheat",21,3,'H',0, 1, 0, -1, 0, 2, 1, 1,64.533816);
		System.out.println(bran100);
		System.out.println(creamOfWheat);
	}
}