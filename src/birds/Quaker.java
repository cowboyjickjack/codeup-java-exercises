package birds;

public class Quaker extends Bird{ // This is saying it's a type of bird, and linking to the Bird class
    public void makeNoise(){
//        super.makeNoise(); // lets you access methods in the super class, which is Bird
        System.out.println(this.getName() + " goes ack-squeek"); //overrides the original make noise
    }

    public Quaker(){
        System.out.println("New Quaker created!");
    }
}
