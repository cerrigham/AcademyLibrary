package it.proactivity.builder;

import it.proactivity.model.Author;

import java.time.LocalDate;

public class AuthorBuilder {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    private String nationality;

    private AuthorBuilder(Long id) {
        this.id = id;
    }

    public static AuthorBuilder newAuthor(Long id) {
        return new AuthorBuilder(id);
    }

    public AuthorBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public AuthorBuilder dateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public AuthorBuilder dateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
        return this;
    }

    public AuthorBuilder nationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Author build() {
        return new Author(id, name, surname, dateOfBirth, dateOfDeath, nationality);
    }

}
