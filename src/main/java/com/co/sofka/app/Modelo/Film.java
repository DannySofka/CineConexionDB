package com.co.sofka.app.Modelo;

import java.security.Timestamp;
import java.time.Year;

public class Film {
    private short id;
    private String title;
    private String description;
    private Year releaseYear;
    private Language language;
    private int rentalDuration;
    private float rentalDate;
    private short length;
    private float replacementCost;
    private Timestamp lastUpdate;

    public Film(short id, String title, String description, Year releaseYear, Language language, int rentalDuration, float rentalDate, short length, float replacementCost, Timestamp lastUpdate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.language = language;
        this.rentalDuration = rentalDuration;
        this.rentalDate = rentalDate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(float rentalDate) {
        this.rentalDate = rentalDate;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
