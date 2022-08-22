package com.example.mongotest.repository;

import com.example.mongotest.entity.Ddp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DdpRepository extends MongoRepository <Ddp, String> {
}
