package com.kata.jwt.controller;

import com.kata.jwt.model.Location;
import com.kata.jwt.model.Weather;
import com.kata.jwt.model.WeatherReport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    @GetMapping("/{locationId}")
    public ResponseEntity<WeatherReport> getWeather(@PathVariable String locationId) {
        // Simulación del reporte del clima
        Location location = new Location("Bogotá", "Colombia", "Cundinamarca");
        Weather weather = new Weather(17.5, 994.71, 61);
        WeatherReport report = new WeatherReport(location, weather);
        return ResponseEntity.ok(report);
    }

    @PostMapping("/{locationId}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<WeatherReport> reportWeather(
            @PathVariable String locationId, @RequestBody Weather weather) {
        // Lógica para guardar el reporte del clima
        Location location = new Location("Bogotá", "Colombia", "Cundinamarca");
        WeatherReport report = new WeatherReport(location, weather);
        return ResponseEntity.status(HttpStatus.CREATED).body(report);
    }
}