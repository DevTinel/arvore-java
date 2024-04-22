package exceptions;

public class BoundaryViolationException extends RuntimeException {

    public BoundaryViolationException() {
        super();
    }

    public BoundaryViolationException(String message) {
        super(message);
    }

    public BoundaryViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoundaryViolationException(Throwable cause) {
        super(cause);
    }
}

