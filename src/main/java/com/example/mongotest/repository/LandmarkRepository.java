package com.example.mongotest.repository;


import com.example.mongotest.entity.Landmark;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LandmarkRepository extends MongoRepository<Landmark, String> {
//    List<Landmark> findLandmarkByLmname(String lmname);
}
