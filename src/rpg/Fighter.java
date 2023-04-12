package rpg;

public class Fighter {
    // POJO: Plain Old Java Object

    // just info rn, like a definition
    // no visibility = default visibility and can only be seen for the package
    private String name;
    private int hitPoints;
    private int maxDamage;

    // used since the visibilities are private
    public String getName(){
        return name;
    }
    // void bc it's not getting anything
    public void setName(String name){
        this.name = name;
    }

    public int getHitPoints(){
        return hitPoints;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage(){
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }
    // in order for fighter to do something, we need to create a method
    public void printStats(){
        System.out.printf("%s has %d hit points and does %d maximum damage.%n", name, hitPoints, maxDamage);
    }

    // CONSTRUCTORS
    // No Arg Constructor, and it fixes itself so you don't need to reform old code!
    public Fighter(){

    }
    // since we're in the same class, we don't need to use the setter ;)
    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }
}
