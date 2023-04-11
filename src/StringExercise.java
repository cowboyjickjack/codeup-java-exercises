import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String quote = "We don't need no education";
//        System.out.println(quote.replace("education", "thought control"));

        String quote2 = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(quote2);

        String quote3 = "In windows, the main drive is usually C:\\";
//        System.out.println(quote3);

        String quote4 = "I can do backslashes \\, double backslashes \\\\," +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(quote4);
    }
}
