package birds;

public class Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise (){
        System.out.println(this.name + " says tweet tweet");
    }

    public void layEggs(){
        System.out.println("Laying an egg.");
    }

    public Bird(String name){
        System.out.println("New Bird created!");
    }
}
