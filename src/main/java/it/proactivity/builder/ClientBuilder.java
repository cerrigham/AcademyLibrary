package it.proactivity.builder;

import it.proactivity.model.Address;
import it.proactivity.model.Client;

import java.time.LocalDate;

public class ClientBuilder {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;
    private Address address;
    private Boolean professor;
    private Boolean student;
    private String email;
    private String phoneNumber;

    private ClientBuilder(Long id) {
        this.id = id;
    }

    public static ClientBuilder newClient(Long id) {
        return new ClientBuilder(id);
    }

    public ClientBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public ClientBuilder dateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
        return this;
    }

    public ClientBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public ClientBuilder professor(Boolean professor) {
        this.professor = professor;
        return this;
    }

    public ClientBuilder student(Boolean student) {
        this.student = student;
        return this;
    }

    public ClientBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ClientBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Client build() {
        return new Client(id, name, surname, dateOfBirthday, address, professor, student, email, phoneNumber);
    }

}
