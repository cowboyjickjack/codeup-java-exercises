package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student() {
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    public String setName(String name){
       return this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        return 0; // change
    }


}
