package vehical;

public class Car extends MoterisedVehical  implements Vehical{
    @Override
    public void drive() {
        System.out.println("Man is driving car");
    }

    @Override
    public void turnLeft() {
        System.out.println("car is going to take left turn");
    }

    @Override
    public void brake() {
        System.out.println("car is in brake mode");
    }
}
