package com.example.mongotest.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "heunginjimoon")
//@DiscriminatorValue(value = "heunginjimoon")
@Getter
//@EqualsAndHashCode(callSuper = false)
public class Heunginjimoon {

    private String id;
    private String Name;
    private Float Score;
    private Long Review;
    private String Link;
    private String Addr;
    private Float lat;
    private Float lng;

//    public Heunginjimoon(String id, String name, Float score, Long review, String link, String addr, Float lat, Float lng) {
//        super(id, name, score, review, link, addr, lat, lng);
//    }
}
