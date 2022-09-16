package com.example.maptest.repository;

import com.example.maptest.entity.Crawling;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CrawlingRepository extends MongoRepository <Crawling, String> {

    Crawling findByLoc(String loc);
}
