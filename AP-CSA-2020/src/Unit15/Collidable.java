package Unit15;

//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public interface Collidable
{
	public abstract boolean didCollideLeft(Object obj);
	public boolean didCollideRight(Object obj);
	boolean didCollideTop(Object obj);
	boolean didCollideBottom(Object obj);
}