package it.proactivity.utility;

import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;

public class BookUtility {

    public static Book createBook(String title, Author author, PublishingHouse publishingHouse, String id, String price,
                                  String numberOfPage, String virtual, String yearOfPublication, String reprint,
                                  Genre genre, String isbn) {
        if (title == null || title.isEmpty() || author == null || publishingHouse == null || id == null || id.isEmpty()
                || price == null || price.isEmpty() || numberOfPage == null || numberOfPage.isEmpty() || virtual == null ||
                virtual.isEmpty() || yearOfPublication == null || yearOfPublication.isEmpty() || reprint == null ||
                reprint.isEmpty() || genre == null || isbn == null || isbn.isEmpty()) {
            return null;
        }

        Boolean parsedBoolean = ParsingUtility.parseBoolean(virtual);
        if (parsedBoolean == null) {
            return null;
        }

        try {
            Long parseId = Long.parseLong(id);
            Float parsePrice = Float.parseFloat(price);
            Integer parseNumberOfPage = Integer.parseInt(numberOfPage);
            return new Book(title, author, publishingHouse, parseId, parsePrice, parseNumberOfPage, parsedBoolean,
                    yearOfPublication, reprint, genre, isbn);

        } catch (NumberFormatException e) {
            return null;
        }
    }
}
