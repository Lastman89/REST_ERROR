package ru.netology.rest_final.repository;


import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository {

    private final String user = "Alex";
    private final String password = "1234";

    public List<Authorities> getUserAuthorities(String user, String password) {

        if (user.equals(this.user) && password.equals(this.password)) {
            return List.of(Authorities.values());
        }
        return null;
    }
}
