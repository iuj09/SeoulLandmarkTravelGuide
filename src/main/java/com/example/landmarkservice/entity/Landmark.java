package com.example.landmarkservice.entity;

import com.example.landmarkservice.dto.LandmarkDTO;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "landmark")
@Getter
@Builder
public class Landmark {

    private String id;
    private String name;
    private Float lat;
    private Float lng;

    public LandmarkDTO toDto() {
        LandmarkDTO landmarkDTO = LandmarkDTO.builder()
                .id(id)
                .name(name)
                .lat(lat)
                .lng(lng)
                .build();
        return landmarkDTO;
    }
}
