package FrqSet4;

public class OnlinePurchaseManagerRunner
{
   public static void main(String args[])
	{
		/*
		  starting sample question test cases		 
		  maker values				"ABC"	"ABC"	"XYZ"	"lmnop"	"ABC"	"ABC"
		  electronic values		true	false	 true	 false	true	false		  
		*/
		OnlinePurchaseManager op = new OnlinePurchaseManager();
		op.add( "ABC", true );
		op.add( "ABC", false );
		op.add( "XYZ", true );
		op.add( "lmnop", false );
		op.add( "ABC", true );
		op.add( "ABC", false );		
		System.out.println( op.countElectronicsByMaker( "ABC" ) );  //outs 2
		System.out.println( op.countElectronicsByMaker( "DOG" ) );  //outs 0
		System.out.println( op.countElectronicsByMaker( "lmnop" ) );  //outs 0
		System.out.println( op.countElectronicsByMaker( "XYZ" ) );  //outs 1		
		System.out.println( op.hasAdjacentEqualPair() );  //outs false
		System.out.println( op );	
			
		//additional test cases
		op.add( "APLUS", false );
		System.out.println( op.hasAdjacentEqualPair() );  //outs false

		//additional test cases		
		op.add( "ABC", false );
		op.add( "ABC", true );
		op.add( "ABC", false );
		System.out.println( op.countElectronicsByMaker( "ABC" ) );  //outs 4	
		System.out.println( op.hasAdjacentEqualPair() );  //outs true	
		System.out.println( op );																																				
	} 
}