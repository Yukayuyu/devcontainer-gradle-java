package com.example.demo.mapper;

import com.example.demo.model.SampleModel;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
  List<SampleModel> findAll();
}
