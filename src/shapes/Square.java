package shapes;

//public class Square extends Rectangle{
//
//    protected double width;
//    protected double height;
//
//    //overriding rectangle method
//    public double getPerimeter(){
//        System.out.println("I'm in square.");
//        return 4 * this.length;
//    }
//    //overriding rectangle method
//    public double getArea(){
//        System.out.println("I'm in square.");
//        return Math.pow(this.width, 2);
//    }
//
//
//    public Square(double side) { // looks into the rectangle constructor
//        super(side, side); // width == height
//    }
//
//}

public class Square extends Quadrilateral {

    protected double length;
    protected double width;

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void setLength(double num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(double num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public double getArea(double length, double width) {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return (length * 4);
    }

    @Override
    public double getPerimeter(double length, double width) {
        return 0;
    }


    @Override
    public double getArea() {
        return this.length * this.length;
    }

}