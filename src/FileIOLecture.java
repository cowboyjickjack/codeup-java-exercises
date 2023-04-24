import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLecture {
    public static void main(String[] args) {
        String directory = "data"; // goes back to the root of the project
        String filename = "info.txt";

        // A lot can go wrong with creating a file, so using try/catch is HIGHLY encouraged.
        Path dataDirectory = Paths.get(directory);
    }
}
