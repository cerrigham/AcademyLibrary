import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBook {

    Author antoineDeSaintExupéry = Author.createAuthor("1","Antoine","DeSaintExupery",
            "29-06-1900","31-07-1944","France");

    PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1","Gillimard","France",
            "Paris","226000000","Gaston Gallimard","1000");
    Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe",antoineDeSaintExupéry,gillimard,"1","35.5",
            "150","true","1943","yes", Genre.Fantasy,"9837647838");
    @Test
    public void createBookTest() {

        assertNotNull(ilPiccoloPrincipe);
        assertEquals("Il piccolo principe",ilPiccoloPrincipe.getTitle());
    }
    public void createBookExeptionTest() {
        Book ilPiccoloPrincipeRemake = Book.createBook("",antoineDeSaintExupéry,gillimard,
                "1","35.5", "150","true","1943","yes",
                Genre.Fantasy,"9837647838");
    }
}
