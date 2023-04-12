package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
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
        while (true) {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                }
            } catch (NumberFormatException e) {
            }
            System.out.printf("Invalid input. Please enter an integer between %d and %d.\n", min, max);
        }
    }


}
