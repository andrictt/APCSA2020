package Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		int[] hey = new int[pups.length];
		for(int i = 0; i < pups.length; i++) {
			hey[i] = pups[i].getAge();
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < hey.length; i++) {
            if (hey[i] > max) {
                max = hey[i]; 
                index = i;
            }
		}
		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		int[] hey = new int[pups.length];
		for(int i = 0; i < pups.length; i++) {
			hey[i] = pups[i].getAge();
		}
		int min = pups[0].getAge();
		int index = 0;
		for (int i = 0; i < hey.length; i++) {
            if (hey[i] < min) {
                min = hey[i]; 
                index = i;
            }
		}
		return pups[index].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}