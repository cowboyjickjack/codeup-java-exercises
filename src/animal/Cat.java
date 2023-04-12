package animal;

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

    public void makeNoise() {
        System.out.println(name + " goes " + sound + "!");
    }
}
