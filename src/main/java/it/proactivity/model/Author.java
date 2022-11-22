package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Author {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateofBirth;
    private LocalDate dateofDeath;
    private String nationality;

    Author() {
    }

    public Author(Long id, String name, String surname, LocalDate dateofBirth, LocalDate dateofDeath,
                  String nationality) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateofBirth = dateofBirth;
        this.dateofDeath = dateofDeath;
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public LocalDate getDateofDeath() {
        return dateofDeath;
    }

    public void setDateofDeath(LocalDate dateofDeath) {
        this.dateofDeath = dateofDeath;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "id :" + id + "Name : " + name + "Surname: " + surname + "Date of birth: " + dateofBirth +
                "Date of death: " + dateofDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname) && Objects.equals(dateofBirth, author.dateofBirth) &&
                Objects.equals(dateofDeath, author.dateofDeath) &&
                Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, dateofBirth, dateofDeath, nationality);
    }
}
