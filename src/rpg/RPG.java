package rpg;

public class RPG {
    public static void main(String[] args) {
        // just like Scanner - don't need to import bc in the same class
        Fighter fighter1 = new Fighter();
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
    }
}
