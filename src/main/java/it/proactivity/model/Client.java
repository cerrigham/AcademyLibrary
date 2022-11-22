package it.proactivity.model;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private Integer age;
    private String personalCode;
    private Float eight;
    private String eyesColor;

    public Client() {}

    public Client(String name, String surname, Integer age, String personalCode, Float eight, String eyesColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalCode = personalCode;
        this.eight = eight;
        this.eyesColor = eyesColor;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public Float getEight() {
        return eight;
    }

    public void setEight(Float eight) {
        this.eight = eight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name.toLowerCase(), client.name.toLowerCase()) &&
                Objects.equals(surname.toLowerCase(), client.surname.toLowerCase()) &&
                Objects.equals(age, client.age) &&
                Objects.equals(personalCode.toLowerCase(), client.personalCode.toLowerCase()) &&
                Objects.equals(eight, client.eight) &&
                Objects.equals(eyesColor.toLowerCase(), client.eyesColor.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, personalCode, eight, eyesColor);
    }

    @Override
    public String toString() {
        return """
                The name of the client is : %s,
                the surname is : %s,
                the age is : %s,
                the personal code is : %s,
                is taller : %s,
                and the color of the eyes is : %s  
             
                """.formatted(this.name, this.surname, this.age, this.personalCode, this.eight, this.eyesColor);
    }
}
