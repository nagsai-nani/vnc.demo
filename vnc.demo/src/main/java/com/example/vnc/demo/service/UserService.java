package com.example.vnc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vnc.demo.dao.UserDao;
import com.example.vnc.demo.models.User;
@Service
public class UserService {
@Autowired UserDao dao;
	public User save(User user) {
		
		return dao.save(user);
	}

	

}
