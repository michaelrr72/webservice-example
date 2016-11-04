/*
 * Example web service
 */
package soa.example.logic;

/**
 * Exception for Team Logic
 */
public class TeamLogicException extends Exception {

    public TeamLogicException() {
    }

    public TeamLogicException(String message) {
        super(message);
    }

    public TeamLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamLogicException(Throwable cause) {
        super(cause);
    }

    public TeamLogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
