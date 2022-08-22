package com.example.mongotest.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gwanghwamoon")
//@DiscriminatorValue(value = "gwanghwamoon")
@Getter
//@EqualsAndHashCode(callSuper = false)
public class Gwanghwamoon {

    private String id;
    private String Name;
    private Float Score;
    private Long Review;
    private String Link;
    private String Addr;
    private Float lat;
    private Float lng;

//    public Gwanghwamoon(String id, String name, Float score, Long review, String link, String addr, Float lat, Float lng) {
//        super(id, name, score, review, link, addr, lat, lng);
//    }
}