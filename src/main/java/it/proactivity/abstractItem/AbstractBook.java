package it.proactivity.abstractItem;

import it.proactivity.model.Author;
import it.proactivity.model.Genre;
import it.proactivity.model.LibraryItem;
import it.proactivity.model.PublishingHouse;

public abstract class AbstractBook extends LibraryItem {

    String title;
    Author author;
    PublishingHouse publishingHouse;
    Integer numberOfPages;
    String yearOfPublication;
    Genre genre;

    public AbstractBook(String title, Author author, PublishingHouse publishingHouse, Integer numberOfPages,
                        String yearOfPublication, Genre genre) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
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

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }



}
