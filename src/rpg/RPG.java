package rpg;

public class RPG { // class is like a blueprint
    public static void main(String[] args) {
        // just like Scanner - don't need to import bc in the same class
        // below is instantiation of Fighter object
        Fighter fighter1 = new Fighter();
        fighter1.setName("Arata");
        fighter1.setHitPoints(17);
        fighter1.setMaxDamage(14);
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.setName("Sozalix");
        fighter2.setHitPoints(25);
        fighter2.setMaxDamage(23);
        fighter2.printStats();

        Fighter fighter3 = new Fighter("Balgruuf", 95,45);
        fighter3.printStats();

        Fighter fighter4 = new Fighter("J'zaargo", 69, 55);
        fighter4.printStats();

        // didn't need a constructor, just call directly on the class itself
        // and static classes don't need to instantiate an object
        int d20roll = D20.rollD20();
        System.out.println(d20roll);
    }
}
