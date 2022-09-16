package com.example.maptest.dto;

import com.example.maptest.entity.Crawling;
import com.example.maptest.entity.Info;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CrawlingDTO {

    private String id;
//    private String name;
//    private Float score;
//    private Long review;
//    private String addr;
//    private Float lat;
//    private Float lng;
    private String loc;
    private List<Info> info;

    private Crawling toEntity() {
        Crawling crawling = Crawling.builder()
                .id(id)
//                .name(name)
//                .score(score)
//                .review(review)
//                .addr(addr)
//                .lat(lat)
//                .lng(lng)
                .loc(loc)
                .info(info)
                .build();
        return crawling;
    }
}
