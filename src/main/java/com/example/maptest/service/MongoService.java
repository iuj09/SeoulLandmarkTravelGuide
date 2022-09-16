package com.example.maptest.service;

import com.example.maptest.dto.LandmarkDTO;
import com.example.maptest.dto.RequestDTO;
import com.example.maptest.dto.ResponseDTO;
import com.example.maptest.entity.Crawling;
import com.example.maptest.entity.Landmark;
import com.example.maptest.entity.Toilet;
import com.example.maptest.repository.CrawlingRepository;
import com.example.maptest.repository.LandmarkRepository;
import com.example.maptest.repository.ToiletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MongoService {

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


    public Crawling getCrawlingList(String loc) {
        Crawling crawlingList = crawlingRepository.findByLoc(loc);
        return crawlingList;
    }


//    public ResponseDTO sendResponse(String loc) {
//
//        LandmarkDTO landmarkDTO = getLandmarkName(loc).toDto();
////        List<Toilet> toiletList = getToiletList();
//        Crawling crawlingList = getCrawlingList(loc);
//
//        ResponseDTO responseDTO = new ResponseDTO();
//        responseDTO.setLandmark(landmarkDTO);
////        responseDTO.setToiletList(toiletList);
//        responseDTO.setCrawlingList(crawlingList);
//
//        return  responseDTO;
//    }

    public ResponseDTO sendResponse(RequestDTO requestDTO) {

        LandmarkDTO landmarkDTO = getLandmarkName(requestDTO.getLabels()).toDto();
        List<Toilet> toiletList = getToiletList();
        Crawling crawlingList = getCrawlingList(requestDTO.getLabels());
//        ResponseDTO responseDTO = new ResponseDTO();
//        responseDTO.setLandmark(landmarkDTO);
//        responseDTO.setToiletList(toiletList);
//        responseDTO.setCrawlingList(crawlingList);

            ResponseDTO responseDTO = new ResponseDTO();
            responseDTO.setLandmark(landmarkDTO);
            responseDTO.setCrawlingList(crawlingList);
            responseDTO.setToiletList(toiletList);

            return responseDTO;
        }

}
