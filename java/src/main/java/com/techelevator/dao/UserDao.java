package com.techelevator.dao;

import com.techelevator.model.RegisterUserDto;
import com.techelevator.model.User;
import com.techelevator.model.ChangePasswordRequest;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    User createUser(RegisterUserDto user);

    User updatePassword(User user1, ChangePasswordRequest user);
}
