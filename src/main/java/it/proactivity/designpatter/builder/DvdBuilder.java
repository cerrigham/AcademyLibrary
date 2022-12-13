package it.proactivity.designpatter.builder;

import it.proactivity.model.Dvd;
import it.proactivity.model.DvdGenre;
import it.proactivity.model.FilmDirector;
import it.proactivity.model.FilmStudio;

public class DvdBuilder {

    private Long id;
    private String title;
    private Float duration;
    private FilmDirector filmDirector;
    private DvdGenre dvdGenre;
    private FilmStudio filmStudio;
    private Boolean familyFriendly;

    private DvdBuilder(Long id) {
        this.id = id;
    }

    public static DvdBuilder newBuilder(Long id) {
        return new DvdBuilder(id);
    }

    public DvdBuilder title(String title) {
        this.title = title;
        return this;
    }

    public DvdBuilder duration(Float duration) {
        this.duration = duration;
        return this;
    }

    public DvdBuilder filmDirector(FilmDirector filmDirector) {
        this.filmDirector = filmDirector;
        return this;
    }

    public DvdBuilder dvdGenre(DvdGenre dvdGenre) {
        this.dvdGenre = dvdGenre;
        return this;
    }

    public DvdBuilder filmStudio(FilmStudio filmStudio) {
        this.filmStudio = filmStudio;
        return this;
    }

    public DvdBuilder familyFriendly(Boolean familyFriendly) {
        this.familyFriendly = familyFriendly;
        return this;
    }

    public Dvd build() {
        return new Dvd(id, title, duration, filmDirector, dvdGenre, filmStudio, familyFriendly);
    }
}
