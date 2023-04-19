package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student sarah = new Student("Sarah", "ClownTime69");

        sarah.addGrade(90);
        sarah.addGrade(69);
        sarah.addGrade(100);
        sarah.addGrade(98);

        System.out.println(sarah.getName() + " has a " + sarah.getGradeAverage() + " GPA.");



    }
}
