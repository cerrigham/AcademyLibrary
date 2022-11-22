package it.proactivity.model;

import java.time.LocalDateTime;
import java.util.*;

public class LibraryDetail {

    private String name;
    private String address;
    private Boolean municipal;

    private Map<String, String> openingDaysAndHours = new HashMap<>();

    public LibraryDetail() {}

    public LibraryDetail(String name, String address, Boolean municipal, Map<String, String> openingDaysAndHours) {
        this.name = name;
        this.address = address;
        this.municipal = municipal;
        this.openingDaysAndHours = openingDaysAndHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getMunicipal() {
        return municipal;
    }

    public void setMunicipal(Boolean municipal) {
        this.municipal = municipal;
    }

    public Map<String, String> getOpeningDaysAndHours() {
        return openingDaysAndHours;
    }

    public void setOpeningDaysAndHours(Map<String, String> openingDaysAndHours) {
        this.openingDaysAndHours = openingDaysAndHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryDetail that = (LibraryDetail) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address)
                && Objects.equals(municipal, that.municipal)
                && Objects.equals(openingDaysAndHours, that.openingDaysAndHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, municipal, openingDaysAndHours);
    }

    @Override
    public String toString() {
        return "LibraryDetail{" +
                "name='" + name + '\'' +
                '}';
    }
}
