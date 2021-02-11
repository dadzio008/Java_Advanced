package Exceptions;

public class CholeroProwadzacyException extends RuntimeException{
    public CholeroProwadzacyException(String message) {
        super(message);

    }

    public CholeroProwadzacyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CholeroProwadzacyException(Throwable cause) {
        super(cause);
    }

    public CholeroProwadzacyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CholeroProwadzacyException() {

    }
}
