package ru.netology.rest_final;


import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository {

    private String user = "Alex";
    private String password = "1234";

    public List<Authorities> getUserAuthorities(String user, String password) {

        if (user.equals(this.user) && password.equals(this.password)) {
            return List.of(Authorities.values());
        }
        return null;
    }
}
