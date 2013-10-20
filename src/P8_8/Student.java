package P8_8;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String mName;
    private ArrayList<Grade> mGrades = new ArrayList<Grade>();
    private int countGrades = 0;

    //Constructor with the student's name.
    public Student(String name){
        mName = name;
    }

    //Get GPA.  Iterate through the list and use the Grade class to look up the GPA associated with each grade.
    public double getGpa(){
        int counter = 0;
        double totalGpa = 0;
        for (int i = 0; i < mGrades.size(); i++) {
            totalGpa += mGrades.get(i).getNumeric();
            counter += 1;
        }
        return totalGpa/counter;
    }

    //Add grades to the mGrades arrayList
    public void addGrade(Grade grd){
        mGrades.add(grd);
        countGrades += 1;
    }

    //Get name
    public String getmName(){
        return mName;
    }


}
