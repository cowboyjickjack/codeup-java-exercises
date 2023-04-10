import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) { // can just type main for intelliJ magic

        Scanner scanner = new Scanner(System.in); // can type 'Scanner', and hover over the red

        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        System.out.println("Hi, what's your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
    }
}
