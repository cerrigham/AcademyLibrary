package it.proactivity.model;

import java.time.LocalDateTime;
import java.util.*;

public class LibraryDetail {

    private String address;
    private Boolean comunal;

    private Map<String, String> openingDaysAndHours = new HashMap<>();
    private Map<String, String> closingDaysAndHours = new HashMap<>();


    LibraryDetail() {
    }

    public LibraryDetail(String address, Boolean comunal, Map<String, String> openingDaysAndHours,
                         Map<String, String> closingDaysAndHours) {
        this.address = address;
        this.comunal = comunal;
        this.openingDaysAndHours = openingDaysAndHours;
        this.closingDaysAndHours = closingDaysAndHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getComunal() {
        return comunal;
    }

    public void setComunal(Boolean comunal) {
        this.comunal = comunal;
    }

    public Map<String, String> getOpeningDaysAndHours() {
        return openingDaysAndHours;
    }

    public void setOpeningDaysAndHours(Map<String, String> openingDaysAndHours) {
        this.openingDaysAndHours = openingDaysAndHours;
    }

    public Map<String, String> getClosingDaysAndHours() {
        return closingDaysAndHours;
    }

    public void setClosingDaysAndHours(Map<String, String> closingDaysAndHours) {
        this.closingDaysAndHours = closingDaysAndHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryDetail that = (LibraryDetail) o;
        return Objects.equals(address, that.address) && Objects.equals(comunal, that.comunal)
                && Objects.equals(openingDaysAndHours, that.openingDaysAndHours) &&
                Objects.equals(closingDaysAndHours, that.closingDaysAndHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, comunal, openingDaysAndHours, closingDaysAndHours);
    }

    @Override
    public String toString() {
        return address + " " + comunal + " " + closingDaysAndHours
                + " " + openingDaysAndHours;
    }


}
