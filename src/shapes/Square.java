package shapes;

public class Square extends Rectangle{

    protected double width;
    protected double height;

    public Square(double side) {
        super(side, side); // width == height
    }
}
