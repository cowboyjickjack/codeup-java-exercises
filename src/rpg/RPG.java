package rpg;

public class RPG { // class is like a blueprint
    public static void main(String[] args) {
        // just like Scanner - don't need to import bc in the same class
        // below is instantiation of Fighter object
        Fighter fighter1 = new Fighter();
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.name = "Sozalix";
        fighter2.hitPoints = 25;
        fighter2.maxDamage = 23;
        fighter2.printStats();
    }
}
