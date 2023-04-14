package rpg;

public class Monster {
    // Instance Variables = they belong to the instance, not the class
    // so when the constructor uses them, it's an instance of it
    // it's a template, a blueprint
    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // no arg instructor :)
    // helpful to overload a constructor
    public Monster() {
    }

    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }
}
