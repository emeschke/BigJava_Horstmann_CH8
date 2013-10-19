package P8_8;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    String name;
    int totalScore;
    int quizCount;

    //Constructor that constructs an object with the student's name and a zero score.
    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addQuiz(int score){
        totalScore += score;
        quizCount += 1;
    }

    public double getAverageScore(){
        return 1.0*totalScore/quizCount;
    }
}
