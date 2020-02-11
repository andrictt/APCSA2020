package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if(a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0) == 'u' || 
			   a.charAt(0) == 'A' || a.charAt(0) == 'E' || a.charAt(0) == 'I'|| a.charAt(0) == 'O' || a.charAt(0) == 'U' || 
			   a.charAt(a.length() - 1) == 'a' || a.charAt(a.length() - 1) == 'e' || a.charAt(a.length() - 1) == 'i' || a.charAt(a.length() - 1) == 'o' || a.charAt(a.length() - 1) == 'u' || 
			   a.charAt(a.length() - 1) == 'A' || a.charAt(a.length() - 1) == 'E' || a.charAt(a.length() - 1) == 'I'|| a.charAt(a.length() - 1) == 'O' || a.charAt(a.length() - 1) == 'U')
		   return "yes";
	   else
		   return "no";
	}
}