package rpg;

public class D20 {

    public static int rollD20(){ // static belongs to the whole class, it's not just an instance
        return (int) (Math.random()*20) + 1; // int cuts off the decimals
    }


}
