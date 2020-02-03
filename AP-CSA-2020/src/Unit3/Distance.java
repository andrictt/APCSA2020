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

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		this.xOne = x1;
		this.yOne = y1;
		this.xTwo = x2;
		this.yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		this.xOne = x1;
		this.yOne = y1;
		this.xTwo = x2;
		this.yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(yTwo-yOne, 2) + Math.pow(xTwo-xOne, 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return Double.toString(distance);
	}
}
