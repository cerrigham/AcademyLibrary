package it.proactivity.utility;

import it.proactivity.librarysingleton.Catalog;
import it.proactivity.model.Musician;

public class MusicianUtility {

    public static Musician createMusician(String id, String name, String nationality, String age) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || nationality == null || nationality.isEmpty()
        || age == null || age.isEmpty()) {
            return null;
        }
        Long parsedId = ParsingUtility.parseLong(id);
        if (parsedId == null) {
            return null;
        }

        Musician musician = new Musician(parsedId, name, nationality, age);
        Catalog catalog = Catalog.getIstance();
        catalog.writeFile(musician);
        return musician;
    }


}
