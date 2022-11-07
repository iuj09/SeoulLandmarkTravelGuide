package com.example.landmarkservice.entity;

import com.example.landmarkservice.dto.ToiletDTO;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "toilet")
@Getter
@Builder
public class Toilet {

    private String id;
    private String name;
    private Float lat;
    private Float lng;

    public ToiletDTO toDto() {
        ToiletDTO toiletDTO = ToiletDTO.builder()
                .id(id)
                .name(name)
                .lat(lat)
                .lng(lng)
                .build();
        return toiletDTO;
    }
}
