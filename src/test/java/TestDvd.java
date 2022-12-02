import it.proactivity.model.Dvd;
import it.proactivity.model.DvdGenre;
import it.proactivity.model.FilmDirector;
import it.proactivity.model.FilmStudio;
import it.proactivity.utility.DvdUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDvd {

    @Test
    public void CreateDvdTest() {
        FilmDirector filmDirector = new FilmDirector();
        FilmStudio filmStudio = new FilmStudio();
        Dvd dvd = DvdUtility.createDvd("1","titanic","2.00",filmDirector, DvdGenre.Romance,
                filmStudio,"true");
        assertEquals(1,dvd.getId());


    }
}
