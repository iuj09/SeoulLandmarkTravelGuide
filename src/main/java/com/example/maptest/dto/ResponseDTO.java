package com.example.maptest.dto;

import com.example.maptest.entity.Crawling;
import com.example.maptest.entity.Landmark;
import com.example.maptest.entity.Toilet;
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
