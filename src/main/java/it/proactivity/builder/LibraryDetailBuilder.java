package it.proactivity.builder;

import it.proactivity.model.Address;
import it.proactivity.model.LibraryDetail;
import it.proactivity.model.LibraryItem;

import java.util.HashMap;
import java.util.Map;

public class LibraryDetailBuilder {
    private String name;
    private Address address;
    private Boolean municipal;
    private Map<String, String> openingDaysAndHours = new HashMap<>();

    public LibraryDetailBuilder(String name) {
        this.name = name;
    }

    public static LibraryDetailBuilder newLibraryDetailBuilder (String name) {
        return new LibraryDetailBuilder(name);
    }

    public LibraryDetailBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public LibraryDetailBuilder municipal(Boolean municipal) {
        this.municipal = municipal;
        return this;
    }

    public LibraryDetailBuilder openingDaysAndHours(Map<String, String> openingDaysAndHours) {
        this.openingDaysAndHours = openingDaysAndHours;
        return this;
    }

    public LibraryDetail build() {
        return new LibraryDetail(name, address, municipal, openingDaysAndHours);
    }

}
