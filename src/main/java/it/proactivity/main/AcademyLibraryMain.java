package it.proactivity.main;

import it.proactivity.model.*;
import it.proactivity.utility.BookUtility;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import java.time.LocalDate;
import java.time.Month;

public class AcademyLibraryMain {

    public static void main(String[] args) {

        PublishingHouse rscMediaGroup = new PublishingHouse(001l, "RSC MediaGroup", "Italy",
                "Milan", 846000000f, "Angelo Rizzoli", 4000);

        Author georgeMartin = new Author(1l, "George R.R.", "Martin",
                LocalDate.of(1948, 9, 20), null, "American");

        Author andreaDeCarlo = new Author(2l, "Andrea", "de Carlo",
                LocalDate.of(1958, 9, 20), null, "Italian");

        Book gamesOfThromeTheWindsOfWinter = BookUtility.createBook("Game of Thrones The Winds of Winter", georgeMartin,
                rscMediaGroup, "1", "21.25", "1200",
                "2012", "first reprint", Genre.Fantasy,
                "99999999999999");

        Book dueDiDue = BookUtility.createBook("Due di Due", andreaDeCarlo,
                rscMediaGroup, "1", "21.25", "1200",
                "1987", "first reprint", Genre.Novel,
                "999999111999999");

        /*
        System.out.println(book);

        Map<String, String> openingDays = new HashMap<>();
        openingDays.put("Monday", "09.00-12.00;14.00-19.00");
        openingDays.put("Tuesday", "09.00-12.00;14.00-19.00");
        openingDays.put("Wednesday", "09.00-12.00;14.00-19.00");
        openingDays.put("Thursday", "09.00-12.00;14.00-19.00");
        openingDays.put("Friday", "09.00-12.00;14.00-19.00");

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale", new Address("3b", "via del corso",
                "Vigevano", "PV", "Italy"),
                false, openingDays);

        System.out.println(libraryDetail);
        Client marcoRossi = new Client(001l, "Marco", "Rossi",
                LocalDate.of(2019, Month.AUGUST, 22), new Address("45", "corso repubblica", "Vigevano", "PV", "Italy"),
                Boolean.FALSE, Boolean.TRUE, "marco.rossi22@gmail.com", "3338657482");
        System.out.println(marcoRossi);
        */

    }
}
