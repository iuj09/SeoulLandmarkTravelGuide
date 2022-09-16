package com.example.maptest.repository;

import com.example.maptest.entity.Toilet;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ToiletRepository extends MongoRepository <Toilet, String> {
}
