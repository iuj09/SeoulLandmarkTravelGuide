package com.example.maptest.repository;


import com.example.maptest.entity.Landmark;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LandmarkRepository extends MongoRepository <Landmark, String> {

    Landmark findByName(String name);
}
