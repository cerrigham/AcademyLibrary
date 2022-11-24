package it.proactivity.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Client {

    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirthday;
    private Address address;
    private Boolean professor;
    private Boolean student;
    private String email;
    private String phoneNumber;

    public Client() {
    }

    public Client(Long id, String name, String surname, LocalDate dateOfBirthday, Address address,
                  Boolean professor, Boolean student, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.professor = professor;
        this.student = student;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getProfessor() {
        return professor;
    }

    public void setProfessor(Boolean professor) {
        this.professor = professor;
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname) && Objects.equals(dateOfBirthday, client.dateOfBirthday) &&
                Objects.equals(address, client.address) && Objects.equals(professor, client.professor) &&
                Objects.equals(student, client.student) && Objects.equals(email, client.email) &&
                Objects.equals(phoneNumber, client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, dateOfBirthday, address, professor, student, email, phoneNumber);
    }

    @Override
    public String toString() {
        return """
                The name of the client is : %s,
                the surname is : %s,
                the date of birthday : %s
                """.formatted(this.name, this.surname, this.dateOfBirthday);
    }

    public static Client clientInformation(String id, String name, String surname, String dateOfBirthday,
                                           Address address, String professor, String student, String email,
                                           String phoneNumber) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty()
                || dateOfBirthday == null || dateOfBirthday.isEmpty() || address == null
                || professor == null || professor.isEmpty() || student == null || student.isEmpty()
                || email == null || email.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        if (!(professor.equalsIgnoreCase("true") || professor.equalsIgnoreCase("false") || student.equalsIgnoreCase("true")
                || student.equalsIgnoreCase("false"))) {
            return null;
        }

        try {
            Long myId = Long.parseLong(id);
            Boolean isProfessor = Boolean.parseBoolean(professor);
            Boolean isStudent = Boolean.parseBoolean(student);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate parseDateOfBirth = LocalDate.parse(dateOfBirthday, formatter);

            return new Client(myId, name, surname, parseDateOfBirth, address, isProfessor, isStudent, email,
                    phoneNumber);
        } catch (DateTimeParseException e) {

            return null;
        }

    }
}


