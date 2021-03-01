package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class Country {
    private short id;
    private String countryName;
    private Timestamp lastUpdate;

    public Country(short id, String countryName, Timestamp lastUpdate) {
        this.id = id;
        this.countryName = countryName;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
