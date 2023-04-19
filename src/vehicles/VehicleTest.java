package vehicles;

import java.util.ArrayList;

public class VehicleTest {

    public static void main(String[] args) {
//        HondaRebel hondaRebel = new HondaRebel();

//        hondaRebel.setName("Honda Rebel");
//        hondaRebel.makeNoise();
//        hondaRebel.breakingDownNoise();

//        HyundaiElantraGT hyundaiElantraGT = new HyundaiElantraGT();
//        hyundaiElantraGT.setName("Hyundai Elantra GT");
//        hyundaiElantraGT.makeNoise();
//        hyundaiElantraGT.makeNoise("brrrRRRRR");

//        Garage garage = new Garage();
//        garage.vehicles = new Vehicle[2];
//        garage.vehicles[0] = new HondaRebel();
//        garage.vehicles[1] = new HyundaiElantraGT();
//        garage.alarmCascade();

        Vehicle boat = new Vehicle();
        Vehicle fourWheeler = new Vehicle();
        Vehicle motorcycle = new Vehicle();

        ArrayList<Vehicle> newAdditionsList = new ArrayList<>();

        newAdditionsList.add(boat);
        newAdditionsList.add(fourWheeler);
        newAdditionsList.add(motorcycle);

        for (Vehicle vehicles : newAdditionsList) {
            System.out.println(vehicles.getName());
        }
    }
}
