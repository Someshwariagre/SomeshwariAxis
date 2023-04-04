package shape;

public class Square implements Shape{
    int side;

    public Square(int i) {

        this.side=i;
    }

    public int area() {

        return side*side;
    }



    public int perimeter() {
        return side+side+side+side;
    }
}
