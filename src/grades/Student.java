package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private ArrayList<Integer> grades; // keeps it as an empty array, so you can add to it :)

    public Student(String name, String username) {
        this.name = name;
        this.username = username;
        grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    public String setName(String name){
       return this.name = name;
    }

    public String getUsername(){
        return username;
    }

    public String setUsername(){
        return this.username = username;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
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
