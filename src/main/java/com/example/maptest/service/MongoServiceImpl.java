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

//    @Builder
//    public ResponseDTO entityToDTO() {
//
//        String name = "jamsil";
//        Landmark landjamsil = getLandmarkName(name);
//
//        List<Toilet> toiletList = toiletRepository.findAll();
//
//        ResponseDTO responseDTO = ResponseDTO.builder()
//                .id(jamsil.getId())
//                .Name(jamsil.getName())
//                .Score(jamsil.getScore())
//                .Addr(jamsil.getAddr())
//                .lat(jamsil.getLat())
//                .lng(jamsil.getLng())
//                .lmid(landjamsil.getId())
//                .lmname(landjamsil.getName())
//                .lmlat(landjamsil.getLat())
//                .lmlng(landjamsil.getLng())
//                .tlid(toiletList.getId())
//                .tlname(toiletList.getName())
//                .tllat(toiletList.getLat())
//                .tllng(toiletList.getLng())
//                .build();
//        return jamsilDTO;
//    }
}
