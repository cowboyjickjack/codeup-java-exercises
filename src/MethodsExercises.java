import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(division(5, 2));
        getInteger(0, 100);

//        System.out.println(factorial(4));
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
            System.out.println("Wow, you did it.");
        } else if (userNumber >= max || userNumber <= min) {
            System.out.println("You didn't follow the rules!");
        }
        return userNumber;
    }

//    public static long factorial(int n) {
//        long fact = 1;
//        for (int i = 2; i <= n; i++) {
//            fact = fact * i;
//        }
//        return fact;
//    }

}
