import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // WHILE
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        // DO WHILE
//        int i = 0;
//        do {
//            System.out.println("i is " + i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2; // needs to be the long integer
//        do {
//            System.out.println("i is " + i);
//            i*=i;
//        } while (i < 1_000_000);  // can separate with underscores to make it easier to read

        // FOR LOOP
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

//        for (long i = 2; i < 1_000_000; i *= i) {
//            System.out.println("i is " + i);
//        }

        // FIZZBUZZ (USED A LOT IN TECHNICAL INTERVIEWS... BE VOCAL, AND VERBALIZE YOUR THOUGHT PROCESS!!!)
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // TABLE OF POWERS

        System.out.println("What number would you like to go up to?");
        int userInteger = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userInteger; i++) {
            int numSquared = (int) Math.pow(i, 2);
            int numCubed = (int) Math.pow(i, 3);

            System.out.println(userInteger + "      |" + numSquared + "      |" + numCubed);

        }

    }
}
