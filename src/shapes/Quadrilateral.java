package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;


    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(double lengthWidth){
        this.length = length;
        this.width = width;
    }

    public Quadrilateral(){
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public abstract void setLength(double num);
    public abstract void setWidth(double num); // don't actually need to define the method, since it's abstract

    public abstract double getArea(double length, double width);
}
