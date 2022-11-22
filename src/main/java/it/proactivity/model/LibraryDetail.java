package it.proactivity.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class LibraryDetail {

    private String adress;
    private Boolean comunal;
    private LocalDateTime timeThatOpens;
    private Calendar dayThatIsOpen;
    private Map<String, LocalDateTime> localDateTimeMap = new TreeMap<>();

    LibraryDetail() {}

    public LibraryDetail(String adress, Boolean comunal, LocalDateTime timeThatOpens, Calendar dayThatIsOpen,
                         Map<String, LocalDateTime> localDateTimeMap) {
        this.adress = adress;
        this.comunal = comunal;
        this.timeThatOpens = timeThatOpens;
        this.dayThatIsOpen = dayThatIsOpen;
        this.localDateTimeMap = localDateTimeMap;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Boolean getComunal() {
        return comunal;
    }

    public void setComunal(Boolean comunal) {
        this.comunal = comunal;
    }

    public LocalDateTime getTimeThatOpens() {
        return timeThatOpens;
    }

    public void setTimeThatOpens(LocalDateTime timeThatOpens) {
        this.timeThatOpens = timeThatOpens;
    }

    public Calendar getDayThatIsOpen() {
        return dayThatIsOpen;
    }

    public void setDayThatIsOpen(Calendar dayThatIsOpen) {
        this.dayThatIsOpen = dayThatIsOpen;
    }

    public Map<String, LocalDateTime> getLocalDateTimeMap() {
        return localDateTimeMap;
    }

    public void setLocalDateTimeMap(Map<String, LocalDateTime> localDateTimeMap) {
        this.localDateTimeMap = localDateTimeMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryDetail that = (LibraryDetail) o;
        return Objects.equals(adress, that.adress) && Objects.equals(comunal, that.comunal) && Objects.equals(timeThatOpens, that.timeThatOpens) && Objects.equals(dayThatIsOpen, that.dayThatIsOpen) && Objects.equals(localDateTimeMap, that.localDateTimeMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, comunal, timeThatOpens, dayThatIsOpen, localDateTimeMap);
    }

    @Override
    public String toString() {
        return   adress + " " + timeThatOpens + " " + comunal + " " + dayThatIsOpen
                + " " + localDateTimeMap;
    }




}
