package shape;

public class Rectangular implements Shape{
    int length;
    int breadth;
    int side;

    public Rectangular(int l, int b) {
        this.length = l;
        this.breadth = b;
    }


    public int area() {

        return length * breadth;
    }

    public int perimeter() {

        return 2 * (length + breadth);
    }
}
