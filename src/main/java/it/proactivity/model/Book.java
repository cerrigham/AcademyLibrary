package it.proactivity.model;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String publishingHouse;
    private Long id;
    private Float cost;
    private Integer numberOfPages;
    private Boolean isVirtual;

    public Book() {}

    public Book(String title, String author, String publishingHouse, Long id, Float cost, Integer numberOfPages,
                Boolean isVirtual) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.id = id;
        this.cost = cost;
        this.numberOfPages = numberOfPages;
        this.isVirtual = isVirtual;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Boolean getVirtual() {
        return isVirtual;
    }

    public void setVirtual(Boolean virtual) {
        isVirtual = virtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishingHouse, book.publishingHouse) && Objects.equals(id, book.id) && Objects.equals(cost, book.cost) && Objects.equals(numberOfPages, book.numberOfPages) && Objects.equals(isVirtual, book.isVirtual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingHouse, id, cost, numberOfPages, isVirtual);
    }

    @Override
    public String toString() {
        return title + " " + author + " " + id;
    }
}
