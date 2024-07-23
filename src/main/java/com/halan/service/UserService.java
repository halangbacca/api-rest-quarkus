package com.halan.service;

import com.halan.entity.UserEntity;
import com.halan.exception.UserNotFoundException;
import com.halan.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity) {
        userRepository.persist(userEntity);
        return userEntity;
    }

    public List<UserEntity> findAll(Integer page, Integer pageSize) {
        return userRepository.findAll().page(page, pageSize).list();
    }

    public UserEntity findById(UUID id) {
        return userRepository.findByIdOptional(id)
                .orElseThrow(UserNotFoundException::new);
    }

    public UserEntity updateUser(UUID id, UserEntity userEntity) {
        var user = findById(id);

        user.setUsername(userEntity.getUsername());

        userRepository.persist(user);

        return user;
    }

    public void deleteById(UUID id) {
        var user = findById(id);
        userRepository.deleteById(user.getUserId());
    }
}
