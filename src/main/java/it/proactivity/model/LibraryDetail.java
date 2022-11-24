package it.proactivity.model;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

    public Map<DayOfWeek, List<LocalTime>> openingDaysAndHourstoLocalDateTime() {
        Map<DayOfWeek, List<LocalTime>> mapOpeningDaysAndHourstoLocalDateTime = new HashMap<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

        try {
            for (Map.Entry<String, String> entry : getOpeningDaysAndHours().entrySet()) {
                DayOfWeek dayOfWeek = DayOfWeek.valueOf(entry.getKey().toUpperCase());

                List<LocalTime> localDateTimeList = new LinkedList<>();
                String[] arrayOpeningHour = entry.getValue().split(";");
                String[] morningOpeningHour = arrayOpeningHour[0].split("-");
                String[] afternoonOpeningHour = arrayOpeningHour[1].split("-");

                for(String s : morningOpeningHour) {
                    LocalTime time = LocalTime.parse(s, formatter);
                    localDateTimeList.add(time);
                }

                for(String s : afternoonOpeningHour) {
                    LocalTime time = LocalTime.parse(s, formatter);
                    localDateTimeList.add(time);
                }

                mapOpeningDaysAndHourstoLocalDateTime.put(dayOfWeek, localDateTimeList);
            }
            return mapOpeningDaysAndHourstoLocalDateTime;
        } catch (Exception e) {
            //TODO manage log message for this error (when we introduce log)
            return null;
        }

    }
}
