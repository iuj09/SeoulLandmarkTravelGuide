package com.example.landmarkservice.repository;


import com.example.landmarkservice.entity.Landmark;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LandmarkRepository extends MongoRepository <Landmark, String> {

    Landmark findByName(String name);
}
