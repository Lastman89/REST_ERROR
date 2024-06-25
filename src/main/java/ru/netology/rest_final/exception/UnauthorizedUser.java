package ru.netology.rest_final.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UnauthorizedUser extends RuntimeException {

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity UnauthorizedUser(RuntimeException e) {
        System.out.println(new ResponseEntity("Unknown user", HttpStatus.UNAUTHORIZED));
        return new ResponseEntity("Unknown user", HttpStatus.UNAUTHORIZED);
    }
}

