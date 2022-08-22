package com.example.mongotest.service;

import com.example.mongotest.dto.MongoResponseDTO;
import com.example.mongotest.entity.*;
import com.example.mongotest.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MongoService {

    //    private final LandmarkRepository landmarkRepository;
//
//    public MongoResponseDTO getLandmarkList() {
//        List<Landmark> landmarkList = landmarkRepository.findLandmarkByLmname(lmname);
//        return new MongoResponseDTO(landmarkList);
//    }

    private final JamsilRepository jamsilRepository;
    private final DeoksugungRepository deoksugungRepository;
    private final GwanghwamoonRepository gwanghwamoonRepository;
    private final YesulRepository yesulRepository;
    private final MyeondongcathRepository myeondongcathRepository;
    private final HeunginjimoonRepository heunginjimoonRepository;
    private final DdpRepository ddpRepository;

    public MongoResponseDTO.JamsilDTO getJamsilList() {
        List<Jamsil> jamsilList = jamsilRepository.findAll();
        return new MongoResponseDTO.JamsilDTO(jamsilList);
    }

    public MongoResponseDTO.DeoksugungDTO getDeoksugungList() {
        List<Deoksugung> deoksugungList = deoksugungRepository.findAll();
        return new MongoResponseDTO.DeoksugungDTO(deoksugungList);
    }

    public MongoResponseDTO.GwanghwamoonDTO getGwanghwamoonList() {
        List<Gwanghwamoon> gwanghwamoonList = gwanghwamoonRepository.findAll();
        return new MongoResponseDTO.GwanghwamoonDTO(gwanghwamoonList);
    }

    public MongoResponseDTO.YesulDTO getyesulList() {
        List<Yesul> yesulList = yesulRepository.findAll();
        return new MongoResponseDTO.YesulDTO(yesulList);
    }

    public MongoResponseDTO.MyeondongcathDTO getMyeongdongcathList() {
        List<Myeongdongcath> myeongdongcathlList = myeondongcathRepository.findAll();
        return new MongoResponseDTO.MyeondongcathDTO(myeongdongcathlList);
    }

    public MongoResponseDTO.HeunginjimoonDTO getHeunginjimoonList() {
        List<Heunginjimoon> heunginjimoonList = heunginjimoonRepository.findAll();
        return new MongoResponseDTO.HeunginjimoonDTO(heunginjimoonList);
    }

    public MongoResponseDTO.DdpDTO getDdpList() {
        List<Ddp> ddpList = ddpRepository.findAll();
        return new MongoResponseDTO.DdpDTO(ddpList);
    }
}
