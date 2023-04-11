import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sayHello("Gabriella"));
        System.out.println(sayHello());
        System.out.println(returnThree());
    }

    // HAVE to be specific and say what the datatypes will be
    // Helps when things get crazy

    public static String sayHello() {     // METHOD OVERLOADING // conditionals?
        String message = "Hello... I have no idea who you are...";
        return message;
    }
    public static String sayHello(String name) {
        String message = "Hello, " + name + "!";
        return message;
    }

    // Don't NEED parameters inside
    public static int returnThree() {
        return 3;
    }

}
