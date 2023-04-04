package vehical;

public class Vehical {
    public static void main(String[] args) {
        Shape bike = new Bike();
        bike.speed();

        Shape car = new Car();
        car.speed();

        Shape truck = new Truck();
        truck.speed();
    }
}
