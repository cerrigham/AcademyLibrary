package it.proactivity.main;

import it.proactivity.model.LibraryDetail;

import java.util.HashMap;
import java.util.Map;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        Map<String, String> openingDays = new HashMap<>();
        openingDays.put("Monday 9.00-12.00","14.00-19.00");
        openingDays.put("Thuesday 9.00-12.00","14.00-19.00");
        openingDays.put("Wensday 9.00-12.00","14.00-19.00");
        openingDays.put("Thursday 9.00-12.00","14.00-19.00");
        openingDays.put("Friday 9.00-12.00","14.00-19.00");

        LibraryDetail libraryDetail = new LibraryDetail("Biblioteca centrale","Via del centro",
                false,openingDays);

        System.out.println(libraryDetail);
    }
}
