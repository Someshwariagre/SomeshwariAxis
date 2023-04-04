public class Triangle {

//    public static void main(String[] args) {
//        Triangle t = new Triangle(2,5,2);
//        System.out.println("area of Triangle is:- "+t.area());
//        System.out.println("Perimeter of Triangle is:- "+t.perimeter());
//
//    }
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



