package shapes;

public class Square extends Rectangle{

    protected double width;
    protected double height;

    //overriding rectangle method
    public double getPerimeter(){
        System.out.println("I'm in square.");
        return 4 * this.length;
    }
    //overriding rectangle method
    public double getArea(){
        System.out.println("I'm in square.");
        return Math.pow(this.width, 2);
    }

    //doesn't need a constructor, bc it needs a value when you call it. they get inherited by Square
    public Square(double side) { // looks into the rectangle constructor
        super(side, side); // width == height
    }
}
