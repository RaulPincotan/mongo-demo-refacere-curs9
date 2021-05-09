package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
