package it.proactivity.utility;

import it.proactivity.model.Cd;
import it.proactivity.model.FileDesignPattern;
import it.proactivity.model.MusicGenre;
import it.proactivity.model.Musician;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class CdUtility {
    public static Cd createCd(Long id, MusicGenre musicGenre, Musician musician, String title,
                              LocalDate dateOfCreation) {
        if (id == null || musicGenre == null || musician == null || title == null || title == null ||
                dateOfCreation == null) {
            throw new NullPointerException();
        }

        return new Cd(id, musicGenre, musician, title, dateOfCreation);
    }

    public static FileDesignPattern fileDesignPattern() throws FileNotFoundException {
        FileDesignPattern file1 = FileDesignPattern.getInstance();
    }
}
