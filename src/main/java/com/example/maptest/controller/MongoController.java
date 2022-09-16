package com.example.maptest.controller;

import com.example.maptest.dto.RequestDTO;
import com.example.maptest.service.MongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/landmark")
public class MongoController {

    private final MongoService mongoService;

//    @GetMapping("/{loc}")
//    public ResponseEntity<?> getLocationList(@PathVariable String loc) {
//        return ResponseEntity.ok().body(mongoService.sendResponse(loc));
//    }



    @PostMapping("/result")
    public ResponseEntity<?> getLocationList(@RequestBody RequestDTO requestDTO) {
        return ResponseEntity.ok().body(mongoService.sendResponse(requestDTO));
    }

    //    {'CustomLabels': 'deoksugoong'}

}
