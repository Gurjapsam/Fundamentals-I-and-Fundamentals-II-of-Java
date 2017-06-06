// GradeBook class with a constructor to initialize the course name.
//Ability to initialize the course name variable at the time you created the object rather than calling set course after the fact. 
//method - Constructor, Guaranteed to call once you create the object of your class, and initialize the variable right from the moment you create them. 
// Makes it easier to work with the object.

public class GradeBook
{
   private String courseName; // course name for this GradeBook

   // constructor initializes courseName with String supplied as argument
   // Can not use Return type on constructor. because it is against the low of Constructor. ( 
   // they don't explicit return the value but they Implicit are giving the reference to object. 
   public GradeBook( String name )
   {
      courseName = name; // initializes courseName
   } // end constructor
  
   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
   } // end method displayMessage

} // end class GradeBook
