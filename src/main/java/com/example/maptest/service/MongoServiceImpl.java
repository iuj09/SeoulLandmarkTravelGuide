package com.example.maptest.service;

import com.example.maptest.dto.LandmarkDTO;
import com.example.maptest.dto.ResponseDTO;
import com.example.maptest.entity.Crawling;
import com.example.maptest.entity.Landmark;
import com.example.maptest.entity.Toilet;
import com.example.maptest.repository.CrawlingRepository;
import com.example.maptest.repository.LandmarkRepository;
import com.example.maptest.repository.ToiletRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MongoServiceImpl{

    private final MongoRepository mongoRepository;
    private final LandmarkRepository landmarkRepository;
    private final ToiletRepository toiletRepository;
    private final CrawlingRepository crawlingRepository;

    public Landmark getLandmarkName(String name) {
        Landmark landmarkName = landmarkRepository.findByName(name);
        return landmarkName;
    }

    public List<Toilet> getToiletList() {
        List<Toilet> toiletList = toiletRepository.findAll();
        return toiletList;
    }

    public List<Crawling> getCrawlingList() {
        List<Crawling> crawlingList = crawlingRepository.findAll();
        return crawlingList;
    }

    public ResponseDTO sendResponse(String loc) {
        LandmarkDTO a = getLandmarkName(loc).toDto();
        List<Toilet> b = getToiletList();
        List<Crawling> c = getCrawlingList();

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setLandmark(a);
        responseDTO.setToiletList(b);
        responseDTO.setCrawlingList(c);

        return  responseDTO;

    }

}
