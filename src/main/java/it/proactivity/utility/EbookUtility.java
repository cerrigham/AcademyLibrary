package it.proactivity.utility;

import it.proactivity.designpatter.builder.EbookBuilder;
import it.proactivity.designpatter.singleton.Catalog;
import it.proactivity.model.*;

import java.time.LocalDateTime;

public class EbookUtility {
    public static Ebook createEbook(String title, Author author, PublishingHouse publishingHouse, String id, String price,
                             String numberOfPages, String yearOfPublication, String reprint, Genre genre, String isbn,
                             Format format, String dimensionInKilobyte, String expiringDate) {

        if (title == null || title.isEmpty() || author == null || publishingHouse == null || id == null || id.isEmpty()
        || price == null || price.isEmpty() || numberOfPages == null || numberOfPages.isEmpty() ||
                yearOfPublication == null || yearOfPublication.isEmpty() || reprint == null || reprint.isEmpty() ||
        genre == null || isbn == null || isbn.isEmpty() || format == null || dimensionInKilobyte == null ||
        dimensionInKilobyte.isEmpty() || expiringDate == null || expiringDate.isEmpty()) {
            return null;
        }

        Long parsedId = ParsingUtility.parseLong(id);
        Float parsedPrice = ParsingUtility.parseFloat(price);
        Integer parsedNumberOfPage = ParsingUtility.parseInteger(numberOfPages);
        Float parsedDimensionInKilobyte = ParsingUtility.parseFloat(dimensionInKilobyte);
        LocalDateTime parsedExpiringDate = ParsingUtility.parseDateTime(expiringDate);

        if (parsedId == null || parsedPrice == null || parsedNumberOfPage == null || parsedDimensionInKilobyte == null
        || parsedExpiringDate == null) {
            return null;
        }
        Ebook ebook = EbookBuilder.newBuilder(parsedId)
                .title(title)
                .author(author)
                .numberOfPages(parsedNumberOfPage)
                .price(parsedPrice).yearOfPublication(yearOfPublication)
                .dimensionInKilobyte(parsedDimensionInKilobyte)
                .expiringDate(parsedExpiringDate)
                .format(format).genre(genre)
                .reprint(reprint)
                .publishingHouse(publishingHouse)
                .yearOfPublication(yearOfPublication)
                .isbn(isbn).build();

        Catalog catalog = Catalog.getInstance();
        catalog.writeItemDetailsIntoLibraryCatalogFile(ebook.toString());
        return ebook;

    }
}
