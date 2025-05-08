public class GradeBook
{
    private String courseName; 
    private String courseInstructor;

    public void setCourseInstructor(String name){
        courseInstructor = name;
    }

    public String getCourseInstructor()
    {
        return courseInstructor;
    }
    public void display (){
        System.out.printf("This course is presented by : %s\n", getCourseInstructor());
    }

    public GradeBook( String courseName , String InstructorName )
    {
        this.courseName = courseName;
        this.courseInstructor = InstructorName;
    }
    
    public void setCourseName( String name )
    {
        courseName = name; 
    } 

  
    public String getCourseName()
    {
        return courseName;
    } 

    
    public void displayMessage()
    {
        
        System.out.printf( "Welcome to the grade book for %s!\n", getCourseName() );

    } 
}
