import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ask Bob a question! :)");
        String userInput = scanner.nextLine();

        if (userInput.trim().toLowerCase().endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.trim().toLowerCase().endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("") || (userInput.equals(" "))) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
