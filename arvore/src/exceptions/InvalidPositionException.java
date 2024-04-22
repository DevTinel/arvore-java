package exceptions;

public class InvalidPositionException extends RuntimeException {

    public InvalidPositionException() {
        super();
    }

    public InvalidPositionException(String message) {
        super(message);
    }

    public InvalidPositionException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPositionException(Throwable cause) {
        super(cause);
    }
}

