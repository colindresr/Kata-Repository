package com.kata.jwt.model;

public class Location {
    private String city;
    private String country;
    private String region;

    public Location(String city, String country, String region) {
        this.city = city;
        this.country = country;
        this.region = region;
    }


    // Getters y setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}