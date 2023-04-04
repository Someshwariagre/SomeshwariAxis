package exception;

public class InvalidAgeException extends Exception{

    public InvalidAgeException(final String exception) {
        super(exception);
    }
    public InvalidAgeException(final Throwable exception) {
        super(exception);
    }


}
