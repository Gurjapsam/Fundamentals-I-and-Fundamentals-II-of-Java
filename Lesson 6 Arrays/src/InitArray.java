// Fig. 7.2: InitArray.java
// Creating an array.
// about one dimensional array
public class InitArray 
{
   public static void main( String args[] )
   {   //array[] - integer array, one dimensional 
	   // we can also put the [] after type name - int[]- this is stating that type of 
	   // every variable in this declaration is integer one dimensional array. 
	   // its good to not to declare more than one variable in any declaration. eg-int array[] is good. 
      int array[]; // declare array named array

      array = new int[ 10 ]; // create the space for array
      // array know their own length, because you have specified them in the [10] 
      // from now on array is going to hold on to the value of 10. 
      // to resize the array, then you have to allocate (make) new array and sign the size to that array.      
      // arrays- every element of the array gets its default initializr value, (every element will be set to 0 Implicit by the opration on line 10)   
      
      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings, 
      
      
      // output each array element's value 
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   } // end main
} // end class InitArray 