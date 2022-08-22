package com.example.mongotest.repository;

import com.example.mongotest.entity.Heunginjimoon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeunginjimoonRepository extends MongoRepository <Heunginjimoon, String> {
}
