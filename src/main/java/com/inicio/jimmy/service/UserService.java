package com.inicio.jimmy.service;

import com.inicio.jimmy.model.User;
import com.inicio.jimmy.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User entity) {
        return userRepository.save(entity);
    }

    public User fingById(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
