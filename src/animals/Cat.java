package animals;

public class Cat {

    private String name;
    public String sound;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSound(){
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }


    //CONSTRUCTORS
    public Cat(){
    }

    public Cat(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public static String RandomQuote(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        if (randomNumber == 1){
            return "Howdy, Neighbor!";
        } else if (randomNumber == 2){
            return "Ugh, go away!";
        } else if (randomNumber == 3){
            return"I love you so much!!!";
        } else if (randomNumber == 4){
            return "Pet me... or perish...";
        }
        return "";
    }
    public void makeNoise() {
        System.out.println(name + " goes " + sound + "! \n" + name + " says " + RandomQuote());
    }

}
