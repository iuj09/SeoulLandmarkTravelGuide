package com.example.landmarkservice.repository;

import com.example.landmarkservice.entity.Crawling;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CrawlingRepository extends MongoRepository <Crawling, String> {

    Crawling findByLoc(String loc);
}
