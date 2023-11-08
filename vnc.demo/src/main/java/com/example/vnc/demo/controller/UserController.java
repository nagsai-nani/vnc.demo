package com.example.vnc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vnc.demo.models.User;
import com.example.vnc.demo.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {
@Autowired UserService service;
@PostMapping("/save")
public ResponseEntity<User> saveUser(@RequestBody User user)
{
	return ResponseEntity.ok(service.save(user));
	}
}
