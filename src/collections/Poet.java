package collections;

public class Poet {
    private String name;
    private int birthDate;
    private int deathDate;
    private String style;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(int deathDate) {
        this.deathDate = deathDate;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Poet(String name, int birthDate, int deathDate, String style) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.style = style;
    }
}
