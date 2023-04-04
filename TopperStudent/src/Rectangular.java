public class Rectangular {

    public static void main(String[] args) {
        Rectangular r = new Rectangular(2,5);
        System.out.println("area of rectangular is:- "+r.area());
        System.out.println("Perimeter of rectangular is:- "+r.perimeter());
        Triangle t = new Triangle(2,5,2);
        System.out.println("area of Triangle is:- "+t.area());
        System.out.println("Perimeter of Triangle is:- "+t.perimeter());
        Rectangular a = new Rectangular(3,5,7);
        System.out.println("area of triangle is "+ a.area1());


    }


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

    public int area1(){
        return length*breadth*side;
    }

    public Rectangular(int l, int b, int s) {
        this.length = l;
        this.breadth = b;
        this.side = s;
    }
}



