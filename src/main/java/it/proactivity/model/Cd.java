package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Cd extends LibraryItem {

    private MusicGenre musicGenre;
    private Musician musician;
    private String title;
    private LocalDate dateOfPublication;

    public Cd() {
    }

    public Cd(Long id, MusicGenre musicGenre, Musician musician, String title, LocalDate dateOfCreation) {
        super.setId(id);
        this.musicGenre = musicGenre;
        this.musician = musician;
        this.title = title;
        this.dateOfPublication = dateOfCreation;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cd cd = (Cd) o;
        return musicGenre == cd.musicGenre && Objects.equals(musician, cd.musician) &&
                Objects.equals(title, cd.title) && Objects.equals(dateOfPublication, cd.dateOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicGenre, musician, title, dateOfPublication);
    }

    @Override
    public String toString() {
        return """
                [Cd]  [%s canta %s] [%s]
                """.formatted(this.musician.getName(), this.title, this.musicGenre);
    }
}
