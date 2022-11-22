package it.proactivity.main;

import it.proactivity.model.Book;
import it.proactivity.model.Genre;

import java.util.Date;

import it.proactivity.model.LibraryDetail;

import java.util.HashMap;
import java.util.Map;

import it.proactivity.model.Client;

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

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale", "Via del centro",
                false, openingDays);

        System.out.println(libraryDetail);
        Client marcoRossi = new Client(001l, "Marco", "Rossi",
                LocalDate.of(2019, Month.AUGUST, 22), "corso regina 4",
                Boolean.FALSE, Boolean.TRUE, "marco.rossi22@gmail.com", "3338657482");
        System.out.println(marcoRossi);
    }
}