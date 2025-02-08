package com.crop_care.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.crop_care.models.enitity.User;
import com.crop_care.repo.UserRepo;
import com.crop_care.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
  private @Autowired UserRepo userRepo;
  private @Autowired PasswordEncoder encoder;

  @Override
  public User saveUser(User user) {
    user.setPassword(encoder.encode(user.getPassword()));
    return userRepo.save(user);
  }

  @Override
  public List<User> getListOfAllUsers() {
    return userRepo.findAll();
  }

}
