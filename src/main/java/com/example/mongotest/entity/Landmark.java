package com.example.mongotest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Document(collection = "landmark")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "lmname", discriminatorType = DiscriminatorType.STRING)
@Getter
@NoArgsConstructor
public abstract class Landmark {

//    private String id;
//    private String name;
//    private Float score;
//    private Long review;
//    private String link;
//    private String addr;
//    private Float lat;
//    private Float lng;
//
//    public Landmark(String id, String name, Float score, Long review, String link, String addr, Float lat, Float lng) {
//
//        this.id = id;
//        this.name = name;
//        this.score = score;
//        this.review = review;
//        this.link = link;
//        this.addr = addr;
//        this.lat = lat;
//        this.lng = lng;
//    }
}

// String id, String Name, Float Score, Long Review, String Link, String Addr, Float lat, Float lng
// id, name, Score, Review, Link, Addr, lat, lng