package it.proactivity.main;

import it.proactivity.model.Book;
import it.proactivity.model.Genre;

import java.util.Date;

import it.proactivity.model.LibraryDetail;

import java.util.HashMap;
import java.util.Map;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        Book book = new Book("Game of Thrones The Winds of Winter", "George R.R. Martin",
                "Bantam", 1l, 21.25f, 1200,
                Boolean.FALSE, null, "first reprint", Genre.Fantasy,
                "99999999999999");
        System.out.println(book);
        System.out.println("Welcome to Academy Library Project");


        Map<String, String> openingDays = new HashMap<>();
        openingDays.put("Monday", "9.00-12.00;14.00-19.00");
        openingDays.put("Tuesday", "9.00-12.00;14.00-19.00");
        openingDays.put("Wednesday", "9.00-12.00;14.00-19.00");
        openingDays.put("Thursday", "9.00-12.00;14.00-19.00");
        openingDays.put("Friday", "9.00-12.00;14.00-19.00");

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale", "Via del centro",
                false, openingDays);

        System.out.println(libraryDetail);
    }
}
