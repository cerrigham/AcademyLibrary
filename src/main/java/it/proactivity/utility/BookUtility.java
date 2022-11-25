package it.proactivity.utility;

import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;

public class BookUtility {

    public static Book createBook(String title, Author author, PublishingHouse publishingHouse, String id, String price,
                                  String numberOfPage, String yearOfPublication, String reprint,
                                  Genre genre, String isbn) {
        if (title == null || title.isEmpty() || author == null || publishingHouse == null || id == null || id.isEmpty()
                || price == null || price.isEmpty() || numberOfPage == null || numberOfPage.isEmpty()
                 || yearOfPublication == null || yearOfPublication.isEmpty() || reprint == null ||
                reprint.isEmpty() || genre == null || isbn == null || isbn.isEmpty()) {
            return null;
        }

        Long parsedId = ParsingUtility.parseLong(id);
        Float parsedPrice = ParsingUtility.parseFloat(price);
        Integer parsedNumberOfPage = ParsingUtility.parseInteger(numberOfPage);
        if (parsedId == null || parsedPrice == null || parsedNumberOfPage == null) {
            return null;
        }

        return new Book(title, author, publishingHouse, parsedId, parsedPrice, parsedNumberOfPage,
                yearOfPublication, reprint, genre, isbn);
    }
}
