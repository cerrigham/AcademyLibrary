package it.proactivity.model;

import java.util.Objects;

public class Musician {

    private Long id;
    private String name;
    private String nationality;
    private String age;

    public Musician() {
    }

    public Musician(Long id, String name, String nationality, String age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return Objects.equals(name, musician.name) && Objects.equals(nationality, musician.nationality) &&
                Objects.equals(age, musician.age) && Objects.equals(id, musician.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationality, age, id);
    }

    @Override
    public String toString() {
        return """
            [Musician]    The name of the musician is [%s]  is from [%s] and is old [%s]
                """.formatted(this.name, this.nationality, this.age);
    }
}
