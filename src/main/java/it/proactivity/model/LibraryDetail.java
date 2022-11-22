package it.proactivity.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class LibraryDetail {
    private String books;
    private String place;
    private LocalDateTime timeThatOpens;
    private LocalDateTime timeThatCloses;
    private LocalDate DaysThatIsOpen;
    private LocalDate DaysThatIsClose;

    LibraryDetail() {
    }

    public LibraryDetail(String books, String place, LocalDateTime timeThatOpens,
                         LocalDateTime timeThatCloses,
                         LocalDate daysThatIsOpen, LocalDate daysThatIsClose) {
        this.books = books;
        this.place = place;
        this.timeThatOpens = timeThatOpens;
        this.timeThatCloses = timeThatCloses;
        DaysThatIsOpen = daysThatIsOpen;
        DaysThatIsClose = daysThatIsClose;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDateTime getTimeThatOpens() {
        return timeThatOpens;
    }

    public void setTimeThatOpens(LocalDateTime timeThatOpens) {
        this.timeThatOpens = timeThatOpens;
    }

    public LocalDateTime getTimeThatCloses() {
        return timeThatCloses;
    }

    public void setTimeThatCloses(LocalDateTime timeThatCloses) {
        this.timeThatCloses = timeThatCloses;
    }

    public LocalDate getDaysThatIsOpen() {
        return DaysThatIsOpen;
    }

    public void setDaysThatIsOpen(LocalDate daysThatIsOpen) {
        DaysThatIsOpen = daysThatIsOpen;
    }

    public LocalDate getDaysThatIsClose() {
        return DaysThatIsClose;
    }

    public void setDaysThatIsClose(LocalDate daysThatIsClose) {
        DaysThatIsClose = daysThatIsClose;
    }

    @Override
    public String toString() {
        return books + " " + place + " " + timeThatOpens + " " + timeThatCloses + " " + getDaysThatIsOpen()
                + " " + getDaysThatIsClose();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryDetail that = (LibraryDetail) o;
        return Objects.equals(books, that.books) && Objects.equals(place, that.place) &&
                Objects.equals(timeThatOpens, that.timeThatOpens) &&
                Objects.equals(timeThatCloses, that.timeThatCloses) &&
                Objects.equals(DaysThatIsOpen, that.DaysThatIsOpen) &&
                Objects.equals(DaysThatIsClose, that.DaysThatIsClose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, place, timeThatOpens, timeThatCloses, DaysThatIsOpen, DaysThatIsClose);
    }
}
