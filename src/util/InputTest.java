package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();

//        System.out.println(userInput.getString());
//        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(4, 6));
    }
}
