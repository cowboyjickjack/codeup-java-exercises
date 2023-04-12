package rpg;

public class Fighter {

    // just info rn, like a definition
    public String name;
    public int hitPoints;
    public int maxDamage;

    // in order for fighter to do something, we need to create a method
    public void printStats(){
        System.out.printf("%s has %d hit points and does %d maximum damage.", name, hitPoints, maxDamage);
    }
}
