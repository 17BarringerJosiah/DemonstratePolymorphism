//<PieceWorker> -- Set Piece Worker

package demonstratePolymorphism;

public class PieceWorker extends Employee {

private double wage;
private double pieces;


//constructor
public PieceWorker(String firstName, String lastName, 
		   String socialSecurityNumber, double wage, double pieces) {
	
	super(firstName, lastName, socialSecurityNumber); 

	   if (wage < 0.0) // validate wages
	      throw new IllegalArgumentException(
	         "Wage must be >= 0.0");
	   
	   if (pieces < 0.0) // validate pieces
		      throw new IllegalArgumentException(
		         "Pieces must be >= 0.0");

	   this.wage = wage;
	   this.pieces = pieces;
}

//set wages
public void setWage(double wage)
{
   if (wage < 0.0) // validate wage
      throw new IllegalArgumentException(
         "Wage must be >= 0.0");

   this.wage = wage;
} 

//return wages
public double getWage()
{
return wage;
} 

//set pieces
public void setPieces(double pieces)
{
if (pieces < 0.0) // validate hours
   throw new IllegalArgumentException(
      "Pieces must be >= 0.0");

this.pieces = pieces;
} 

//return pieces
public double getPieces()
{
return pieces;
}       

//calculate earnings; override abstract method earnings in Employee
@Override                                                           
public double earnings()                                            
{                                                                                            
   return getWage() * getPieces();

}

//return String representation of PieceWorker object              
@Override                                                             
public String toString()                                              
{                                                                     
return String.format("piece worker: %s%n%s: $%,.2f; %s: %,.2f",
   super.toString(), "Wage", getWage(),                     
   "Pieces made", getPieces());     
}
}
