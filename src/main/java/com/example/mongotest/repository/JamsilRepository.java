package com.example.mongotest.repository;

import com.example.mongotest.entity.Jamsil;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JamsilRepository extends MongoRepository <Jamsil, String> {
}
