package vehicles;

public class Garage {

    protected Vehicle[] vehicles; // protected = same as default

    public void alarmCascade(){
        for (Vehicle vehicle : this.vehicles){
            vehicle.makeNoise();
        }
    }
}
