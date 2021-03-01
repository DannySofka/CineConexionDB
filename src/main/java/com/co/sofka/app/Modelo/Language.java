package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class Language {
    private short id;
    private String languageName;
    private Timestamp lastUpdate;

    public Language(short id, String languageName, Timestamp lastUpdate) {
        this.id = id;
        this.languageName = languageName;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
