package com.example.mongotest.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.DiscriminatorValue;


@Document(collection = "ddp")
//@DiscriminatorValue(value = "ddp")
@Getter
//@EqualsAndHashCode(callSuper = false)
public class Ddp {

    private String id;
    private String name;
    private Float score;
    private Long review;
    private String link;
    private String addr;
    private Float lat;
    private Float lng;

//    public Ddp(String id, String name, Float score, Long review, String link, String addr, Float lat, Float lng) {
//        super(id, name, score, review, link, addr, lat, lng);
//    }
}