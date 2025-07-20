package com.example.WeatherApp.controller;

import com.example.WeatherApp.model.WeatherResponse;
import com.example.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/current")
    public WeatherResponse getWeather(@RequestParam String location) {
        return weatherService.fetchWeather(location);
    }
}