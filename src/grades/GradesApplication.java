package grades;

import rpg.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<String, Student>();

        Student alice = new Student("Sarah");
        alice.addGrade(90);
        alice.addGrade(80);
        alice.addGrade(85);
        students.put("ClownTime69", alice);

        Student bob = new Student("Arusa");
        bob.addGrade(75);
        bob.addGrade(85);
        bob.addGrade(95);
        students.put("RIPArusa", bob);

        Student charlie = new Student("Quintyn");
        charlie.addGrade(80);
        charlie.addGrade(70);
        charlie.addGrade(75);
        students.put("ScaryBoy666", charlie);

        Student dave = new Student("Zion");
        dave.addGrade(85);
        dave.addGrade(90);
        dave.addGrade(95);
        students.put("ZionLion", dave);

        // Print out each student's name and average grade
        for (String username : students.keySet()) {
            Student student = students.get(username);
            System.out.println(username + ": " + student.getName() + "'s average grade is " + student.getGradeAverage());
        }

        System.out.println("Welcome to the Grades Application!");
        System.out.println("Here are the GitHub usernames of our students:");

        for (String username : students.keySet()) {
            System.out.print(username + " | ");
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a GitHub username to see more information:");
            String username = input.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                double average = student.getGradeAverage();
                System.out.println("\nName: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average grade: " + average);
            } else {
                System.out.println("\nSorry, no users with that username were found.");
            }

            System.out.println("\nWould you like to see another student? (y/n)");
            String choice = input.nextLine();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("\nThank you for using the Grades Application!");
    }

}
