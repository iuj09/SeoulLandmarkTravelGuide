package com.example.maptest.dto;

import com.example.maptest.entity.Landmark;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LandmarkDTO {

    private String id;
    private String name;
    private Float lat;
    private Float lng;

    private Landmark toEntity() {
        Landmark landmark = Landmark.builder()
                .id(id)
                .name(name)
                .lat(lat)
                .lng(lng)
                .build();
        return landmark;
    }

}
