import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBook {

    @Test
    public void createBookTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150", "true", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNotNull(ilPiccoloPrincipe);
        assertEquals("Il piccolo principe", ilPiccoloPrincipe.getTitle());
        assertEquals(1l, ilPiccoloPrincipe.getId());
        assertEquals(35.5f, ilPiccoloPrincipe.getPrice());
        assertEquals(150, ilPiccoloPrincipe.getNumberOfPages());
        assertEquals(true, ilPiccoloPrincipe.getVirtual());
        assertEquals("1943", ilPiccoloPrincipe.getYearOfPublication());
        assertEquals("yes", ilPiccoloPrincipe.getReprint());
        assertEquals("9837647838", ilPiccoloPrincipe.getIsbn());
    }

    @Test
    public void createBookTestIsbnNull() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150", "true", "1943", "yes", Genre.Fantasy, null);

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookTestIsbnEmpty() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery", "29-06-1900",
                "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150", "true", "1943", "yes", Genre.Fantasy, "");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookIdWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "uno", "35.5",
                "150", "true", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookTitleWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook(null, antoineDeSaintExupéry, gillimard, "1", "35.5",
                "150", "true", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookPriceWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");
        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "molto", "150", "true", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookNumberOfPageWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");
        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "35.5", "centocinquanta", "true", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookVirtualWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "35.5", "150", "no", "1943", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookYearOfPublicationWrongTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, gillimard, "1",
                "35.5", "150", "true", "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookAuthorNullTest() {
        PublishingHouse gillimard = PublishingHouse.createPublishingHouse("1", "Gillimard", "France",
                "Paris", "226000000", "Gaston Gallimard", "1000");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", null, gillimard, "1",
                "35.5", "150", "true", "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }

    @Test
    public void createBookPublishingHouseNullTest() {
        Author antoineDeSaintExupéry = Author.createAuthor("1", "Antoine", "DeSaintExupery",
                "29-06-1900", "31-07-1944", "France");

        Book ilPiccoloPrincipe = Book.createBook("Il piccolo principe", antoineDeSaintExupéry, null, "1",
                "35.5", "150", "true", "", "yes", Genre.Fantasy, "9837647838");

        assertNull(ilPiccoloPrincipe);
    }
}