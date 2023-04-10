import java.awt.*;
import java.util.Scanner;

public class consoleIOLecture {

    public static void main(String[] args) {
        String cohort = "Bigfoot";
        String timeOfDay = "afternoon";
        int week = 9;
//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        float myFloat = 123.456F;
//        System.out.printf("The number is %-11.2f let's see what's here%n", myFloat);
//        System.out.printf("Will this be a new line?");

        Scanner scanner = new Scanner(System.in); // watch for any input // can type 'sout' for shorthand
        System.out.println("Enter a word:");;
        String userInput = scanner.next();
//        System.out.println("The user entered: " + userInput); // to concatinate
        System.out.printf("Your string was: %s", userInput);
    }
}

