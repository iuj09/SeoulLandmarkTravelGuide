package com.example.landmarkservice.entity;

import com.example.landmarkservice.dto.CrawlingDTO;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "crawling")
@Getter
@Builder
public class Crawling {


    private String id;
//    private String name;
//    private Float score;
//    private Long review;
//    private String addr;
//    private Float lat;
//    private Float lng;
    private String loc;
    private List<Info> info;


    public CrawlingDTO toDto() {
        CrawlingDTO crawlingDTO = CrawlingDTO.builder()
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
        return crawlingDTO;
    }
}
