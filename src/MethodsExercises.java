import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(division(5, 2));
//        int userInput = getInteger(0, 10);
//        long factorial = getFactorial(userInput);
//        System.out.println("Factorial => " + factorial);

//        System.out.println(factorial(4));
        int diceSides = getDiceSide();
        System.out.println(rollDice(diceSides));

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static float division(float num1, float num2) {
        return num1 / num2;
    }
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between " + min + " and " + max);
        int userNumber = scanner.nextInt();

        if (userNumber >= min && userNumber <= max) {
            System.out.println("Good choice.");
            return userNumber;
        } else {
            System.out.println("You didn't follow the rules!");
            return getInteger(min, max);
        }
    }
    public static long getFactorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int getDiceSide() {
        int userChoice = getInteger(4, 20);
        return userChoice;
    }

    public static int randomNumber(int min, int max) {
        int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }

    public static String rollDice(int sides) {
        System.out.println("Do you want to roll the dice? [Y/N]");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1, sides);
            return "The first dice rolled a " + result1 + ". The second dice rolled on " + result2 + ". The total is " + (result1 + result2) + ".";
        }
        return "Fine. Go away.";
    }
}
