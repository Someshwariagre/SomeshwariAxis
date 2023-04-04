 public class Square extends ShapeDemo{
    int side;

    public Square(int i) {
        this.side=i;
    }

    public int getArea() {
        return side*side;
    }

     @Override
     int area() {
         return 0;
     }

     public int perimeter() {
        return side+side+side+side;
    }
}
