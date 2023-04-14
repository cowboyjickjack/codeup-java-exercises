import rpg.Monster;

public class ArraysLecture {
    // cannot access inside main bc it's outside the main method, unless it's declared static
    static Monster school = new Monster("School", 20, 450, 25);
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
//        for (int number : numbers){
//            number *= number; // multiply by itself
//            System.out.println(number);
//        }

        // If you want access to index, use a traditional for loop
        // WEAKNESS OF FOR LOOP = not as clean syntax
        // need length property on an array, like JS, so it knows when to stop
//        for (int i = 0; i < moreNumbers.length; i++) {
//            System.out.printf("The number at index %d is %d%n", i, moreNumbers[i]);
//        }

        // Using Monster constructor
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        // LONG SYNTAX
//        Monster[] monster = new Monster[3]; // need the 3 to know how many monsters. if not, intelliJ is unhappy
//        monster[0] = orc;
//        monster[1] = ogre;
//        monster[2] = blueDragon;

        // SHORT SYNTAX
        // If defining an array of objects, the data-type is an OBJECT
        // that's why we used Monster[] instead of String or int
        Monster[] monsters = {orc, ogre, blueDragon};

        for (Monster monster : monsters){
            System.out.println(monster.getName()); // don't need for loop for the index, you can just use a getter!
        }

    }
}
