package grades;

import rpg.Monster;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>(); // created the new hashmap

        Student sarah = new Student("Sarah");
        Student arusa = new Student("Arusa");
        Student quintyn = new Student("Quintyn");
        Student kaeden = new Student("Kaeden");

        students.put("ClownTime69", new Student("Sarah"));
        students.get("ClownTime69").addGrade(90);
        students.get("ClownTime69").addGrade(100);
        students.get("ClownTime69").addGrade(98);
        System.out.println(students.get("ClownTime69").getGradeAverage());

        students.put("BelovedHussain25", new Student("Arusa"));
        students.get("BelovedHussain25").addGrade(69);
        students.get("BelovedHussain25").addGrade(100);
        students.get("BelovedHussain25").addGrade(94);

        students.put("ScaryBoy666", new Student("Quintyn"));
        students.get("ScaryBoy666").addGrade(100);
        students.get("ScaryBoy666").addGrade(98);
        students.get("ScaryBoy666").addGrade(99);

        students.put("DutchMaster25", new Student("Deaden"));
        students.get("DutchMaster25").addGrade(98);
        students.get("DutchMaster25").addGrade(88);
        students.get("DutchMaster25").addGrade(100);

        students = Map.ofEntries(
                entry("Sarah", sarah),
                entry("Arusa", arusa),
                entry("Quintyn", quintyn),
                entry("Kaeden", kaeden)
        );

        Map<String, Student> studentMap = new HashMap<>(students);

//        studentMap.forEach((name, student)->{ // -> is java's version of the arrow function
//            System.out.println(name + " has a " + student + " GPA. Their GitHub Username is: " + student.getUsername());
//        });

        for (Map.Entry<String, Student> studentEntry : studentMap.entrySet()){
            System.out.println("Student: " + studentEntry.getKey());
//            System.out.println("GPA: " + studentEntry.getValue().getGradeAverage());
        }

//        for (String username : students.keySet()) {
//            Student student = students.get(username);
//            System.out.println(username + ": " + student.getName() + "'s average grade is " + student.getGradeAverage());
//        }


    }
}
