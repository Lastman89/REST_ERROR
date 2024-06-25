package ru.netology.rest_final.controller;


import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.rest_final.repository.Authorities;
import ru.netology.rest_final.service.AuthorizationService;

import java.util.List;

@RestController
public class AuthorizationController {

    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Nullable @RequestParam("user") String user, @Nullable @RequestParam("password") String password) {
        return this.service.getAuthorities(user, password);
    }
}