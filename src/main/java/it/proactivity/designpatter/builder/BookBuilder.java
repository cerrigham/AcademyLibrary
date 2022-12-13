package it.proactivity.designpatter.builder;

import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;

public class BookBuilder {
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

    private BookBuilder(Long id) {
        this.id = id;
    }

    public static BookBuilder newBuilder(Long id) {
        return new BookBuilder(id);
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(Author author) {
        this.author = author;
        return this;
    }

    public BookBuilder publishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
        return this;
    }

    public BookBuilder price(Float price) {
        this.price = price;
        return this;
    }

    public BookBuilder numberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    public BookBuilder yearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        return this;
    }

    public BookBuilder reprint(String reprint) {
        this.reprint = reprint;
        return this;
    }

    public BookBuilder genre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public BookBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book build() {
        return new Book(title, author, publishingHouse, id, price, numberOfPages, yearOfPublication, reprint, genre,
                isbn);
    }
}
