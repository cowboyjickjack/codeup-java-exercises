public class AbstractInterfacesLecture {
    public static void main(String[] args) {

//        Employee newGuy = new Employee("Jason", "Delivery"); // abstract class so cannot use!
//        Developer newGuy = new Developer("Jason", "Delivery"); // abstract class so cannot use!
//        System.out.println(newGuy.work());

        Bear bigBear = new Bear("Yogi", "Grizzly", 1200, true);
        System.out.println(bigBear.skin());

    }
}

// since it's abstract, cannot be called directly
// one main purpose is for subclasses
abstract class Employee {
    protected String name;
    protected String department;

    // constructor
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // defining method, but not doing anything atm
    public abstract String work();
}

// extended class needs to implement is, so we need to make sure it's defined somewhere in there
class Developer extends Employee {

    public Developer(String name, String department){
        super(name, department);
    }

    public String work(){
        return "Writing code...";
    }
}

//
abstract class Notification {

    // ex: rules for notifs in place for the Spam Act
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();

}

// from below, I won't be able to build this thing until you define each method (opt in, unsubscribe, etc)
// something a senior dev would give to a junior dev
//class EmailNotification extends Notification {
//
//}

// ANOTHER EXAMPLE LINKED WITH IsSkinnable

abstract class Animal {
    protected String name;
    protected String species;
    protected double weight;
    protected boolean isLegendary;

    // constructor
    public Animal(String name, String species, double weight, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}

// implements almost 'drag and drop' interfaces, and separate concerns, use certain pieces
// could even have an abstract class for enemies
class Bear extends Animal implements Skinnable {

    // needs default constructor from Animal, hence 'super'
    public Bear(String name, String species, double weight, boolean isLegendary) {
        super(name, species, weight, isLegendary);
    }

    @Override
    public String skin() {
        if (this.isLegendary) {
            return "Legendary Bear Hide";
        }
        return "Bear Hide";
    }
}

// ANOTHER EXAMPLE, FOR A BABY REGISTRY
abstract class List {
    protected String name;
    protected int id;
    protected String [] items; // array of items

    public List(String name, String[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    // method to just add item
    public void addItem(String item){

    }
}

class WishList extends List implements  Shareable,Deletable {

    // once again, needs constructor
    public WishList(String name, String[] items) {
        super(name, items);
    }

    @Override
    public String shareLink() {
        // do all the backend thingies to make a sharelink
        return "https://mysharelink.com";
    }

    // once we added Deletable, we need to have the method of delete in here
    @Override
    public String delete() {
        return (this.name + " was deleted.");
    }
}

class PrivateList extends List implements Deletable { // it'll extend list, but WON'T be shareable, but WILL be Deletable
    public PrivateList(String name, String[] items) {
        super(name, items);
    }

    @Override
    public String delete() {
        return (this.name + " was deleted.");
    }
}

