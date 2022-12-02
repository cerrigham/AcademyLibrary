package it.proactivity.utility;

import it.proactivity.designpatter.builder.DvdBuilder;
import it.proactivity.model.Dvd;
import it.proactivity.model.DvdGenre;
import it.proactivity.model.FilmDirector;
import it.proactivity.model.FilmStudio;

public class DvdUtility {
    public static Dvd createDvd(String id, String title, String duration, FilmDirector filmDirector, DvdGenre dvdGenre,
                                FilmStudio filmStudio, String familyFriendly) {

        if (id == null || id.isEmpty() || title == null || title.isEmpty() || duration == null || duration.isEmpty()
        || filmDirector == null || dvdGenre == null || filmStudio == null || familyFriendly == null || familyFriendly.isEmpty()) {
            return null;
        }

        Long parsedId = ParsingUtility.parseLong(id);
        Float parsedDuration = ParsingUtility.parseFloat(duration);
        Boolean parsedFamiliFriendly = ParsingUtility.parseBoolean(familyFriendly);

        if (parsedFamiliFriendly == null || parsedId == null || parsedDuration == null) {
            return null;
        }

        return DvdBuilder.newBuilder(parsedId)
                .title(title)
                .duration(parsedDuration)
                .filmDirector(filmDirector)
                .dvdGenre(dvdGenre)
                .filmStudio(filmStudio)
                .familyFriendly(parsedFamiliFriendly).build();
    }
}
