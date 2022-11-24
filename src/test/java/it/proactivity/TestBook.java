package it.proactivity;

import it.proactivity.model.Author;
import it.proactivity.model.Book;
import it.proactivity.model.Genre;
import it.proactivity.model.PublishingHouse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.*;

public class TestBook {
    @Test
    public void createBookEqualsTest() {
        Author marcelProust = Author.createAuthor("1","Marcel","Proust","12-09-1957",
                "23-12-1990","Germany");

        PublishingHouse rscMediaGroup = new PublishingHouse(001l,"RSC MediaGroup","Italy",
                "Milan",846000000f,"Angelo Rizzoli",4000);

        Book book = Book.createBook("Alla ricerca del tempo perduto",marcelProust,rscMediaGroup,"1",
                "50","200","false","1970","yes", Genre.Thriller,"?????");

        assertNotNull(book);

        assertEquals(book,Book.createBook("Alla ricerca del tempo perduto",marcelProust,rscMediaGroup,"1",
                "50","200","false","1970","yes", Genre.Thriller,"?????"));


    }
    @Test
    public void createBookNotEqualsTest() {
        Author marcelProust = Author.createAuthor("1","Marcel","Proust","12-09-1957",
                "23-12-1990","Germany");

        PublishingHouse rscMediaGroup = new PublishingHouse(001l,"RSC MediaGroup","Italy",
                "Milan",846000000f,"Angelo Rizzoli",4000);

        Book book = Book.createBook("Alla ricerca del tempo perduto",marcelProust,rscMediaGroup,"1",
                "50","200","false","1970","yes", Genre.Thriller,"?????");

        assertNotEquals(book,Book.createBook("Alla ricerca di nemo",marcelProust,rscMediaGroup,"1",
                "50","200","false","1970","yes", Genre.Thriller,"?????"));

    }
    @Test
    public void createBookIllegalArgumentExceptionTest() {
        Author marcelProust = Author.createAuthor("1","Marcel","Proust","12-09-1957",
                "23-12-1990","Germany");

        PublishingHouse rscMediaGroup = new PublishingHouse(001l,"RSC MediaGroup","Italy",
                "Milan",846000000f,"Angelo Rizzoli",4000);


        Exception illegalArgumentException = assertThrows(IllegalArgumentException.class,()->Book.createBook(
                "Alla ricerca del tempo perduto",marcelProust,rscMediaGroup,"1",
                "50","200","false","1970","yes", Genre.Thriller,""));

        assertEquals("Una o più stringhe inserite sono vuote",illegalArgumentException.getMessage());


    }
    @Test
    public void createBookNullPointerExceptionTest() {
        Exception nullPointerException = assertThrows(NullPointerException.class,()->Book.createBook(
                "Alla ricerca del tempo perduto",null,null,"1",
                "50","200","false","1970","yes", Genre.Thriller,null));
        assertEquals("Attenzione, hai inserito uno o più parametri come null",nullPointerException.getMessage());
    }
}
