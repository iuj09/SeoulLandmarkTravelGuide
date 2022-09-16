package com.example.maptest.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class Info {

    private String name;
    private Float score;
    private Long review;
    private String link;
    private String addr;
    private Float lat;
    private Float lng;

}
