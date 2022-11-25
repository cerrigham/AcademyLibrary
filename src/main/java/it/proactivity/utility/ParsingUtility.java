package it.proactivity.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ParsingUtility {

    public static Long parseLong(String s) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static LocalDate parseLocalDateDayMonthYear(String s) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(s, formatter);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    public static Boolean parseBoolean(String s) {
        if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false")) {
            return Boolean.parseBoolean(s);
        } else {
            return null;
        }
    }


}
