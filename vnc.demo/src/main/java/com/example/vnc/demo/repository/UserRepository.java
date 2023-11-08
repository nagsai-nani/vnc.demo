package com.example.vnc.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.vnc.demo.models.User;

public interface UserRepository extends MongoRepository< User,String> {

}
