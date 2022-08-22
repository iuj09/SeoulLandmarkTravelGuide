package com.example.mongotest.controller;

import com.example.mongotest.dto.MongoResponseDTO;
import com.example.mongotest.entity.Landmark;
import com.example.mongotest.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/landmark")
public class MongoController {

    private final MongoService mongoService;

//    @GetMapping("/landmark/{lmname}")
//    public MongoResponseDTO getLandmarkList(@PathVariable String lmname) {
//        List<Landmark> landmarkList = mongoService.getLandmarkList(lmname);
//        return (MongoResponseDTO) mongoService.getLandmarkList();
//    }

    @GetMapping("/jamsil")
    public MongoResponseDTO.JamsilDTO findJamsilList() {
        return (MongoResponseDTO.JamsilDTO) mongoService.getJamsilList();
    }

    @GetMapping("/deoksugung")
    public MongoResponseDTO.DeoksugungDTO findDeoksugungList() {
        return (MongoResponseDTO.DeoksugungDTO) mongoService.getDeoksugungList();
    }

    @GetMapping("/gwanghwamoon")
    public MongoResponseDTO.GwanghwamoonDTO findGwanghwamoonList() {
        return (MongoResponseDTO.GwanghwamoonDTO) mongoService.getGwanghwamoonList();
    }

    @GetMapping("/yesul")
    public MongoResponseDTO.YesulDTO findYesulList() {
        return (MongoResponseDTO.YesulDTO) mongoService.getyesulList();
    }

    @GetMapping("/myeongondcath")
    public MongoResponseDTO.MyeondongcathDTO findMyeondongcathList() {
        return (MongoResponseDTO.MyeondongcathDTO) mongoService.getMyeongdongcathList();
    }

    @GetMapping("/heunginjimoon")
    public MongoResponseDTO.HeunginjimoonDTO findHeunginjimoonList() {
        return (MongoResponseDTO.HeunginjimoonDTO) mongoService.getHeunginjimoonList();
    }

    @GetMapping("/ddp")
    public MongoResponseDTO.DdpDTO findDdpList() {
        return (MongoResponseDTO.DdpDTO) mongoService.getDdpList();
    }
}
