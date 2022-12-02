package it.proactivity.designpatter.builder;

import it.proactivity.model.PublishingHouse;

public class PublishingHouseBuilder {

    private Long id;
    private String name;
    private String nationality;
    private String city;
    private Float revenue;
    private String foundator;
    private Integer numberOfEmployees;

    private PublishingHouseBuilder(Long id) {
        this.id = id;
    }

    public static PublishingHouseBuilder newBuilder(Long id) {
        return new PublishingHouseBuilder(id);
    }
    public PublishingHouseBuilder name(String name) {
        this.name = name;
        return this;
    }
    public PublishingHouseBuilder nationality(String nationality) {
        this.nationality = nationality;
        return this;
    } public PublishingHouseBuilder city(String city) {
        this.city = city;
        return this;
    } public PublishingHouseBuilder revenue(Float revenue) {
        this.revenue = revenue;
        return this;
    } public PublishingHouseBuilder foundator(String foundator) {
        this.foundator = foundator;
        return this;
    } public PublishingHouseBuilder numberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        return this;
    }

    public PublishingHouse build() {
        return new PublishingHouse(id, name, nationality, city, revenue, foundator, numberOfEmployees);
    }
}
