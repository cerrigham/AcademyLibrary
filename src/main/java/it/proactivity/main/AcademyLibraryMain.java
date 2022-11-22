package it.proactivity.main;

import it.proactivity.model.*;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import java.time.LocalDate;
import java.time.Month;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        Author author = new Author(1l, "George R.R.","Martin",
                LocalDate.of(1948, 9,20),null,"American");
        Book book = new Book("Game of Thrones The Winds of Winter", author,
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

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale", "Via del centro",
                false, openingDays);

        System.out.println(libraryDetail);
        Client marcoRossi = new Client(001l, "Marco", "Rossi",
                LocalDate.of(2019, Month.AUGUST, 22), "corso regina 4",
                Boolean.FALSE, Boolean.TRUE, "marco.rossi22@gmail.com", "3338657482");
        System.out.println(marcoRossi);
    }
}