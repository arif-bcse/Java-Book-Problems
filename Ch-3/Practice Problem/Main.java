
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GradeBook G = new GradeBook("Java", "Nur Quarishi");
    //G.setCourseName("Java");
    G.getCourseName();
    G.displayMessage();
    G.getCourseInstructor();
    G.display();
    }
}
