package shape;

public class Triangle implements Shape{
    int height;
    int breadth;
    int side;

    public Triangle(int h, int b,int s) {
        this.height = h;
        this.breadth = b;
        this.side= s;
    }

    public int area() {

        return (height * breadth)/2;
    }

    public int perimeter() {

        return height+breadth+side;
    }
}
