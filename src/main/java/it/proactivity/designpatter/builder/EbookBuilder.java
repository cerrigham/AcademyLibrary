package it.proactivity.designpatter.builder;

import it.proactivity.model.*;

import java.time.LocalDateTime;

public class EbookBuilder {
    private Long id;
    private String title;
    private Author author;
    private PublishingHouse publishingHouse;
    private Float price;
    private Integer numberOfPages;
    private String yearOfPublication;
    private String reprint;
    private Genre genre;
    private String isbn;
    private Format format;
    private Float dimensionInKilobyte;
    private LocalDateTime expiringDate;

    private EbookBuilder(Long id) {
        this.id = id;
    }

    public static EbookBuilder newBuilder(Long id) {
        return new EbookBuilder(id);
    }


    public EbookBuilder title(String title) {
        this.title = title;
        return this;
    }
    public EbookBuilder author(Author author) {
        this.author = author;
        return this;
    }
    public EbookBuilder publishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
        return this;
    }
    public EbookBuilder price(Float price) {
        this.price = price;
        return this;
    }
    public EbookBuilder numberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }
    public EbookBuilder yearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        return this;
    }
    public EbookBuilder reprint(String reprint) {
        this.reprint = reprint;
        return this;
    }
    public EbookBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }
    public EbookBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public EbookBuilder format(Format format) {
        this.format = format;
        return this;
    }

    public EbookBuilder dimensionInKilobyte(Float dimensionInKilobyte) {
        this.dimensionInKilobyte = dimensionInKilobyte;
        return this;
    }

    public EbookBuilder expiringDate(LocalDateTime expiringDate) {
        this.expiringDate = expiringDate;
        return this;
    }

    public Ebook build() {
        return new Ebook(title, author, publishingHouse, id, price, numberOfPages, yearOfPublication, reprint, genre,
                isbn, format, dimensionInKilobyte, expiringDate);
    }

}
