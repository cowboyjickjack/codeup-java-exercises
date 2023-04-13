package shapes;

public class Circle {

    private int Radius;

    public Circle(double radius){
    }
    public static double getArea(double radius){
        return radius * radius * Math.PI;
    }
    public static double getCircumference(int radius){
        return 2 * Math.PI * radius;
    }

}
