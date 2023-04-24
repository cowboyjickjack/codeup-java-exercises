import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {
    public static void main(String[] args) {
        String directory = "data"; // goes back to the root of the project
        String filename = "info.txt"; // reason for strings is it's just easier to work with atm

        // A lot can go wrong with creating a file, so using try/catch is HIGHLY encouraged.
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename); // atm, this file doesn't actually exist
        System.out.println(dataFile);

        if (Files.notExists(dataDirectory)){ // checking if it exits. If not, we create it.
            try {
                Files.createDirectories(dataDirectory); // intelliJ is angry bc that this will likely make an exception, so we use a try/catch
            } catch (IOException e) { // 'e' is most common variable in a catch
                e.printStackTrace();
            }
        } // and now we have a directory file called 'data'! :)

        if (Files.exists(dataFile)){ // Files.exists can be interchanged with Files.notExists. Stick to one.
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } // and now we have a file called 'data.txt'! :)
    }
}
