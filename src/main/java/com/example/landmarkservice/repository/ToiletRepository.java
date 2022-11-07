package com.example.landmarkservice.repository;

import com.example.landmarkservice.entity.Toilet;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ToiletRepository extends MongoRepository <Toilet, String> {
}
