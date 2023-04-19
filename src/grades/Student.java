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
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }



}
