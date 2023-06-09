import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) { // can just type main for intelliJ magic

        Scanner scanner = new Scanner(System.in); // can type 'Scanner', and hover over the red

        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi); //printf doesn't know the difference between
        // print and a float

//        System.out.println("Please input an integer:");
//        int userIntegerInput = scanner.nextInt();
//        System.out.println("Your integer is: " + userIntegerInput);

//        System.out.println("Please enter 3 words:");
//        String firstWord = scanner.nextLine();
//        String secondWord = scanner.nextLine();
//        String thirdWord = scanner.nextLine();
//        System.out.println("Your first word: " + firstWord);
//        System.out.println("Your second word: " + secondWord);
//        System.out.println("Your first word: " + thirdWord);

//        System.out.println("Please enter a sentence:");
//        String userSentence = scanner.nextLine();
//        System.out.println("Here's your sentence: " + userSentence);

//        System.out.println("What is the length of the Codeup Classroom?");
//        String length = scanner.nextLine(); // float vs int
//        System.out.println("What is the width of the Codeup Classroom?");
//        String width = scanner.nextLine();
//        int perimeter = (Integer.parseInt(width) * 2 + Integer.parseInt(length) * 2);
//        int area = (Integer.parseInt(length) * (Integer.parseInt(width)));
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: " + perimeter);

        System.out.println("What is your favorite quote?");
        String userQuote = scanner.nextLine();
        System.out.println("Here's your quote: " + userQuote);
        System.out.println("How many words are in that quote?");
        String numOfWords = scanner.nextLine();
        System.out.println("You said there's " + numOfWords + "words...");
        int actualAmount = (userQuote.trim().split("\\s+").length);
        System.out.println("There's actually " + actualAmount + " words...");
    }

}
