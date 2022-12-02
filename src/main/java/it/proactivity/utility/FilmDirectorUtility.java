package it.proactivity.utility;

import it.proactivity.builder.FilmDirectorBuilder;
import it.proactivity.model.FilmDirector;

import java.time.LocalDate;

public class FilmDirectorUtility {
    public static FilmDirector createfilmDirector(String id, String name, String surname, String dateOfBirthday,
                                                  String dateOfDeath, String nationality, String yearsOfActivity,
                                                  String numberOfProductions) {
        if (id == null || name == null || surname == null || dateOfBirthday == null || dateOfDeath == null ||
                nationality == null || yearsOfActivity == null || numberOfProductions == null) {
            return null;
        }

        Long parsedId = ParsingUtility.parseLong(id);
        Integer parsedNumberOfProductions = ParsingUtility.parseInteger(numberOfProductions);
        LocalDate parseDateOfBirth = ParsingUtility.parseLocalDateDayMonthYear(dateOfBirthday);
        LocalDate parseDateOfDeath = ParsingUtility.parseLocalDateDayMonthYear(dateOfDeath);
        if (parseDateOfBirth == null || parseDateOfDeath == null) {
            return null;
        }

        return FilmDirectorBuilder.newFilmDirector(parsedId)
                .name(name)
                .surname(surname)
                .dateOfBirthday(parseDateOfBirth)
                .dateOfDeath(parseDateOfDeath)
                .numberOfProductions(parsedNumberOfProductions)
                .build();
    }
}
