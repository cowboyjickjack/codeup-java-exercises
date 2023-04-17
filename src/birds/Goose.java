package birds;

public class Goose extends Bird{

    public void makeNoise(String noise){ // can override AND overload at the same time
        System.out.println(this.getName() + " goes " + noise);
    }
}
