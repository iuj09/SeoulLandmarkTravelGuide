package com.example.maptest.controller;

import com.example.maptest.dto.*;
import com.example.maptest.service.MongoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/landmark")
public class MongoController {

    private final MongoServiceImpl mongoServiceImpl;

    @GetMapping("/{loc}")
    public ResponseEntity<?> getLocationList(@PathVariable String loc) {
        return ResponseEntity.ok().body(mongoServiceImpl.sendResponse(loc));

    }


}
