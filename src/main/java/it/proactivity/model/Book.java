package it.proactivity.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private PublishingHouse publishingHouse;
    private Long id;
    private Float price;
    private Integer numberOfPages;
    private Boolean Virtual;
    private String yearOfPublication;
    private String reprint;
    private Genre genre;
    private String isbn;

    public Book() {}

    public Book(String title, Author author, PublishingHouse publishingHouse, Long id, Float price,
                Integer numberOfPages, Boolean isVirtual, String yearOfPublication, String reprint, Genre genre,
                String isbn) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.id = id;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.Virtual = isVirtual;
        this.yearOfPublication = yearOfPublication;
        this.reprint = reprint;
        this.genre = genre;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Boolean getVirtual() {
        return Virtual;
    }

    public void setVirtual(Boolean virtual) {
        Virtual = virtual;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getReprint() {
        return reprint;
    }

    public void setReprint(String reprint) {
        this.reprint = reprint;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) && Objects.equals(id, book.id) &&
                Objects.equals(price, book.price) &&
                Objects.equals(numberOfPages, book.numberOfPages) && Objects.equals(Virtual, book.Virtual) &&
                Objects.equals(yearOfPublication, book.yearOfPublication) &&
                Objects.equals(reprint, book.reprint) && genre == book.genre && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingHouse, id, price, numberOfPages, Virtual, yearOfPublication,
                reprint, genre, isbn);
    }

    @Override
    public String toString() {
        return title + " " + author + " " + id;
    }

    public static Book createBook(String title, Author author, PublishingHouse publishingHouse, String id, String price,
                                  String numberOfPage, String virtual, String yearOfPublication, String reprint,
                                  Genre genre, String isbn) {
        if(title == null || title.isEmpty() || author == null || publishingHouse == null || id == null || id.isEmpty()
        || price == null || price.isEmpty() || numberOfPage == null || numberOfPage.isEmpty() || virtual == null ||
        virtual.isEmpty() || yearOfPublication == null || yearOfPublication.isEmpty() || reprint == null ||
                reprint.isEmpty() || genre == null || isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }

        //TODO manage id, price, pages, virtual
        Long parseId = Long.parseLong(id);
        Float parsePrice = Float.parseFloat(price);
        Integer parseNumberOfPage = Integer.parseInt(numberOfPage);
        Boolean parseVirtual = Boolean.parseBoolean(virtual);

        return new Book(title,author,publishingHouse,parseId,parsePrice,parseNumberOfPage,parseVirtual,yearOfPublication,
                reprint,genre,isbn);
    }
}
