public class Recursion {
    public static void main(String[] args) {

    }

    private static int multiplication(int num1, int num2) {
        int total = num1;
        if (num2 == 0) {
            return 0;
        }
        return total + multiplication(num1, num2 -1);
    }

    private static int sumOfNumbersMethod(int number) {
        if (number != 0) {
            return number + sumOfNumbersMethod(number - 1); // counts down from the users number, one at a time, and add them together
            // all until it is 0
        } else {
            return number;
        }
    }

    private static boolean isPalindromeMethod(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() -1)) { // are character at beginning/end same? if so, then what
            return isPalindromeMethod(word.substring(1, word.length() -1));
        }
        return false;
    }
}
