package com.example.mongotest.service;

import com.example.mongotest.dto.MongoResponseDTO;
import com.example.mongotest.entity.Jamsil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MongoService {

    private final MongoRepository mongoRepository;

    public MongoResponseDTO.JamsilDTO getJamsilList() {
        List<Jamsil> jamsilList = mongoRepository.findAll();
        return new MongoResponseDTO.JamsilDTO(jamsilList);
    }
}
