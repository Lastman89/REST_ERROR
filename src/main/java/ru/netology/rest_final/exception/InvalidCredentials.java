package ru.netology.rest_final.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;


@RestControllerAdvice
public class InvalidCredentials extends RuntimeException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> InvalidCredentials(RuntimeException e) {
        return new ResponseEntity("Unknown user or password", HttpStatus.BAD_REQUEST);
    }
}
