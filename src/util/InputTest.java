package util;

public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();

//        System.out.println(userInput.getString());
//        System.out.println(userInput.getString("Say something"));

//        System.out.println(userInput.yesNo());

//        System.out.println(userInput.getInt(1, 10));
//        System.out.println(userInput.getDouble(0.1, 9.9));
        System.out.println(userInput.calculateAverage(new int[]{5, 4, 3}));
    }
}
