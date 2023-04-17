package birds;

public class Goose extends Bird{

    public void makeNoise(String noise){ // can override AND overload at the same time
        System.out.println(this.getName() + " goes " + noise);
    }

    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk");
    }

    public Goose(){
        System.out.println("New Goose created!");
    }
}
