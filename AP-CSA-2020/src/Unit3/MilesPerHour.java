package Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andric Li
//Date - 2/2/20
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		this.distance = dist;
		this.hours = hrs;
		this.minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double time = (double)(hours)+(minutes/(double)(60));
		mph = distance/time;
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + Math.round(mph) + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in " + hours + " hour and " + minutes + " minutes = " + Math.round(mph) + " MPH.";
	}
}