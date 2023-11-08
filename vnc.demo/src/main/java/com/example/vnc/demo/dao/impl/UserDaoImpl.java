package com.example.vnc.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vnc.demo.dao.UserDao;
import com.example.vnc.demo.models.User;
import com.example.vnc.demo.repository.UserRepository;
@Repository
public class UserDaoImpl implements UserDao {
@Autowired UserRepository repo;
	@Override
	public User save(User user) {
		return repo.save(user);
	}

}
