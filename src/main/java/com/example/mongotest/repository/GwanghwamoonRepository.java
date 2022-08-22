package com.example.mongotest.repository;

import com.example.mongotest.entity.Gwanghwamoon;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GwanghwamoonRepository extends MongoRepository <Gwanghwamoon, String> {
}
