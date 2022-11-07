package com.example.landmarkservice.dto;

import com.example.landmarkservice.entity.Crawling;
import com.example.landmarkservice.entity.Toilet;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

    private LandmarkDTO landmark;
    private Crawling crawlingList;
    private List<Toilet> toiletList;
}
