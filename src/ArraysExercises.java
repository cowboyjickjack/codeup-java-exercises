import java.util.Arrays;

public class ArraysExercises {

    // Created a new array, with a length one greater than the original.
    // In the last place of that array, made a new Person object in that array
    public static Person[] addPerson(Person[] personsArray, Person person){
        Person[] newPersonsArray = Arrays.copyOf(personsArray, personsArray.length + 1);
        newPersonsArray[newPersonsArray.length - 1] = person;
        return newPersonsArray;
    }

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("Jackson");
        persons[1] = new Person("Kirk");
        persons[2] = new Person("Athena");

        for (Person person : persons) {
            person.sayHello();
        }

        Person[] biggerPersonsArray = addPerson(persons, new Person("Leo"));
        biggerPersonsArray[biggerPersonsArray.length - 1].sayHello();
    }

}
