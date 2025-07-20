package com.example.WeatherApp.service;

import com.example.WeatherApp.model.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String apiKey = "be115ffb3f484f3096975101252007";

    public WeatherResponse fetchWeather(String location) {
        String url = "https://api.weatherapi.com/v1/current.json?key="
                + apiKey + "&q=" + location + "&aqi=no";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url, WeatherResponse.class);
        return response.getBody();
    }
}