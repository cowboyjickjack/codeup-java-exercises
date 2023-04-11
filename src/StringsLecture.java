import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = "Hello";
        // STRING COMPARISON
//        System.out.println(message.equalsIgnoreCase("hello"));
//        System.out.println(message.startsWith("He"));
//        System.out.println(message.endsWith("llo"));

        // LENGTH
        String password = "password";
        // length will run as a method instead, compared to JS
//        System.out.println(password.length() > 7);

        // STRING MANIPULATION
        String message2 = " This is my message ";
        int position = message2.indexOf("my"); // this does count the spaces
//        System.out.println(position);
//        System.out.println(message2.replace("my", "your")); // same as in js
//        System.out.println(message2.toLowerCase());
//        System.out.println(message2.toUpperCase());
//        System.out.println(message2.trim()); // gets rid of the spaces from beginning and end
//        System.out.println(message2.charAt(2));

        // good to use for user inputs that unintentionally put a space
//        System.out.println("Would you like to continue? [Y/N]");
//        String userChoice = scanner.nextLine();
//        System.out.println(userChoice.trim().equalsIgnoreCase("y"));



    }
}
