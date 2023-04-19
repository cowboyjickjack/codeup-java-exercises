package collections;

import rpg.Monster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionsLecture {

    public static void main(String[] args) {

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

//        ArrayList<Monster> monstersList = new ArrayList<>();
        // With arrays, we have to assign values to variables
        // Array syntax is: monsterArray[0] = blueDragon;

        // With Lists, we can use the .add method to add elements one at a time
//        monstersList.add(orc);
//        monstersList.add(ogre);
//        monstersList.add(blueDragon);

        // We could also create an array list, initialize it, and add items to it all at once,
        // using the List.of method
//        ArrayList<Monster> monstersList = new ArrayList<>(List.of(orc, ogre, blueDragon));

        // Creating a list based on Array

        // If I already have an array, like this:
        Monster[] monsters = {orc, ogre, blueDragon};

        // I could add it to a list like this:
        ArrayList<Monster> monstersList = new ArrayList<>(Arrays.asList(monsters));

        // Looping over an array/arraylist is the same  and never changes
//        for (Monster monster : monstersList){
//            System.out.println(monster.getName());
//        }

        // Instead of a length property, Lists have a size method
//        System.out.println(monstersList.size());

        // To access an array element, I use a bracket notation with the
        // index of the element: Monster[1]
        // but for lists, I use the .get() method and
        // pass the method the index
//        System.out.println(monstersList.get(2).getName());

        // POET PRACTICE
        ArrayList<Poet> poetsList = Poets.generatePoetList();

        //sorting gets deep, but this is an example of sorting alphabetically
        poetsList.sort(Comparator.comparing(Poet::getName));

        for (Poet poet : poetsList){
            System.out.println(poet.getName() + " was born in " + poet.getBirthDate() + ", died in " + poet.getDeathDate() + " and is a poet in " + poet.getStyle() + " poet.");
        }
    }

}
