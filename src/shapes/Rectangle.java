package shapes;

//public class Rectangle {
//
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("I'm in rectangle.");
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("I'm in rectangle.");
//        return (width * 2) + (length * 2);
//    }
//
//    public Rectangle(){
//    }
//}

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public Rectangle() {
        super();
    }

    @Override
    public void setLength(double num) {
        this.length = num;
    }

    @Override
    public void setWidth(double num) {
        this.width = num;
    }

    @Override
    public double getArea(double length, double width) {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public double getPerimeter(double length, double width) {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }


}