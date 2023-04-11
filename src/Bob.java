import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to say to Bob? :)");
        String userInput = scanner.nextLine();

        if (userInput.trim().toLowerCase().endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.trim().toLowerCase().endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.trim().isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
