package vehical;

public class VehicalRunner {

    public static void main(String[] args) {
        Vehical c = new Car();
        c.drive();
        c.turnLeft();
        c.brake();
        c = new Train();
        c.drive();
        c.turnLeft();
        c.brake();

        MoterisedVehical mv = new MoterisedVehical();
        mv.checkMotor();

        Car car = new Car();
        car.checkMotor();

        PublicTransport pt = new Train();
        pt.getNumberOfPeople();

    }
}
