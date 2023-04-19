package collections;

import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class CollectionsLecture {

    public static void main(String[] args) {

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        Monster frostGiant = new Monster("Frost Giant", 15, 138, 25);
        Monster goblin = new Monster("Goblin", 15, 7, 5);
        Monster werewolf = new Monster("Werewolf", 11, 58, 7);

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
//            System.out.println(poet.getName() + " was born in " + poet.getBirthDate() + ", died in " + poet.getDeathDate() + " and is a poet in " + poet.getStyle() + " poet.");
        }

        // HASH MAPS

        // key value pairs, so they must take two inputs (string = key, integer = value) in this case
        HashMap<String, Integer> careerWins = new HashMap<>();

        // To add elements to a HashMap, use the .put() method

        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        // To retrieve an item from a HashMap, use .get() and pass it the key

//        System.out.println(careerWins.get("Gregg Popovich"));

        // To replace a value, use .replace() and pass it the key

        careerWins.replace("Gregg Popovich", 1367);
//        System.out.println(careerWins.get("Gregg Popovich"));

        Map<String, Monster> monsterMap = new HashMap<>();

        // To add multiple entries at once, we can use Map.ofEntries()
        // This is similar to a long series of entries

        monsterMap = Map.ofEntries(
                entry("Orc", orc),
                entry("Blue Dragon", blueDragon),
                entry("Ogre", ogre),
                entry("Frost Giant", frostGiant),
                entry("Goblin", goblin),
                entry("Werewolf", werewolf)
        );

        // Map.ofEntries returns an unmodifiable!
        // This is by design for performance reasons
        // If I want to be able to modify it, I have to
        // convert it back to a HashMap, as follows

        Map<String, Monster> monsterHashMap = new HashMap<>(monsterMap);

        // Now the HashMap is modifiable again
        // How to add a new object to the HashMap:
        monsterHashMap.put("Skeleton", new Monster("Skeleton", 13, 13, 5));

        // Looping over a HashMap:

        // A set is an unordered collection of unique objects

        // If I want to loop over all the HashMap entries, i can create an EntrySet
        // An EntrySet is a set of entry object. Entry objects are objects with two properties
        // a key and a value, and getters for both the key and value

//        for (Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
//            System.out.println("The key is " + monsterEntry.getKey());
//            System.out.println(monsterEntry.getValue().getName() + " has " + monsterEntry.getValue().getHitPoints() + " Hit Points.");
//        }

        // There is also a forEach loop

        monsterHashMap.forEach((name, monster)->{ // -> is java's version of the arrow function
            System.out.println(name + " has " + monster.getHitPoints() + " hit points.");
        });

        // You can also get a set of the keys using the .keySet method
        // And you can get a collection of values using the .values() method

    }

}
