import it.proactivity.model.*;
import it.proactivity.utility.AuthorUtility;
import it.proactivity.utility.EbookUtility;
import it.proactivity.utility.PublishingHouseUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEbook {

    @Test
    public void createBookTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Ebook ebook = EbookUtility.createEbook("Il piccolo principe",antoineDeSaintExupéry,gillimard,"1",
                "150","200","1943","first", Genre.Fantasy,"99898766",
                Format.HTML, "100.5", "12-12-2022 15:30");

        assertEquals("Il piccolo principe", ebook.getTitle());
    }
}
