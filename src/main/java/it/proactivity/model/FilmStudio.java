package it.proactivity.model;

import java.util.Objects;

public class FilmStudio {
    private String name;
    private Address address;
    private Long id;
    private Float revenue;
    private Integer numberOfEmployees;
    private Boolean indieProductions;
    private String city;

    public FilmStudio() {}

    public FilmStudio(String name, Address address, Long id, Float revenue, Integer numberOfEmployees,
                      Boolean indieProductions, String city) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.revenue = revenue;
        this.numberOfEmployees = numberOfEmployees;
        this.indieProductions = indieProductions;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Boolean getIndieProductions() {
        return indieProductions;
    }

    public void setIndieProductions(Boolean indieProductions) {
        this.indieProductions = indieProductions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmStudio that = (FilmStudio) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) &&
                Objects.equals(id, that.id) && Objects.equals(revenue, that.revenue) &&
                Objects.equals(numberOfEmployees, that.numberOfEmployees) &&
                Objects.equals(indieProductions, that.indieProductions) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, id, revenue, numberOfEmployees, indieProductions, city);
    }

    @Override
    public String toString() {
        return name + " " + id + " " + address + " " + city;
    }
}
