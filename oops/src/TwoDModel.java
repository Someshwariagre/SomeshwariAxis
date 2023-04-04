public class TwoDModel {

    public static void main(String[] args) {
      Square square = new Square(2);
      System.out.println("Area of square is:- "+square.getArea());
      System.out.println("Perimeter of square is:- "+square.perimeter());

      Rectangular rect = new Rectangular(2,4);
        System.out.println("Area of rectangular is:- "+rect.area());
        System.out.println("perimeter of rectangular is:- "+rect.perimeter());

        Circle cr = new Circle(4);
        System.out.println("Area of Circle is:- "+cr.area());
        System.out.println("perimeter of Circle is:- "+cr.perimeter());

        Triangle tr = new Triangle(6,5,7);
        System.out.println("Area of Traingle is:- "+tr.area());
        System.out.println("perimeter of Traingle is:- "+tr.perimeter());

    }

}
