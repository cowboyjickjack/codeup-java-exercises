import java.util.Arrays;

public class ArraysExercises {

    // Created a new array, with a length one greater than the original.
    // In the last place of that array, made a new Person object in that array
    public static Person[] addPerson(Person[] personArray, Person newPerson){
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length + 1);
        return newPersonArray;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Charlie");

        Person[] personLoop = {person1, person2, person3};

        for (Person person : personLoop) {
            System.out.println(person.getName());
        }


    }


}
