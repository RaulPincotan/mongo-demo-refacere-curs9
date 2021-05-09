package ro.refacere.curs9.mongodemo.mongodemorefacerecurs9.exceptions;

import lombok.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RoomControllerAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    ApiError handleResourceNotFoundException(ResourceNotFoundException rnfe) {
        return new ApiError(1001, rnfe.getMessage());
    }

}

@Value
class ApiError {
    int code;
    String message;
}