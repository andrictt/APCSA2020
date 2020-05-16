package FrqSet4;

public class CheckDigitRunner
{
   public static void main(String args[])
	{
		System.out.println( CheckDigit.getCheck( 111 ) );  //outs 9	
		System.out.println( CheckDigit.isValid( 1119 ) );  //outs true	
		
		System.out.println( CheckDigit.getCheck( 12345 ) );  //outs 7	
		System.out.println( CheckDigit.isValid( 123456 ) );  //outs false
		
		System.out.println( CheckDigit.getCheck( 1337 ) );  //outs 2	
		System.out.println( CheckDigit.isValid( 13372 ) );  //outs true
																																			
		System.out.println( CheckDigit.getCheck( 5436 ) );  //outs 4	
		System.out.println( CheckDigit.isValid( 1112 ) );  //outs false
	} 
}