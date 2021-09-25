package com.ethelen.be.services;

import com.ethelen.be.entity.User;
import com.ethelen.be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService{

    private final String notFoundMessage="Customer with id: %s Not found!";

    @Autowired
    UserRepository userRepository;

    @Override
    public User userLogin(User user) {
        User login = userRepository.findUserLogin(user.getUserName());
        if (login == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(notFoundMessage, user));
        }
        return login;
    }

}
