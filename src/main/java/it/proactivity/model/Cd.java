package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Cd extends LibraryItem {

    private MusicGenre musicGenre;
    private Musician musician;

    private LocalDate dateOfPublication;

    public Cd() {
    }

    public Cd(Long id, MusicGenre musicGenre, Musician musician, String title, LocalDate dateOfCreation) {
        super.setId(id);
        super.setTitle(title);
        this.musicGenre = musicGenre;
        this.musician = musician;
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
                Objects.equals(dateOfPublication, cd.dateOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicGenre, musician, dateOfPublication);
    }

    @Override
    public String toString() {
        return """
                [Cd] [%s] [%s]
                """.formatted(super.getTitle(), this.musicGenre);
    }
}
