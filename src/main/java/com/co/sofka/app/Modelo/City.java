package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class City {
    private short id;
    private String cityName;
    private Country country;
    private Timestamp lastUpdate;

    public City(short id, String cityName, Country country, Timestamp lastUpdate) {
        this.id = id;
        this.cityName = cityName;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
