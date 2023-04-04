public class Circle extends ShapeDemo{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return radius*(22/7);
    }

    public int perimeter() {
        return (44/7)*radius;
    }
}
