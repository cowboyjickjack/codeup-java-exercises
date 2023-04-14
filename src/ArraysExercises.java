import persons.Person;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

//        for (int i = 1; i <= numbers.length; i++) {
//            System.out.println(i);
//        }

        int sizeOfArray = 3;

        String[] Persons = new String[sizeOfArray];
        Persons[0] = "John";
        Persons[1] = "Joe";
        Persons[2] = "Jimmy";

        // Enhanced For Loop
        for (String string : Persons) {
            System.out.println(string);
        }

        // Traditional For Loop
        for (int i = 1; i < Persons.length; i++){
            System.out.println(Persons[i]);
        }
    }

}
