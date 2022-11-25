package it.proactivity.utility;

import it.proactivity.model.Author;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AuthorUtility {
    public static Author createAuthor(String id, String name, String surname, String dateOfBirth, String dateOfDeath,
                                      String nationality) {
        if(id == null || id.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty()
                || dateOfBirth == null || dateOfBirth.isEmpty() || dateOfDeath == null || dateOfDeath.isEmpty() ||
                nationality == null || nationality.isEmpty()) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        // TODO manager parse id and date
        Long parseId = Long.parseLong(id);
        Locale locale = new Locale("it","IT");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parseDateOfBirth = LocalDate.parse(dateOfBirth,formatter);
        LocalDate parseDateOfDeath = LocalDate.parse(dateOfDeath,formatter);

        return new Author(parseId,name,surname,parseDateOfBirth,parseDateOfDeath,nationality);
    }
}
