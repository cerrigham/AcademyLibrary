package it.proactivity.main;

import it.proactivity.model.*;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import java.time.LocalDate;
import java.time.Month;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        Book book = new Book("Game of Thrones The Winds of Winter", "George R.R. Martin",
                "Bantam", 1l, 21.25f, 1200,
                Boolean.FALSE, "2012", "first reprint", Genre.Fantasy,
                "99999999999999");
        System.out.println(book);

        Map<String, String> openingDays = new HashMap<>();
        openingDays.put("Monday", "9.00-12.00;14.00-19.00");
        openingDays.put("Tuesday", "9.00-12.00;14.00-19.00");
        openingDays.put("Wednesday", "9.00-12.00;14.00-19.00");
        openingDays.put("Thursday", "9.00-12.00;14.00-19.00");
        openingDays.put("Friday", "9.00-12.00;14.00-19.00");

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale", new Address("3b", "via del corso", "Vigevano", "PV", "Italy"),
                false, openingDays);

        System.out.println(libraryDetail);
        Client marcoRossi = new Client(001l, "Marco", "Rossi",
                LocalDate.of(2019, Month.AUGUST, 22), new Address("45", "corso repubblica", "Vigevano", "PV", "Italy"),
                Boolean.FALSE, Boolean.TRUE, "marco.rossi22@gmail.com", "3338657482");
        System.out.println(marcoRossi);
    }
}