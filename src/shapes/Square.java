package shapes;

public class Square extends Rectangle{

    protected double width;
    protected double height;

    public Square(double side) { // looks into the rectangle constructor
        super(side, side); // width == height
    }
}
