package persons;

public class Person {


    public static void main(String[] args) {
        Person myName = new Person("Gabriella");
        myName.setName("Gabriella");
        myName.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        person1.setName("John");
//        person2.setName("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        person1.setName("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

    }

    private String name;

    public Person(String name) {
    }
    public String getName(){
    //TODO: return the person's name
        return name;
    }

    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.println(name + " says hello!");
    }

}
