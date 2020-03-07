package Unit10;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore7
{
	private ArrayList<Toy> toyList;
	public String myName(){
		System.out.println("First Name Last Name");
		return null;
	}
	public ToyStore7()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] no = toys.split(" ");
		ArrayList<String> hey = new ArrayList<String>();
  		for (int i = 0; i < no.length; i++) {
  			if (!hey.contains(no[i])) { 
                hey.add(no[i]); 
            }
		}
  		List<String> list2 = new ArrayList<String>();
        for(String text:no) {
           list2.add(text);
        }
  		ArrayList<Integer> heyy = new ArrayList<Integer>();
  		for (int i = 0; i < hey.size(); i++) {
  			heyy.add(Collections.frequency(list2, hey.get(i)));
		}
  		for (int i = 0; i < heyy.size(); i++) {
			toyList.add(new Toy(hey.get(i)));
			toyList.get(i).setCount(heyy.get(i));
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
			if(nm == toyList.get(i).getName()) {
				return toyList.get(i);
			}
		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < toyList.size(); i++) {
           list2.add(toyList.get(i).getCount());
        }
  		return toyList.get(list2.indexOf(Collections.max(list2))).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int j = 0; j < toyList.size(); j++) {
  		for (int i = 0; i < toyList.size() - 1; i++) {
			if(toyList.get(i).getCount() > toyList.get(i + 1).getCount()){
				int temp = toyList.get(i + 1).getCount();
				toyList.get(i + 1).setCount(toyList.get(i).getCount());
				toyList.get(i).setCount(temp);
				
				String temp1 = toyList.get(i + 1).getName();
				toyList.get(i + 1).setName(toyList.get(i).getName());
				toyList.get(i).setName(temp1);
			}
		}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}