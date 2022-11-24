package it.proactivity.model;

import java.util.Objects;

public class PublishingHouse {

    private Long id;
    private String name;
    private String nationality;
    private String city;
    private Float revenue;
    private String foundator;
    private Integer numberOfEmployees;

    public PublishingHouse() {}

    public PublishingHouse(Long id, String name, String nationality, String city, Float revenue, String foundation,
                           Integer numberOfEmployees) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.city = city;
        this.revenue = revenue;
        this.foundator = foundation;
        this.numberOfEmployees = numberOfEmployees;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public String getFoundator() {
        return foundator;
    }

    public void setFoundator(String foundator) {
        this.foundator = foundator;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublishingHouse that = (PublishingHouse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) &&
                Objects.equals(nationality, that.nationality) && Objects.equals(city, that.city) &&
                Objects.equals(revenue, that.revenue) && Objects.equals(foundator, that.foundator) &&
                Objects.equals(numberOfEmployees, that.numberOfEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nationality, city, revenue, foundator, numberOfEmployees);
    }

    @Override
    public String toString() {
        return """
                La casa editrice si chiama %s, la sua nazione di provenienza è %s e a sede a %s.
                Ha un fatturato di %s e un numero di impiegati uguale a %s
                """.formatted(this.name, this.nationality, this.city, this.revenue, this.numberOfEmployees);
    }

    public static PublishingHouse createPublishingHouse(String id, String name, String nationality, String city,
                                                        String revenue, String foundator, String numberOfEmployees) {
        if(id == null || id.isEmpty() || name == null || name.isEmpty() || nationality == null || nationality.isEmpty()
        || city == null || city.isEmpty() || revenue == null || revenue.isEmpty() || foundator == null ||
        foundator.isEmpty() || numberOfEmployees == null || numberOfEmployees.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        //TODO manage parsing long, reveneu, numberOfEmplooyees
        Long parseId = Long.parseLong(id);
        Float parseRevenue = Float.parseFloat(revenue);
        Integer parseNumberOfEmployees = Integer.parseInt(numberOfEmployees);

        return new PublishingHouse(parseId,name,nationality,city,parseRevenue,foundator,parseNumberOfEmployees);
    }
}
