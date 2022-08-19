package com.example.mongotest.controller;

import com.example.mongotest.dto.MongoResponseDTO;
import com.example.mongotest.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MongoController {

    private final MongoService mongoService;

    @GetMapping("/jamsil")
    public MongoResponseDTO.JamsilDTO findAll() {
        return (MongoResponseDTO.JamsilDTO) mongoService.getJamsilList();
    }
}
