import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;
import it.proactivity.utility.AuthorUtility;
import it.proactivity.utility.BookUtility;
import it.proactivity.utility.PublishingHouseUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBook {

    @Test
    public void createBookTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150",  "1943", "yes", Genre.Fantasy, "9837647838");

        assertNotNull(ilPiccoloPrincipe);
        assertEquals("Il piccolo principe", ilPiccoloPrincipe.getTitle());
        assertEquals(1l, ilPiccoloPrincipe.getId());
        assertEquals(35.5f, ilPiccoloPrincipe.getPrice());
        assertEquals(150, ilPiccoloPrincipe.getNumberOfPages());
        assertEquals("1943", ilPiccoloPrincipe.getYearOfPublication());
        assertEquals("yes", ilPiccoloPrincipe.getReprint());
        assertEquals("9837647838", ilPiccoloPrincipe.getIsbn());
    }

    @Test
    public void createBookTestIsbnNull() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150",  "1943", "yes", Genre.Fantasy, null);

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookTestIsbnEmpty() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150",  "1943", "yes", Genre.Fantasy, "");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookIdWrongTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "uno", "35.5",
                "150",  "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookTitleWrongTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook(null, antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150",  "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookPriceWrongTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");
        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "molto", "150", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookNumberOfPageWrongTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");
        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "35.5", "centocinquanta",  "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookYearOfPublicationWrongTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "35.5", "150",  "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookAuthorNullTest() {
        PublishingHouse gillimard = PublishingHouseUtility.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", null, gillimard, "1",
                "35.5", "150", "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookPublishingHouseNullTest() {
        Author antoineDeSaintExupéry = AuthorUtility.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        Book ilPiccoloPrincipe = BookUtility.createBook("Il piccolo principe", antoineDeSaintExupéry, null, "1",
                "35.5", "150",  "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }
}