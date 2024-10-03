package com.elianisdev.SpringBootProject.services;

import com.elianisdev.SpringBootProject.models.Users;
import com.elianisdev.SpringBootProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users register(Users user){


        userRepository.save(user);
        return user;
    }


}
