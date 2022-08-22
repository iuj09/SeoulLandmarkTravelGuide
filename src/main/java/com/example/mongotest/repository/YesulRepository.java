package com.example.mongotest.repository;

import com.example.mongotest.entity.Yesul;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface YesulRepository extends MongoRepository <Yesul, String> {
}
