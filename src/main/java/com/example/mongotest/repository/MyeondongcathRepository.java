package com.example.mongotest.repository;

import com.example.mongotest.entity.Myeongdongcath;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyeondongcathRepository extends MongoRepository <Myeongdongcath, String> {
}
