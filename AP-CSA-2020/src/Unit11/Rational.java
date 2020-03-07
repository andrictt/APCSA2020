package Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	public int num;
	public int dem;
	//write two constructors

	public Rational() {
		num = 1;
		dem = 1;
	}
	public Rational(int i, int j) {
		num = i;
		dem = j;
	}
	//write a setRational method
	public void setRational(int i, int j) {
		num = i;
		dem = j;
	}

	//write  a set method for numerator and denominator
	
	public void setNum(int i) {
		num = i;
	}
	
	public void setDem(int j) {
		dem = j;
	}

	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		if(this.dem == other.dem) {
			int hey = this.num + other.dem;
			this.setNum(hey);
		}
		else {
			int hey = (this.num * other.dem + other.num * this.dem);
			int heyy = (this.dem * other.dem);
			
			this.setNum(hey);
			this.setDem(heyy);
		}
		reduce();
		
	}

	private void reduce()
	{
		int temp = num;
		this.num = temp/gcd(temp,dem);
		this.dem = this.dem/gcd(temp,dem);
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for(int i = min; i > 1; i--) {
			if(numOne % i == 0 && numTwo % i == 0) {
				return i;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum() {
		return num;
	}
	
	public int getDem() {
		return dem;
	}
	
	public boolean equals( Object obj)
	{
		this.reduce();
		((Rational) obj).reduce();
		if(this.num == ((Rational) obj).getNum() && this.dem == ((Rational) obj).getDem()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double hey = (double)this.num/this.dem;
		double heyy = (double)other.num/other.dem;
		if(hey > heyy) {
			return 1;
		}
		else if(hey == heyy) {
			return 0;
		}
		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + dem;
	}
	
}