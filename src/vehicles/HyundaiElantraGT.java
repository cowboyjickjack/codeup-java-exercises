package vehicles;

public class HyundaiElantraGT extends Vehicle {

    public void makeNoise(){
        System.out.println(this.getName() + " sounds like brrrrRRRRRRR");
    }

    public void makeNoise(String noise){
        System.out.println(this.getName() + " sounds like " + noise);
    }


    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println(this.getName() + "chk-chk-chk");
    }
}
