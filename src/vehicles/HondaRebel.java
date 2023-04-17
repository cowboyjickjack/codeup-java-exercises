package vehicles;

public class HondaRebel extends Vehicle{

    public void makeNoise(String noise){
        System.out.println(this.getName() + " sounds like " + noise);
    }

    public void makeNoise(){
        System.out.println("bdum-bdum-bdum-bdum");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("spt-spt-spt");
    }

}
