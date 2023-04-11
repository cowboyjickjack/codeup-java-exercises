import java.util.Scanner;

public class MethodsLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(sayHello("Gabriella"));
//        System.out.println(sayHello());
//        System.out.println(returnThree());
//        System.out.println(highFive("Sarah", "Gabriella"));
//        System.out.println(highFive("Sarah"));
        String myName = "Gabriella";
        System.out.println(changeName(myName)); // it's not actually REFORMING the name, only the VALUE
        count(5);
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

    public static String highFive(String name) {
        return name + " gives no one a high five. He has no friends.";
    }
    public static String highFive(String name1, String name2) {
        return name1 + " gives " + name2 + " a high five!";
    }

    // it's not actually REFORMING the name, only the VALUE
    public static String changeName(String name) {
        name = "Roberto";
        return name;
    }

    // RECURSION
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

}
