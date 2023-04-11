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
//        } while (i < 1000000);

        // FOR LOOP
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println("i is " + i);
//        }

//        for (long i = 2; i < 100000; i *= i) {
//            System.out.println("i is " + i);
//        }

        // FIZZBUZZ
//        for (int i = 0; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FIZZBUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(i);
//            }
//        }

        // TABLE OF POWERS
        System.out.println("Please enter an integer:");
        int userInteger = scanner.nextInt();

        for (int i = 1; i <= userInteger; i++) {
            int numSquared = (int)Math.pow(i, 2);
            int numCubed = (int)Math.pow(i, 3);
            String message = "Number: " + userInteger + " Squared: " + numSquared + " Cubed: " + numCubed;

            System.out.println(message);
        }

        System.out.println("Would you like to continue? [Y/N]");
        String userConfirmation = scanner.nextLine();
        boolean confirmation = userConfirmation.equalsIgnoreCase("Y");
        String userAnswer = scanner.nextLine();
        System.out.println(userAnswer);
    }
}
