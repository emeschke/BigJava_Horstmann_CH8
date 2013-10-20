package P8_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/19/13
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Grade {
    private int mNumericValue;
    private String grade;

    //Constructor with a string input.
    public Grade(String input){
        grade = input;
    }
    //Switch statement returns the numeric grade associated with a  letter grade.  If it is a string that is not a grade
    //it return -1, which should allow the user to figure out their input is incorrect.
    public double getNumeric(){
        switch(grade){
            case "A": return 4.0;
            case "A-": return 3.7;
                    //break;
            case "B+": return 3.3;
                    //break;
            case "B": return 3.0;
                    //break;
            case "B-": return 2.7;
                    //break;
            case "C+": return 2.3;
                    //break;
            case "C": return 2.0;
                    //break;
            case "C-": return 1.7;
                    //break;
            case "D+": return 1.3;
                    //break;
            case "D": return 1.0;
                    //break;
            case "D-": return .7;
                    //break;
            case "F+": return .3;
                    //break;
            case "F": return 0.0;
                    //break;
            default: return -1;
        }
    }
}