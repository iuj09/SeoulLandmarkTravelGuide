package com.example.mongotest.repository;

import com.example.mongotest.entity.Deoksugung;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeoksugungRepository extends MongoRepository <Deoksugung, String> {
}
