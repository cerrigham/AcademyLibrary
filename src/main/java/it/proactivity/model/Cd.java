package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Cd {

    private Long id;
    private MusicGenre musicGenre;
    private Musician musician;
    private String title;
    private LocalDate dateOfPublication;

    public Cd() {}

    public Cd(Long id, MusicGenre musicGenre, Musician musician, String title, LocalDate dateOfCreation) {
        this.id = id;
        this.musicGenre = musicGenre;
        this.musician = musician;
        this.title = title;
        this.dateOfPublication = dateOfCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                Objects.equals(title, cd.title) && Objects.equals(dateOfPublication,cd.dateOfPublication) &&
                Objects.equals(id, cd.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicGenre, musician, title, dateOfPublication,id);
    }

    @Override
    public String toString() {
        return """
                The name of Cd is : %s, the musician is %s and the genre is %s
                """.formatted(this,title, this.musician, this.musicGenre);
    }
}
