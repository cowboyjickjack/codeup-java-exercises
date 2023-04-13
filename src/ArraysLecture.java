public class ArraysLecture {
    public static void main(String[] args) {

        int sizeOfArray = 5; // you can put a variable into an array

        int[] numbers = new int[sizeOfArray]; // just declared an array of integers
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

        for (int number : numbers){
            System.out.println(numbers);
        }

    }
}
