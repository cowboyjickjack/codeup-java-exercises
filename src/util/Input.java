package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    // Constructing an instance of this class, the scanner should be set
    // to a new instance of the scanner class
    // so everytime we make a new input object, we have a new scanner!
    // and we're defining what an input object is
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // customizes the prompt
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Do you want to continue? [Y/N]");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter an integer between %d and %d: ", min, max);
        int userInput = scanner.nextInt();

        if (userInput > min && userInput < max){
            System.out.println("You followed the rules!");
            return userInput;
        } else {
            System.out.println("PLEASE enter an integer between " + min + " and " + max + "!");
            return getInt(min, max);
        }

    }

    public double getDouble(double min, double max){
        System.out.printf("Enter an integer between %.2f and %.2f: ", min, max);
        double userInput = scanner.nextDouble();

        if (userInput > min && userInput < max){
            System.out.println("You followed the rules!");
            return userInput;
        } else {
            System.out.println("PLEASE enter an integer between " + min + " and " + max + "!");
            return getDouble(min, max);
        }
    }

    public static int getRandomInt(){
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("This method gives you a random number between 1 and 100.");
        return randomNumber;
    }

    public static int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }

}
