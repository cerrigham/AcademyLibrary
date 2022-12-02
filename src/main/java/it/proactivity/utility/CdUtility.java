package it.proactivity.utility;

import it.proactivity.builder.CdBuilder;
import it.proactivity.designpatter.singleton.Catalog;
import it.proactivity.model.Cd;
import it.proactivity.model.MusicGenre;
import it.proactivity.model.Musician;

import java.time.LocalDate;

public class CdUtility {
    public static Cd createCd(String id ,MusicGenre musicGenre, Musician musician, String title, String dateOfPublication) {

        if (id == null || id.isEmpty() ||musicGenre == null || musician == null || title == null || title.isEmpty() ||
                dateOfPublication== null || dateOfPublication.isEmpty()) {
            return null;
        }
        Long parsedId = ParsingUtility.parseLong(id);
        LocalDate parsedDateOfPublication = ParsingUtility.parseLocalDateDayMonthYear(dateOfPublication);
        if (parsedDateOfPublication == null || parsedId == null) {
            return null;
        }

        Cd cd = new Cd(parsedId, musicGenre, musician, title, parsedDateOfPublication);
        Catalog catalog = Catalog.getInstance();
        catalog.writeItemDetailsIntoLibraryCatalogFile(cd.toString());

        return CdBuilder.newCd(title)
                .musicGenre(musicGenre)
                .musician(musician)
                .dateOfPublication(parsedDateOfPublication)
                .build();
    }
}
