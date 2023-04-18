package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5); // ran on rectangle object
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5); // polymorphism, now identifying as square! Ran on square object
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape;
        myShape = new Rectangle(10, 15);
        System.out.println("Rectangle area => " + myShape.getArea());
        System.out.println("Rectangle perimeter => " + myShape.getPerimeter());

        myShape = new Square(10);
        System.out.println("Square area => " + myShape.getArea());
        System.out.println("Square perimeter => " + myShape.getPerimeter());

    }
}

