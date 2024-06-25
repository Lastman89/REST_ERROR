package ru.netology.rest_final;


import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    @Autowired
    AuthorizationService service;


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Nullable @RequestParam("user") String user,@Nullable @RequestParam("password") String password) {
        return this.service.getAuthorities(user, password);
    }
}