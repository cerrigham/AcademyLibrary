package it.proactivity.utility;

import it.proactivity.model.Address;
import it.proactivity.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ClientUtility {

    public static Client clientInformation(String id, String name, String surname, String dateOfBirthday,
                                           Address address, String professor, String student, String email,
                                           String phoneNumber) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || surname == null || surname.isEmpty()
                || dateOfBirthday == null || dateOfBirthday.isEmpty() || address == null
                || professor == null || professor.isEmpty() || student == null || student.isEmpty()
                || email == null || email.isEmpty() || phoneNumber == null || phoneNumber.isEmpty()) {
            return null;
        }

        if (!(professor.equalsIgnoreCase("true") || professor.equalsIgnoreCase("false") || student.equalsIgnoreCase("true")
                || student.equalsIgnoreCase("false"))) {
            return null;
        }


        Long myId = ParsingUtility.parseLong(id);
        Boolean isProfessor = ParsingUtility.parseBoolean(professor);
        Boolean isStudent = ParsingUtility.parseBoolean(student);
        LocalDate parsedDateOfBirth = ParsingUtility.parseLocalDateDayMonthYear(dateOfBirthday);

        if(myId == null || isProfessor == null || isStudent == null || parsedDateOfBirth == null) {
            return null;
        }

        return new Client(myId, name, surname, parsedDateOfBirth, address, isProfessor, isStudent, email,
                phoneNumber);
        
    }
}
