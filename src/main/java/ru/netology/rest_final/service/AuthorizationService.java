package ru.netology.rest_final.service;


import org.springframework.stereotype.Service;
import ru.netology.rest_final.repository.Authorities;
import ru.netology.rest_final.exception.InvalidCredentials;
import ru.netology.rest_final.exception.UnauthorizedUser;
import ru.netology.rest_final.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {

    private final UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("Unknown user or password");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user");
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
