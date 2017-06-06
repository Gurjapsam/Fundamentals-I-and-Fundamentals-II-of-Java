// GradeBook class that contains a courseName instance variable 
// and methods to set and get its value.

public class GradeBook
{
	//instance variable declaration 
   private String courseName; // course name for this GradeBook, to be used Hiding the Data. 

   // method to set the course name, 
   public void setCourseName( String name )
   {
      courseName = name; // store the course name, setting the course Value in line 11
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName, also called a Local Variable.

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
      // this getCourseName is related to the string in line 8, 
      //if we have to change the name of the course name, 
      //then we just change it once in line 8, and it will reflect here.
      // if we have to debug, then it is easer to do so because we can track it back that where is this String is being used. 
   } // end method displayMessage

} // end class GradeBook
