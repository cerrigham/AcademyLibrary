package it.proactivity.main;

import it.proactivity.model.Book;
import it.proactivity.model.Genre;

import java.util.Date;

public class AcademyLibraryMain {

    public static void main(String[] args) {
        Book book = new Book("Game of Thrones The Winds of Winter", "George R.R. Martin",
                "Bantam", 1l, 21.25f, 1200,
                Boolean.FALSE, null, "first reprint", Genre.Fantasy,
                "99999999999999");
        System.out.println(book);
        System.out.println("Welcome to Academy Library Project");

    }
}
