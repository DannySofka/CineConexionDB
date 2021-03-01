package com.co.sofka.app.Modelo;

import java.security.Timestamp;

public class FilmActor {
    private short id;
    private Film film;
    private Timestamp lastUpdate;

    public FilmActor(short id, Film idFilm, Timestamp lastUpdate) {
        this.id = id;
        this.film = idFilm;
        this.lastUpdate = lastUpdate;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Film getIdFilm() {
        return film;
    }

    public void setIdFilm(Film idFilm) {
        this.film = idFilm;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
