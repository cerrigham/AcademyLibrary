package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class FilmDirector {
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;
    private LocalDate dateOfDeath;
    private String nationality;
    private Long id;
    private Float yearsOfActivity;
    private Integer age;
    private Integer numberOfProductions;

    public FilmDirector() {}

    public FilmDirector(String name, String surname, LocalDate dateOfBirthday, LocalDate dateOfDeath,
                        String nationality, Long id, Float yearsOfActivity, Integer age, Integer numberOfProductions) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.dateOfDeath = dateOfDeath;
        this.nationality = nationality;
        this.id = id;
        this.yearsOfActivity = yearsOfActivity;
        this.age = age;
        this.numberOfProductions = numberOfProductions;
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

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(Float yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfProductions() {
        return numberOfProductions;
    }

    public void setNumberOfProductions(Integer numberOfProductions) {
        this.numberOfProductions = numberOfProductions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmDirector that = (FilmDirector) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) &&
                Objects.equals(dateOfBirthday, that.dateOfBirthday) && Objects.equals(dateOfDeath, that.dateOfDeath)
                && Objects.equals(nationality, that.nationality) && Objects.equals(id, that.id)
                && Objects.equals(yearsOfActivity, that.yearsOfActivity) && Objects.equals(age, that.age) &&
                Objects.equals(numberOfProductions, that.numberOfProductions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirthday, dateOfDeath, nationality, id, yearsOfActivity, age, numberOfProductions);
    }

    @Override
    public String toString() {
        return "Film director: " + name + " " + surname + " " + yearsOfActivity + " " + numberOfProductions;
    }
}
