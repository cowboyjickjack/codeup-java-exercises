package grades;

import rpg.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {

//        Map<String, Student> students = new HashMap<>(); // created the new hashmap
//
////        Student sarah = new Student("Sarah");
////        Student arusa = new Student("Arusa");
////        Student quintyn = new Student("Quintyn");
////        Student kaeden = new Student("Kaeden");
//
//        students.put("ClownTime69", new Student("Sarah"));
//        students.get("ClownTime69").addGrade(90);
//        students.get("ClownTime69").addGrade(100);
//        students.get("ClownTime69").addGrade(98);
////        System.out.println(students.get("ClownTime69").getGradeAverage());
//
//        students.put("BelovedHussain25", new Student("Arusa"));
//        students.get("BelovedHussain25").addGrade(69);
//        students.get("BelovedHussain25").addGrade(100);
//        students.get("BelovedHussain25").addGrade(94);
//
//        students.put("ScaryBoy666", new Student("Quintyn"));
//        students.get("ScaryBoy666").addGrade(100);
//        students.get("ScaryBoy666").addGrade(98);
//        students.get("ScaryBoy666").addGrade(99);
//
//        students.put("DutchMaster25", new Student("Deaden"));
//        students.get("DutchMaster25").addGrade(98);
//        students.get("DutchMaster25").addGrade(88);
//        students.get("DutchMaster25").addGrade(100);
//
////        students = Map.ofEntries(
////                entry("Sarah", sarah),
////                entry("Arusa", arusa),
////                entry("Quintyn", quintyn),
////                entry("Kaeden", kaeden)
////        );
////        studentMap.forEach((name, student)->{ // -> is java's version of the arrow function
////            System.out.println(name + " has a " + student + " GPA. Their GitHub Username is: " + student.getUsername());
////        });
//
////        for (Map.Entry<String, Student> studentEntry : studentMap.entrySet()){
////            System.out.println("Student: " + studentEntry.getKey());
////            System.out.println("GPA: " + studentEntry.getValue().getGradeAverage());
////        }
//
//        for (String username : students.keySet()) {
//            System.out.println(username);
//            System.out.println(students.get(username).getName());
//            System.out.println(students.get(username).getGradeAverage());
//        }
//
////        Map<String, Student> studentMap = new HashMap<>(students);
//
//        System.out.println("Welcome!");
//        System.out.println("Here are the GitHub usernames of our students:");
//        System.out.println(students.keySet());

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
