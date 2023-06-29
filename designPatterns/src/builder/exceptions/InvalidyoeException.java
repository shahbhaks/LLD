package creational.builder.exceptions;

public class InvalidyoeException extends RuntimeException{

    public InvalidyoeException() {
    }

    public InvalidyoeException(String message) {
        super(message);
    }

    public InvalidyoeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidyoeException(Throwable cause) {
        super(cause);
    }

    public InvalidyoeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
