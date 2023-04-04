package vehical;

public class Train implements Vehical , PublicTransport{
    @Override
    public void getNumberOfPeople() {
        System.out.println("Number odf people = 40");
    }

    @Override
    public void drive() {
        System.out.println("Train is in drive mode");
    }

    @Override
    public void turnLeft() {
        System.out.println("Train is going to take left turn");
    }

    @Override
    public void brake() {
        System.out.println("Train is in brake mode");
    }
}
