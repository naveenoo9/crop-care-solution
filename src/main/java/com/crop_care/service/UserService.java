package com.crop_care.service;

import java.util.List;

import com.crop_care.models.enitity.User;

public interface UserService {
  User saveUser(User user);

  List<User> getListOfAllUsers();
}