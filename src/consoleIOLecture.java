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

        // SCANNER NOTES WITH SPACES DISCUSSED

        //        System.out.println("Hi, what's your name?");
//        String userName = scanner.next(); // Gabriella // only use .next() if you're only interested in single words
//        System.out.println("Hello, " + userName);
//
//        System.out.println("What's your full name?");
//        // since scanner listens for user input, it took the 'return' key as an input.
//        // but with .nextline(), it nullifies it, kind of like a ghost input.
//        // it absorbs the carriage return (enter key)
//        String nextLine = scanner.nextLine();
//
//        String fullName = scanner.nextLine();
//        System.out.println("Hi, " + fullName);

//        System.out.println("Please enter an integer: ");
//        int userInputInteger = scanner.nextInt();
//        System.out.println("Your integer was: " + userInputInteger);
//
//        System.out.println("What is your name?");
//        String carriageReturn = scanner.nextLine();
//        String name = scanner.nextLine();
//        System.out.println("Your name is " + name);
    }
}

