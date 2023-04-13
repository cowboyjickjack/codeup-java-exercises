package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    // Constructing an instance of this class, the scanner should be set
    // to a new instance of the scanner class
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no: ");
        String userInput = scanner.nextLine();
        return userInput.equals("y") || userInput.equals("yes");
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

}
