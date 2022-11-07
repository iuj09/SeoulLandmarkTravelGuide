package com.example.landmarkservice.dto;

import com.example.landmarkservice.entity.Toilet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ToiletDTO {

    private String id;
    private String name;
    private Float lat;
    private Float lng;

    private Toilet toEntity() {
        Toilet toilet = Toilet.builder()
                .id(id)
                .name(name)
                .lat(lat)
                .lng(lng)
                .build();
        return toilet;
    }
}
