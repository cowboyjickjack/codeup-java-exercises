import util.Input;

public class ServerNameGenerator {
    private static String[] adjectives = {"Happy", "Beautiful", "Fast", "Cozy", "Joyful", "Majestic", "Delicious", "Serene", "Vibrant", "Spacious"};

    private static String[] nouns = {"Dog","Computer", "Tree", "Car", "Book", "Beach", "Guitar", "Flower", "Chair", "Mountain"};

    public static String randomElement(String[] stringArray){
        int index = Input.getRandomInt(0, stringArray.length -1 );
        return stringArray[index];
    }

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adjective = randomElement(adjectives);

        System.out.println("Here is your server name: " + adjective + "-" + noun);
    }
}
