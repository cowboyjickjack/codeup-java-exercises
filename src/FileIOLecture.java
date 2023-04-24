import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {
    public static void main(String[] args) {
        String directory = "data"; // goes back to the root of the project
        String filename = "groceries.txt"; // reason for strings is it's just easier to work with atm

        // A lot can go wrong with creating a file, so using try/catch is HIGHLY encouraged.
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename); // atm, this file doesn't actually exist
        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)){ // checking if it exits. If not, we create it.
            try {
                Files.createDirectories(dataDirectory); // intelliJ is angry bc that this will likely make an exception, so we use a try/catch
            } catch (IOException e) { // 'e' is the most common variable in a catch
                e.printStackTrace();
            }
        } // and now we have a directory file called 'data'! :)

        if (! Files.exists(dataFile)){ // Files.exists can be interchanged with Files.notExists. Stick to one.
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // and now we have a file called 'data.txt'! :) WON'T automatically be added to git, which is why they're showing up red.
        List<String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuff Oreos");
//        System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(
                    dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND); // third argument to add options!
        } catch (IOException e){
            e.printStackTrace();
        }
        // the grocery list is DEFINITELY created now
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            System.out.println(groceryListFromFile);
            for (int i = 1; i <= groceryListFromFile.size(); i+= 1){ // if you want it numbered !
                System.out.println(i + ": " + groceryListFromFile.get(i - 1)); // .get is getting value from a list (index)
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        // System.out.println(groceryListFromFile); // cannot do it bc try/catches are block scoped
        // NOW we have our LIST!
        // BUT OH NO! We forgot powdered sugar! Let's be smart once and work it into our application

        Boolean hasPowderedSugar = false;
        try {
            List<String> lines = Files.readAllLines(dataFile); // grabbing all lines from datafile
            for (String line : lines) { // almost like for of in JS. each iteration will be a line, and it's looping through lines
                // for this, we don't have access to the index, but we don't need it
                if (line.equals("Powdered Sugar")) {
                    hasPowderedSugar = true; // if it's in the list, it'll be set to true!
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        // We DEFINITELY know if "Powdered Sugar" is in the list or not
        if (!hasPowderedSugar){
            List<String> addPowderedSugar = Arrays.asList("Powdered Sugar");
            try {
                Files.write(
                        dataFile,
                        addPowderedSugar,
                        StandardOpenOption.APPEND);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        // UH OH! We have some of "those" people who don't like Double Stuff. We need to revert back to regular Oreos
        try {
            List<String> lines = Files.readAllLines(dataFile);
            List<String> newList = new ArrayList<>(); // need to make empty array
            for (String line : lines) {
                if (line.equals("Double Stuff Oreos")) {
                    newList.add("Regular Oreos"); // yuck
                } else {
                    newList.add(line); // since it doesn't need to be replaced, we'll jsut add it, as is
                }
            }
            Files.write(dataFile, newList); // adding to dataFile, adding newList
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
