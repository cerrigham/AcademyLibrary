package it.proactivity.model;

import java.util.Objects;

public class Dvd extends LibraryItem {

    private String title;
    private Float duration;
    private FilmDirector filmDirector;
    private DvdGenre dvdGenre;
    private FilmStudio filmStudio;
    private Boolean familyFriendly;

    public Dvd() {}

    public Dvd(Long id, String title, Float duration, FilmDirector filmDirector, DvdGenre dvdGenre, FilmStudio filmStudio,
               Boolean familyFriendly) {
        super.setId(id);
        this.title = title;
        this.duration = duration;
        this.filmDirector = filmDirector;
        this.dvdGenre = dvdGenre;
        this.filmStudio = filmStudio;
        this.familyFriendly = familyFriendly;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public FilmDirector getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(FilmDirector filmDirector) {
        this.filmDirector = filmDirector;
    }

    public DvdGenre getDvdGenre() {
        return dvdGenre;
    }

    public void setDvdGenre(DvdGenre dvdGenre) {
        this.dvdGenre = dvdGenre;
    }

    public FilmStudio getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(FilmStudio filmStudio) {
        this.filmStudio = filmStudio;
    }

    public Boolean getFamilyFriendly() {
        return familyFriendly;
    }

    public void setFamilyFriendly(Boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        return Objects.equals(title, dvd.title) && Objects.equals(duration, dvd.duration)
                && Objects.equals(filmDirector, dvd.filmDirector) && dvdGenre == dvd.dvdGenre
                && Objects.equals(filmStudio, dvd.filmStudio) && Objects.equals(familyFriendly, dvd.familyFriendly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, filmDirector, dvdGenre, filmStudio, familyFriendly);
    }

    @Override
    public String toString() {
        return title + " " + duration + " " + filmDirector + " " + familyFriendly;
    }
}
