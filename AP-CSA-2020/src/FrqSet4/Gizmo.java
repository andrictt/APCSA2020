package FrqSet4;

public class Gizmo
{ 
   private String maker;
   private boolean isE;
   
   //set maker to m
   //set isE to e
   public Gizmo( String m, boolean e )
   {
   	maker = m;
   	isE = e;
   }
   
   //returns the maker of this Gizmo
   public String getMaker()
   {   
   	return maker; 
   }

   //returns true is this Gizmo is electronic
   public boolean isElectronic()
   {   
   	return isE;  
   }

   /* 
     Returns true if this Gizmo matches other Gizmo
     both this Gizmo and the other Gizmo
     must have the same instance variable values
   */
   public boolean equals(Object other)
   {   
   	Gizmo g = (Gizmo)other;
   	return getMaker().equals(g.getMaker()) && g.isE == isE;    
   }
   
   //returns all instance variables as a string
   public String toString()
   {
   	return "" + maker + " " + isE;
   }
}
