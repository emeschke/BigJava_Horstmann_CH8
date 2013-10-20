package P8_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 This one was confusing.  I followed Prof Gerber's pseudocode in Piazza.  We create the objects for each grade and then
 call the object to add it to the student.  The student class can then iterate over the different grades.
 It seems like there is a more intuitive way to implement this one, but I'm not sure what it is.


 */
public class Driver {
    public static void main(String[] args) {
        //Create grade objects
        Student student1 = new Student("Eric Meschke");
        Grade a = new Grade("A");
        Grade aMinus = new Grade("A-");
        Grade bplus = new Grade("B+");
        Grade b = new Grade("B");
        Grade c = new Grade("C");
        Grade d = new Grade("D");

        //Add grades to student
        student1.addGrade(a);
        student1.addGrade(aMinus);
        student1.addGrade(a);
        student1.addGrade(b);
        student1.addGrade(b);
        student1.addGrade(c);
        student1.addGrade(aMinus);
        student1.addGrade(a);
        student1.addGrade(a);
        student1.addGrade(b);

        //Print grades
        System.out.println(student1.getmName());
        System.out.println("GPA is: " + student1.getGpa());


    }
}
