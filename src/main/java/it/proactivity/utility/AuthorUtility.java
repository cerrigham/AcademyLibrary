package it.proactivity.utility;

import it.proactivity.model.Author;

import java.time.LocalDate;

public class AuthorUtility {
    public static Author createAuthor(String id, String name, String surname, String dateOfBirth, String dateOfDeath,
                                      String nationality) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty()
                || dateOfBirth == null || dateOfBirth.isEmpty() || dateOfDeath == null || dateOfDeath.isEmpty() ||
                nationality == null || nationality.isEmpty()) {
            return null;
        }

        Long parsedId = ParsingUtility.parseLong(id);
        if (parsedId == null) {
            return null;
        }

        LocalDate parseDateOfBirth = ParsingUtility.parseLocalDateDayMonthYear(dateOfBirth);
        LocalDate parseDateOfDeath = ParsingUtility.parseLocalDateDayMonthYear(dateOfBirth);
        if (parseDateOfBirth == null || parseDateOfDeath == null) {
            return null;
        }

        return new Author(parsedId, name, surname, parseDateOfBirth, parseDateOfDeath, nationality);
    }
}
