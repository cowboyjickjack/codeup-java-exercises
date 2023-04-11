import java.util.Scanner;

public class controlStatementsLoopsLecture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==================== boolean expressions
        // >, >=, <, <=, ==, !=
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage == 2.0); // duh, false

        // ==================== logical expressions
        // &&, ||, &, |, !
//        System.out.println(discountPercentage > 3 || discountPercentage == 2.3);
        // || or is looking for the first true statement, then true

        // ==================== string comparison // HAVE to use double quotes
//        System.out.println("Continue? [Y/N]");
//        String userInput = scanner.nextLine();

//        boolean confirmation = userInput.equalsIgnoreCase("Y");
//        System.out.println(confirmation);


        // ==================== control structures
        // if, else if, else
//        if (condition) {
//            // conditional code
//        }
//        if (discountPercentage > 2) {
//            System.out.println("Discount percentage is, in fact, definitely greater than 2.");
//        } // don't need ; after }


        // switch
//        int caseSwitch = 1;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                break; // no break, it falls through
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break; // don't really need
//        }

        // while loop
//        int i = 0;
//        while (i <= 10) {
//            System.out.println("i is " + i);
//            i++; // no increment = forever loop!!!
//        }

        // do while loop
//        int i = 0;
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i <= 10);

        // for loop // MOST VERSITLE LOOP IN PROGRAMMING
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("i is " + i);
//        }

        // break and continue
        for (int i = 0; i <= 10; i++) {
            System.out.println("i is " + i);
            if (i == 5) {
                break; // stops and breaks out of the loop
                // continue skips the iteration - not much use for it in javascript or java
            }
        }

    }
}
