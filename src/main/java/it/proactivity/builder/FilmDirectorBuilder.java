package it.proactivity.builder;

import it.proactivity.model.FilmDirector;

import java.time.LocalDate;

public class FilmDirectorBuilder {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;
    private LocalDate dateOfDeath;
    private String nationality;
    private Float yearsOfActivity;
    private Integer numberOfProductions;

    private FilmDirectorBuilder(Long id) {
        this.id = id;
    }
    public static FilmDirectorBuilder newFilmDirector(Long id) {
        return new FilmDirectorBuilder(id);
    }

    public FilmDirectorBuilder name(String name) {
        this.name = name;
        return this;
    }

    public FilmDirectorBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public FilmDirectorBuilder dateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
        return this;
    }

    public FilmDirectorBuilder dateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        return this;
    }

    public FilmDirectorBuilder nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public FilmDirectorBuilder yearsOfActivity(Float yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
        return this;
    }

    public FilmDirectorBuilder numberOfProductions(Integer numberOfProductions) {
        this.numberOfProductions = numberOfProductions;
        return this;
    }

    public FilmDirector build() {
        return new FilmDirector(name, surname, dateOfBirthday, dateOfDeath, nationality, id, yearsOfActivity, numberOfProductions);
    }
}
