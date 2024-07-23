package com.example.demo.service;

import com.example.demo.mapper.SampleMapper;
import com.example.demo.model.SampleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapperService {

    private final SampleMapper sampleMapper;

    public MapperService(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public List<SampleModel> getAllSamples() {
        return sampleMapper.findAll();
    }
}
