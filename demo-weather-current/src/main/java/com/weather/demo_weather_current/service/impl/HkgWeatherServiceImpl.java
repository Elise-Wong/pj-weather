package com.weather.demo_weather_current.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.demo_weather_current.service.HkgWeatherService;

@Service
public class HkgWeatherServiceImpl implements HkgWeatherService{
  //api website
    @Value("${currentWeather.hkg.base-url}")
    private String baseUrl;

    @Value("${currentWeather.hkg.endpoints.current}")
    private String currentEndpoint;

    @Value("${currentWeather.hkg.params.lang}")
    private String lang;

    // private final RestTemplate restTemplate = new RestTemplate();

    // @Override
    // public String fetchCurrentWeather() {
    //     String url = String.format("%s?dataType=%s&lang=%s", baseUrl, currentEndpoint, lang);
    //     return restTemplate.getForObject(url, String.class);
    // }


}
