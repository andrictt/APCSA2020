package CelebrityLab;

/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Celebrity celeb = new Celebrity("Dicaprio", "Titanic");
		System.out.println(celeb);
	}
}
