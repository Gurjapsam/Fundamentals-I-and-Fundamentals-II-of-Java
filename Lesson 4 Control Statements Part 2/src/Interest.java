// Fig. 5.6: Interest.java
// Compound-interest calculations with for.

public class Interest 
{
   public static void main( String args[] )
   {
      double amount; // amount on deposit at end of each year
      double principal = 1000.0; // initial amount before interest
      double rate = 0.05; // interest rate

      // display headers , 2 strings are being print out. for Left Justification just add - infrount of 20.
      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      // calculate amount on deposit for each of ten years
      //for is used to combine all the features of counter control repetition in first line. 
      for ( int year = 1; year <= 10; year++ ) 
      {
         // calculate new amount for specified year
         amount = principal * Math.pow( 1.0 + rate, year );

         // display the year and the amount
         System.out.printf( "%4d%,20.2f\n", year, amount );
      } // end for
   } // end main
} // end class Interest