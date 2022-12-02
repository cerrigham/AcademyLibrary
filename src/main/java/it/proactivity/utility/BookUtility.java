package it.proactivity.utility;

import it.proactivity.designpatter.builder.BookBuilder;
import it.proactivity.designpatter.singleton.Catalog;
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

        Book book = BookBuilder.newBuilder(parsedId)
                .title(title)
                .genre(genre)
                .author(author)
                .isbn(isbn)
                .numberOfPages(parsedNumberOfPage)
                .reprint(reprint).price(parsedPrice)
                .yearOfPublication(yearOfPublication)
                .publishingHouse(publishingHouse)
                .price(parsedPrice).build();

        Catalog catalog = Catalog.getInstance();
        catalog.writeItemDetailsIntoLibraryCatalogFile(book.toString());

        return book;
    }
}
