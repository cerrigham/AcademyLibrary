package it.proactivity.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class LibraryDetail {

    private String name;
    private Address address;
    private Boolean municipal;

    private Map<String, String> openingDaysAndHours = new HashMap<>();

    public LibraryDetail() {}

    public LibraryDetail(String name, Address address, Boolean municipal, Map<String, String> openingDaysAndHours) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public static Map<DayOfWeek, List<LocalTime>> openingHours() {

        List<LocalTime> myList = new LinkedList<>();
        myList.add(LocalTime.parse("9.00-12.00;14.00-19.00"));
        myList.add(LocalTime.parse("9.00-12.00;14.00-19.00"));
        myList.add(LocalTime.parse("9.00-12.00;14.00-19.00"));
        myList.add(LocalTime.parse("9.00-12.00;14.00-19.00"));
        myList.add(LocalTime.parse("9.00-12.00;14.00-19.00"));

        Map<DayOfWeek, List<LocalTime>> myMap = new HashMap<>();
        myMap.put(DayOfWeek.MONDAY, myList);
        myMap.put(DayOfWeek.TUESDAY, myList);
        myMap.put(DayOfWeek.WEDNESDAY, myList);
        myMap.put(DayOfWeek.THURSDAY, myList);
        myMap.put(DayOfWeek.FRIDAY, myList);

        return myMap;
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
