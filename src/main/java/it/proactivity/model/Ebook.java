package it.proactivity.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ebook extends Book {

    private Format format;
    private Float dimensionInKilobyte;
    private LocalDateTime expiringDate;

    public Ebook() {
    }

    public Ebook(Format format, Float dimensionInKilobyte, LocalDateTime expiringDate) {
        this.format = format;
        this.dimensionInKilobyte = dimensionInKilobyte;
        this.expiringDate = expiringDate;
    }

    public Ebook(String title, Author author, PublishingHouse publishingHouse, Long id, Float price,
                 Integer numberOfPages,  String yearOfPublication, String reprint, Genre genre, String isbn,
                 Format format, Float dimensionInKilobyte, LocalDateTime expiringDate) {
        super(title, author, publishingHouse, id, price, numberOfPages, yearOfPublication, reprint, genre, isbn);
        this.format = format;
        this.dimensionInKilobyte = dimensionInKilobyte;
        this.expiringDate = expiringDate;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Float getDimensionInKilobyte() {
        return dimensionInKilobyte;
    }

    public void setDimensionInKilobyte(Float dimensionInKilobyte) {
        this.dimensionInKilobyte = dimensionInKilobyte;
    }

    public LocalDateTime getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(LocalDateTime expiringDate) {
        this.expiringDate = expiringDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ebook ebook = (Ebook) o;
        return format == ebook.format && Objects.equals(dimensionInKilobyte, ebook.dimensionInKilobyte) && Objects.equals(expiringDate, ebook.expiringDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), format, dimensionInKilobyte, expiringDate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ " + getTitle() + "]" + " ").append("[ " +getFormat() + "]" + " ").
                append("[" + getDimensionInKilobyte() + "]" + " ").
                append("[" + getExpiringDate() + "]");
        return stringBuilder.toString();
    }
}

