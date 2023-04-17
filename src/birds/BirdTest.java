package birds;

public class BirdTest {
    public static void main(String[] args) {
//        Bird quaker = new Bird();
        Quaker quaker = new Quaker(); // instead of above, post linking
        quaker.setName("Quaker"); // how to set name when no constructor is made
        quaker.makeNoise();

        Finch finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();

        Goose goose = new Goose();
        goose.setName("Goose");
        goose.makeNoise("Honk!");

        Bird goose2 = new Goose();
        goose2.setName("Second Goose");
        goose2.makeNoise();

    }
}
