package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
