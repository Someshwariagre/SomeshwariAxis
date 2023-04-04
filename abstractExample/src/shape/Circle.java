package shape;

public class Circle implements Shape{
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



