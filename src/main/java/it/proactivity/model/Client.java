package it.proactivity.model;
import java.util.*;

public class Client {
    private Long id;
    private String name;
    private String surname;
    private Integer age;

    private String address;

    private Set<Objects> loanBooks = new HashSet<>();

    private List<Objects> booksBought = new ArrayList<>();

    public Client() {}

    public Client(Long id, String name, String surname, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Objects> getLoanBooks() {
        return loanBooks;
    }

    public void setLoanBooks(Set<Objects> loanBooks) {
        this.loanBooks = loanBooks;
    }

    public List<Objects> getBooksBought() {
        return booksBought;
    }

    public void setBooksBought(List<Objects> booksBought) {
        this.booksBought = booksBought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name.toLowerCase(), client.name.toLowerCase()) &&
                Objects.equals(surname.toLowerCase(), client.surname.toLowerCase()) &&
                Objects.equals(age, client.age) &&
                Objects.equals(address.toLowerCase(), client.address.toLowerCase()) &&
                Objects.equals(loanBooks, client.loanBooks) && Objects.equals(booksBought, client.booksBought);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, address, loanBooks, booksBought);
    }

    @Override
    public String toString() {
        return """
                The name of the client is : %s,
                the surname is : %s,
                the age is : %s
                """.formatted(this.name, this.surname, this.age);
    }
}
