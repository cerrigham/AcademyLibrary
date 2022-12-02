package it.proactivity.builder;

import it.proactivity.model.Cd;
import it.proactivity.model.MusicGenre;
import it.proactivity.model.Musician;

import java.time.LocalDate;

public class CdBuilder {
    private MusicGenre musicGenre;
    private Musician musician;
    private String title;
    private LocalDate dateOfPublication;

    private CdBuilder(String title) {
        this.title = title;
    }
    public static CdBuilder newCd(String title) {
        return newCd(title);
    }

    public CdBuilder musicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }

    public CdBuilder musician(Musician musician) {
        this.musician = musician;
        return this;
    }

    public CdBuilder dateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
        return this;
    }

    public Cd build() {
        return new Cd(musicGenre,musician, title, dateOfPublication);
    }
}
