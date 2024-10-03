package com.elianisdev.SpringBootProject.services;

import com.elianisdev.SpringBootProject.models.Users;
import com.elianisdev.SpringBootProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users register(Users user){

        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);

    }


}
