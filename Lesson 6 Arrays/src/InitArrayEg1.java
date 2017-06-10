public class InitArrayEg1 {

	public static void main(String[] args) {
		// Fig. 7.3: InitArray.java
		// Initializing the elements of an array with an array initializer.
		{
		      // initializer list specifies the value for each element
		      int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

		      System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
		   
		      // output each array element's value, arrays have bounds checking built-in.
		      // is any change is being made, eg- if you make it <= in the array, that will trigger that there is limit starting from 0 till 9 not 10. 
		      // with that change, if you will run the array, it will give you error message stating that you did not reach the limit. 
		      // other words it should be exactly how it is stated in the begging of the array. 
		      for ( int counter = 0; counter < array.length; counter++ )
		         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
		   } // end main
		} // end class InitArray


}
