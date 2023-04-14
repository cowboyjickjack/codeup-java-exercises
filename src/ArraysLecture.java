public class ArraysLecture {
    public static void main(String[] args) {

        int sizeOfArray = 5; // you can put a variable into an array

        // Array Variable Declaration
        int[] numbers = new int[sizeOfArray];
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

        // Array Initializer Syntax
        int[] moreNumbers = {45, 56, 67, 78};

//        System.out.println(moreNumbers[2]);
//        System.out.println(numbers[2]);

        // MAIN LOOPING TECHNIQUES
        // Enhanced For Loop (used if you don't need access to the used index)
        // for (data-type-of-element variableName: )
                            // what we're looping over
        // helps to write backwards
        // Loop over numbers array
        // On each loop, pull out an int element and call it "number"
        // MAIN WEAKNESS = NO ACCESS TO INDEX
        for (int number : numbers){
            number *= number; // multiply by itself
            System.out.println(number);
        }

        // If you want access to index, use a traditional for loop
        // WEAKNESS OF FOR LOOP = not as clean syntax
        // need length property on an array, like JS, so it knows when to stop
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.printf("The number at index %d is %d%n", i, moreNumbers[i]);
        }


    }
}
