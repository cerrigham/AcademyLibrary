package it.proactivity.main;

import it.proactivity.model.Client;

import java.time.LocalDate;
import java.time.Month;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Academy Library Project");
        Client client1 = new Client(001l, "Marco", "Rossi", LocalDate.of(2019, Month.AUGUST, 22), "corso regina 4",
                Boolean.FALSE, Boolean.TRUE, "marco.rossi22@gmail.com", "3338657482");
        System.out.println(client1);
    }


}
