package shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println("Area of circle is:- "+ s.area());
        System.out.println("Perimeter of circle is:- "+ s.perimeter());

        s = new Square(3);
        System.out.println("Area of Square is:- "+ s.area());
        System.out.println("Perimeter of Square is:- "+ s.perimeter());

        s = new Rectangular(4,6);
        System.out.println("Area of Recatngular is:- "+ s.area());
        System.out.println("Perimeter of Rectangular is:- "+ s.perimeter());

        s = new Triangle(5,6,7);
        System.out.println("Area of Triangle is:- "+ s.area());
        System.out.println("Perimeter of Triangle is:- "+ s.perimeter());
    }
}
