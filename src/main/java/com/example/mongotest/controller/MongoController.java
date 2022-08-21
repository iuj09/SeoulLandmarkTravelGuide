package com.example.mongotest.controller;

import com.example.mongotest.dto.MongoResponseDTO;
import com.example.mongotest.entity.Landmark;
import com.example.mongotest.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MongoController {

    private final MongoService mongoService;

//    @GetMapping("/landmark/{lmname}")
//    public MongoResponseDTO getLandmarkList(@PathVariable String lmname) {
//        List<Landmark> landmarkList = mongoService.getLandmarkList(lmname);
//        return (MongoResponseDTO) mongoService.getLandmarkList();
//    }

    @GetMapping("/landmark/jamsil")
    public MongoResponseDTO.JamsilDTO getJamsilList() {
        return (MongoResponseDTO.JamsilDTO) mongoService.getJamsilList();
    }

    @GetMapping("/landmark/deoksugung")
    public MongoResponseDTO.DeoksugungDTO getDeoksugungList() {
        return (MongoResponseDTO.DeoksugungDTO) mongoService.getDeoksugungList();
    }

    @GetMapping("/landmark/gwanghwamoon")
    public MongoResponseDTO.GwanghwamoonDTO getGwanghwamoonList() {
        return (MongoResponseDTO.GwanghwamoonDTO) mongoService.getGwanghwamoonList();
    }

    @GetMapping("/landmark/yesul")
    public MongoResponseDTO.YesulDTO getYesulList() {
        return (MongoResponseDTO.YesulDTO) mongoService.getyesulList();
    }

    @GetMapping("/landmark/myeongondcath")
    public MongoResponseDTO.MyeondongcathDTO getMyeondongcathList() {
        return (MongoResponseDTO.MyeondongcathDTO) mongoService.getMyeongdongcathList();
    }

    @GetMapping("/landmark/heunginjimoon")
    public MongoResponseDTO.HeunginjimoonDTO getHeunginjimoonList() {
        return (MongoResponseDTO.HeunginjimoonDTO) mongoService.getHeunginjimoonList();
    }

    @GetMapping("/landmark/ddp")
    public MongoResponseDTO.DdpDTO getDdpList() {
        return (MongoResponseDTO.DdpDTO) mongoService.getDdpList();
    }
}
