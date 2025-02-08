package com.crop_care.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crop_care.models.enitity.User;
import com.crop_care.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/users/v1")
public class UserController {

  private @Autowired UserService userService;

  @PostMapping
  public ResponseEntity<User> postUser(@RequestBody User newUser) {
    return ResponseEntity.status(201).body(userService.saveUser(newUser));
  }
  
  @GetMapping
  public ResponseEntity<List<User>> getUsers() {
    return ResponseEntity.status(200).body(userService.getListOfAllUsers());
  }
}
