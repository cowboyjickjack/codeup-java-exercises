package grades;

import rpg.Monster;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>(); // created the new hashmap

        Student sarah = new Student("Sarah", "ClownTime69");
        sarah.addGrade(90);
        sarah.addGrade(100);
        sarah.addGrade(98);

        Student arusa = new Student("Arusa", "BelovedHussain25");
        arusa.addGrade(69);
        arusa.addGrade(100);
        arusa.addGrade(94);

        Student quintyn = new Student("Quintyn", "ScaryBoy666");
        quintyn.addGrade(100);
        quintyn.addGrade(98);
        quintyn.addGrade(99);

        Student kaeden = new Student("Kaeden", "DutchMaster25");
        kaeden.addGrade(98);
        kaeden.addGrade(88);
        kaeden.addGrade(100);

        students = Map.ofEntries(
                entry("Sarah", sarah),
                entry("Arusa", arusa),
                entry("Quintyn", quintyn),
                entry("Kaeden", kaeden)
        );

        Map<String, Student> studentMap = new HashMap<>(students);

        studentMap.forEach((name, student)->{ // -> is java's version of the arrow function
            System.out.println(name + " has a " + student.getGradeAverage() + " GPA. Their GitHub username is: " + student.getUsername());
        });


    }
}
