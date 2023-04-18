public class AbstractInterfacesLecture {
    public static void main(String[] args) {

//        Employee newGuy = new Employee("Jason", "Delivery"); // abstract class so cannot use!

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
