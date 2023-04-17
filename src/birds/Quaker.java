package birds;

public class Quaker extends Bird{ // This is saying it's a type of bird, and linking to the Bird class
    public void makeNoise(){
        System.out.println("ack-squeek"); //overrides the original make noise
    }
}
