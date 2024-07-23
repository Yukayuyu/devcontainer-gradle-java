package com.example.demo.controller;

import com.example.demo.model.SampleModel;
import com.example.demo.service.MapperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/samples")
public class SampleController {

    private final MapperService mapperService;

    public SampleController(MapperService mapperService) {
        this.mapperService = mapperService;
    }

    @GetMapping
    public List<SampleModel> getAllSamples() {
        return mapperService.getAllSamples();
    }
}
