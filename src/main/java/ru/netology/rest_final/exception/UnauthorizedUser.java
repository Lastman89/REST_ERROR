package ru.netology.rest_final.exception;


public class UnauthorizedUser extends RuntimeException {

    public  UnauthorizedUser(String msg) {
        super(msg);
    }
}

