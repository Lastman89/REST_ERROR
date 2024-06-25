package ru.netology.rest_final.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.rest_final.exception.InvalidCredentials;
import ru.netology.rest_final.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity InvalidCredentials(InvalidCredentials i) {
        return new ResponseEntity (i.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity UnauthorizedUser(UnauthorizedUser u) {
        System.out.println(new ResponseEntity(u.getMessage(), HttpStatus.UNAUTHORIZED));
        return new ResponseEntity(u.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
