import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to say to Bob? :)");
        String userInput = scanner.nextLine();

        while (!userInput.isBlank()) {
            if (userInput.trim().toLowerCase().endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.trim().toLowerCase().endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isBlank()) {
                System.out.println("Fine. Be that way!"); // doesn't come back around?? to fix
                break;
            } else {
                System.out.println("Whatever.");
            }
            userInput = scanner.nextLine();
        }

    }
}
