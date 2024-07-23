package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@Service
public class ApiService {

  private final RestTemplate restTemplate;

  @Autowired
  public ApiService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String getExternalApiData() {
    String url = "http://localhost:8080/api/";
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    return response.getBody();
  }
}
