package animal;

public class test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Jackson");
        cat.setSound("meow");
        cat.makeNoise();

        Cat cat2 = new Cat("Jackson", "honk");
        Cat cat3 = new Cat("Athena", "hiss");
        Cat cat4 = new Cat("Leo", "AHHH");
        cat2.makeNoise();
        cat3.makeNoise();
        cat4.makeNoise();
    }
}
