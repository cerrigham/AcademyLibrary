import it.proactivity.model.*;
import it.proactivity.utility.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookListTest {

    private List<Book> createBookList() {

        List<Book> bookList = new ArrayList<>();

        Author giorgioFalletti = AuthorUtility.createAuthor("1", "Giorgio", "Falletti",
                "25-11-1950", "04-07-2014", "Italy");

        Author orianaFallaci = AuthorUtility.createAuthor("2", "Oriana", "Fallaci", "29-06-1929",
                "15-10-2006", "Italy");

        Author charlesDickens = AuthorUtility.createAuthor("3", "Charles", "Dickens",
                "07-02-1812", "09-06-1870", "England");

        PublishingHouse baldiniECastoldi = PublishingHouseUtility.createPublishingHouse("1",
                "Baldini e Castoldi", "Italy", "Milan", "5000000", "Ettore baldini",
                "19");

        PublishingHouse rizzoli = PublishingHouseUtility.createPublishingHouse("2", "Rizzoli", "Italy",
                "Milan", "80000000", "Angelo Rizzoli", "89");

        PublishingHouse allTheYearAround = PublishingHouseUtility.createPublishingHouse("3", "all the year around",
                "England", "London", "20000000", "Charles Dickens", "1000");

        Book ioUccido = BookUtility.createBook("Io uccido", giorgioFalletti, baldiniECastoldi, "1", "50",
                "147", "2002", "first", Genre.Romance, "88-8490-223-1");

        Book nienteDiVeroTranneGliOcchi = BookUtility.createBook("Niente di vero tranne gli occhi", giorgioFalletti,
                baldiniECastoldi, "2", "45", "200", "2004", "first", Genre.Romance,
                "978-88-8490-637-3");

        Book fuoriDaUnEvidenteDestino = BookUtility.createBook("Fuori da un evidente destino", giorgioFalletti,
                baldiniECastoldi, "3", "90", "200", "2006", "first", Genre.Romance,
                "978-88-8490-985-5");

        Book penelopeAllaGuerra = BookUtility.createBook("Penelope alla guerra", orianaFallaci, rizzoli, "4",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4");

        Book intervistaConLaStoria = BookUtility.createBook("Intervista con la storia", orianaFallaci, rizzoli,
                "5", "20", "90", "1974", "first", Genre.Historical, "978-88-17-86590-6");

        Book unUomo = BookUtility.createBook("Un uomo", orianaFallaci, rizzoli, "6", "70", "260",
                "1979", "first", Genre.Romance, "978-88-17-15377-5");

        Book insciallah = BookUtility.createBook("Insciallah", orianaFallaci, rizzoli, "7", "120",
                "123", "1990", "first", Genre.Romance, "88-17-85374-7");

        Book laCasaDeiFantasmi = BookUtility.createBook("La casa dei fantasmi", charlesDickens, allTheYearAround, "8",
                "30", "100", "1859", "first", Genre.Horror, "9773839");

        Book lePrescrizioniDelDottorMarigold = BookUtility.createBook("Le prescrizioni del dottor Marigold",
                charlesDickens, allTheYearAround, "9", "78", "168", "1865", "first",
                Genre.Historical, "0839838383");

        Book leAvventureDiOliverTwist = BookUtility.createBook("Le avventure di Oliver Twist", charlesDickens,
                allTheYearAround, "10", "125", "200", "1838", "first", Genre.Romance,
                "9887383");

        bookList.add(ioUccido);
        bookList.add(nienteDiVeroTranneGliOcchi);
        bookList.add(fuoriDaUnEvidenteDestino);
        bookList.add(penelopeAllaGuerra);
        bookList.add(intervistaConLaStoria);
        bookList.add(unUomo);
        bookList.add(insciallah);
        bookList.add(laCasaDeiFantasmi);
        bookList.add(lePrescrizioniDelDottorMarigold);
        bookList.add(leAvventureDiOliverTwist);

        return bookList;
    }

    private List<LibraryItem> createBookAndEbookList() {
        List<LibraryItem> bookList = new ArrayList<>();

        Author giorgioFalletti = AuthorUtility.createAuthor("1", "Giorgio", "Falletti",
                "25-11-1950", "04-07-2014", "Italy");

        Author orianaFallaci = AuthorUtility.createAuthor("2", "Oriana", "Fallaci", "29-06-1929",
                "15-10-2006", "Italy");

        PublishingHouse baldiniECastoldi = PublishingHouseUtility.createPublishingHouse("1",
                "Baldini e Castoldi", "Italy", "Milan", "5000000", "Ettore baldini",
                "19");

        PublishingHouse rizzoli = PublishingHouseUtility.createPublishingHouse("2", "Rizzoli", "Italy",
                "Milan", "80000000", "Angelo Rizzoli", "89");

        Book ioUccido = BookUtility.createBook("Io uccido", giorgioFalletti, baldiniECastoldi, "1", "50",
                "147", "2002", "first", Genre.Romance, "88-8490-223-1");

        Book nienteDiVeroTranneGliOcchi = BookUtility.createBook("Niente di vero tranne gli occhi", giorgioFalletti,
                baldiniECastoldi, "2", "45", "200", "2004", "first", Genre.Romance,
                "978-88-8490-637-3");

        Book penelopeAllaGuerra = BookUtility.createBook("Penelope alla guerra", orianaFallaci, rizzoli, "3",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4");

        Book intervistaConLaStoria = BookUtility.createBook("Intervista con la storia", orianaFallaci, rizzoli,
                "4", "20", "90", "1974", "first", Genre.Historical, "978-88-17-86590-6");

        Book unUomo = BookUtility.createBook("Un uomo", orianaFallaci, rizzoli, "5", "70", "260",
                "1979", "first", Genre.Romance, "978-88-17-15377-5");

        Ebook ioUccidoEbook = EbookUtility.createEbook("Io uccido", giorgioFalletti, baldiniECastoldi, "1", "50",
                "147", "2002", "first", Genre.Romance, "88-8490-223-1", Format.KINDLE,
                "5000", "20-09-2023 13:00");

        Ebook nienteDiVeroTranneGliOcchiEbook = EbookUtility.createEbook("Niente di vero tranne gli occhi", giorgioFalletti,
                baldiniECastoldi, "2", "45", "200", "2004", "first", Genre.Romance,
                "978-88-8490-637-3", Format.HTML, "230000", "15-01-2023 12:00");

        Ebook penelopeAllaGuerraEbook = EbookUtility.createEbook("Penelope alla guerra", orianaFallaci, rizzoli, "3",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4",
                Format.EPUB, "1600000", "12-12-2023 15:30");

        Ebook intervistaConLaStoriaebook = EbookUtility.createEbook("Intervista con la storia", orianaFallaci, rizzoli,
                "4", "20", "90", "1974", "first", Genre.Historical, "978-88-17-86590-6",
                Format.KINDLE, "3000000", "03-06-2023 14:25");

        Ebook unUomoEbook = EbookUtility.createEbook("Un uomo", orianaFallaci, rizzoli, "5", "70", "260",
                "1979", "first", Genre.Romance, "978-88-17-15377-5", Format.KINDLE, "1250009",
                "05-07-2024 20:00");

        bookList.add(ioUccido);
        bookList.add(nienteDiVeroTranneGliOcchi);
        bookList.add(penelopeAllaGuerra);
        bookList.add(intervistaConLaStoria);
        bookList.add(unUomo);
        bookList.add(ioUccidoEbook);
        bookList.add(nienteDiVeroTranneGliOcchiEbook);
        bookList.add(penelopeAllaGuerraEbook);
        bookList.add(intervistaConLaStoriaebook);
        bookList.add(unUomoEbook);

        return bookList;
    }

    private List<LibraryItem> createLibraryItemList() {
        List<LibraryItem> bookList = new ArrayList<>();

        Author giorgioFalletti = AuthorUtility.createAuthor("1", "Giorgio", "Falletti",
                "25-11-1950", "04-07-2014", "Italy");

        Author orianaFallaci = AuthorUtility.createAuthor("2", "Oriana", "Fallaci", "29-06-1929",
                "15-10-2006", "Italy");

        Musician freddyMercury = new Musician(1l, "Freddy", "English", "45");

        Musician matthewBellamy = new Musician(2l, "Matthew Bellamy", "English", "44");

        Musician sia = new Musician(3l, "Sia", "Australia", "45");

        Musician celentano = new Musician(4l, "Adriano Celentano", "Italy", "84");

        Musician brianJohnson = new Musician(5l, "Brian Johnson", "England", "75");

        Cd bohemianRhapsody = CdUtility.createCd("1", MusicGenre.ROCK, freddyMercury, "bohemian rhapsody",
                "31-10-1975");

        Cd psycho = CdUtility.createCd("2", MusicGenre.ROCK, matthewBellamy, "psycho", "12-03-2015");

        Cd unstoppable = CdUtility.createCd("3", MusicGenre.POP, sia, "unstoppable", "29-01-2016");

        Cd emozioneNonHaVoce = CdUtility.createCd("4", MusicGenre.LOVE, celentano, "L'emozione non ha voce",
                "12-05-1999");

        Cd thunderstruck = CdUtility.createCd("5", MusicGenre.ROCK, brianJohnson, "Thunderstruck",
                "10-10-1990");

        bookList.add(bohemianRhapsody);
        bookList.add(psycho);
        bookList.add(unstoppable);
        bookList.add(emozioneNonHaVoce);
        bookList.add(thunderstruck);


        PublishingHouse baldiniECastoldi = PublishingHouseUtility.createPublishingHouse("1",
                "Baldini e Castoldi", "Italy", "Milan", "5000000", "Ettore baldini",
                "19");

        PublishingHouse rizzoli = PublishingHouseUtility.createPublishingHouse("2", "Rizzoli", "Italy",
                "Milan", "80000000", "Angelo Rizzoli", "89");

        Book ioUccido = BookUtility.createBook("Io uccido", giorgioFalletti, baldiniECastoldi, "1", "50",
                "147", "2002", "first", Genre.Romance, "88-8490-223-1");

        Book nienteDiVeroTranneGliOcchi = BookUtility.createBook("Niente di vero tranne gli occhi", giorgioFalletti,
                baldiniECastoldi, "2", "45", "200", "2004", "first", Genre.Romance,
                "978-88-8490-637-3");

        Book penelopeAllaGuerra = BookUtility.createBook("Penelope alla guerra", orianaFallaci, rizzoli, "3",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4");

        Book intervistaConLaStoria = BookUtility.createBook("Intervista con la storia", orianaFallaci, rizzoli,
                "4", "20", "90", "1974", "first", Genre.Historical, "978-88-17-86590-6");

        Book unUomo = BookUtility.createBook("Un uomo", orianaFallaci, rizzoli, "5", "70", "260",
                "1979", "first", Genre.Romance, "978-88-17-15377-5");

        bookList.add(ioUccido);
        bookList.add(nienteDiVeroTranneGliOcchi);
        bookList.add(penelopeAllaGuerra);
        bookList.add(intervistaConLaStoria);
        bookList.add(unUomo);


        Ebook ioUccidoEbook = EbookUtility.createEbook("Io uccido", giorgioFalletti, baldiniECastoldi, "1", "50",
                "147", "2002", "first", Genre.Romance, "88-8490-223-1", Format.KINDLE,
                "5000", "20-09-2023 13:00");

        Ebook nienteDiVeroTranneGliOcchiEbook = EbookUtility.createEbook("Niente di vero tranne gli occhi", giorgioFalletti,
                baldiniECastoldi, "2", "45", "200", "2004", "first", Genre.Romance,
                "978-88-8490-637-3", Format.HTML, "230000", "15-01-2023 12:00");

        Ebook penelopeAllaGuerraEbook = EbookUtility.createEbook("Penelope alla guerra", orianaFallaci, rizzoli, "3",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4",
                Format.EPUB, "1600000", "12-12-2023 15:30");

        Ebook intervistaConLaStoriaebook = EbookUtility.createEbook("Intervista con la storia", orianaFallaci, rizzoli,
                "4", "20", "90", "1974", "first", Genre.Historical, "978-88-17-86590-6",
                Format.KINDLE, "3000000", "03-06-2023 14:25");

        Ebook unUomoEbook = EbookUtility.createEbook("Un uomo", orianaFallaci, rizzoli, "5", "70", "260",
                "1979", "first", Genre.Romance, "978-88-17-15377-5", Format.KINDLE, "1250009",
                "05-07-2024 20:00");

        bookList.add(ioUccidoEbook);
        bookList.add(nienteDiVeroTranneGliOcchiEbook);
        bookList.add(penelopeAllaGuerraEbook);
        bookList.add(intervistaConLaStoriaebook);
        bookList.add(unUomoEbook);


        FilmDirector federicoFellini = new FilmDirector("Federico", "Fellini", LocalDate.of(1920, 01, 20),
                LocalDate.of(1993, 10, 31), "Italy", 1l, 40f, 100);

        FilmDirector stevenSpielberg = new FilmDirector("Steven", "Spielberg", LocalDate.of(1946, 12, 18),
                null, "Usa", 2l, 30f, 70);

        FilmDirector martinScorsese = new FilmDirector("Martin", "Scorsese", LocalDate.of(1942, 11, 17),
                null, "Usa", 3l, 50f, 100);

        FilmDirector quentinTarantino = new FilmDirector("Quentin", "Tarantino", LocalDate.of(1963, 03, 27),
                null, "Usa", 4l, 30f, 100);

        FilmDirector timBurton = new FilmDirector("Tim", "Burton", LocalDate.of(1958, 8, 25), null,
                "Usa", 5l, 25f, 40);

        FilmStudio warnerBrothers = new FilmStudio("warner brothers", null, 1l, 500000000f,
                2000, false, "California");

        FilmStudio paramountGlobal = new FilmStudio("Paramount Global", null, 2l, 4800000f, 1500, true,
                "New York");

        Dvd loSceiccoBianco = DvdUtility.createDvd("1", "Lo sceicco bianco", "2.00", federicoFellini,
                DvdGenre.Romance, warnerBrothers, "true");

        Dvd loSqualo = DvdUtility.createDvd("2", "Lo squalo", "2.00", stevenSpielberg, DvdGenre.Thriller,
                warnerBrothers, "false");

        Dvd queiBraviRagazzi = DvdUtility.createDvd("3", "Quei bravi ragazzi", "3.00", martinScorsese,
                DvdGenre.Crime, paramountGlobal, "false");

        Dvd pulpFiction = DvdUtility.createDvd("4", "Pulp fiction", "2.3", quentinTarantino, DvdGenre.Crime,
                warnerBrothers, "false");

        Dvd ilPianetaDelleScimmie = DvdUtility.createDvd("5", "Il pianeta delle scimmie", "2.5", timBurton,
                DvdGenre.Fantasy, warnerBrothers, "true");

        bookList.add(loSceiccoBianco);
        bookList.add(loSqualo);
        bookList.add(queiBraviRagazzi);
        bookList.add(pulpFiction);
        bookList.add(ilPianetaDelleScimmie);

        return bookList;

    }

    private List<Loan> createLoanList() {

        List<Loan> loanList = new ArrayList<>();

        Address alessioAddress = AddressUtility.createAddress("2","central","gela",
                "cl","Italy");
        Address giacomoAddress = AddressUtility.createAddress("28","marzo","palermo",
                "pl","Italy");

        Address antonioAddress = AddressUtility.createAddress("22","recanati","messina",
                "ms","Italy");

        Client alessio = ClientUtility.clientInformation("1","Alessio","Cassarino",
                "16-11-1995",alessioAddress,"false","true","alessio@alessio.it",
                "3764838839");

        Client giacomo = ClientUtility.clientInformation("2","Giacomo","Balducci",
                "06-01-1985",giacomoAddress,"true","false","balducci@balducci.it",
                "87637829292");

        Client antonio = ClientUtility.clientInformation("3","Antonio","Molinari",
                "22-07-2000",antonioAddress,"false","true","antonio@antonio.it",
                "328384838839");

        Musician matthewBellamy = new Musician(2l, "Matthew Bellamy", "English", "44");
        Cd psycho = CdUtility.createCd("1", MusicGenre.ROCK, matthewBellamy, "psycho", "12-03-2015");

        Musician brianJohnson = new Musician(5l, "Brian Johnson", "England", "75");
        Cd thunderstruck = CdUtility.createCd("2", MusicGenre.ROCK, brianJohnson, "Thunderstruck",
                "10-10-1990");


        Author orianaFallaci = AuthorUtility.createAuthor("1", "Oriana", "Fallaci", "29-06-1929",
                "15-10-2006", "Italy");


        PublishingHouse rizzoli = PublishingHouseUtility.createPublishingHouse("1", "Rizzoli", "Italy",
                "Milan", "80000000", "Angelo Rizzoli", "89");

        Book penelopeAllaGuerra = BookUtility.createBook("Penelope alla guerra", orianaFallaci, rizzoli, "1",
                "60", "145", "1962", "first", Genre.Romance, "88-17-15013-4");

        Loan first = new Loan(1l,thunderstruck,giacomo,LocalDate.of(2023,1,1),
                LocalDate.of(2023,7,20),true,"successful");


        Loan second = new Loan(2l,psycho,alessio,LocalDate.of(2022,12,13),
                LocalDate.of(2023,12,14),true,"successful");


        Loan third = new Loan(3l,penelopeAllaGuerra,antonio,LocalDate.of(2023,2,22),
                LocalDate.of(2023,4,27),true,"successful");

        loanList.add(first);
        loanList.add(second);
        loanList.add(third);

        return loanList;

    }

    @Test
    public void createIdTitleListItem() {

        List<LibraryItem> libraryItems = createBookAndEbookList();

        List<LibraryItemIdTitle> libraryItemIdTitleList = new ArrayList<>();

        for (LibraryItem item : libraryItems) {
            LibraryItemIdTitle libraryItemIdTitle = new LibraryItemIdTitle(item.getId(), item.getTitle());
            libraryItemIdTitleList.add(libraryItemIdTitle);
        }

        assertNotNull(libraryItemIdTitleList);
        for (LibraryItemIdTitle item : libraryItemIdTitleList) {
            System.out.println(item);
        }
    }

    @Test
    public void createIdTitleAndClassNameList() {
        List<LibraryItem> libraryItemList = createLibraryItemList();

        List<LibraryItemIdTitleClassNameItem> classNameItems = new ArrayList<>();

        for (LibraryItem item : libraryItemList) {

            LibraryItemIdTitleClassNameItem newItem = new LibraryItemIdTitleClassNameItem(item.getId(), item.getTitle(),
                    item.getClass().getSimpleName());

            classNameItems.add(newItem);

        }
        assertNotNull(classNameItems);

        for (LibraryItemIdTitleClassNameItem item : classNameItems) {
            System.out.println(item);
        }

    }

    @Test
    public void createClientItemMap() {
        List<Loan> loanList = createLoanList();

        List<LibraryItem> itemList = new ArrayList<>();
        Map<Client,List<LibraryItem>> clientListMap = new HashMap<>();

        for (Loan loan : loanList) {
            itemList.add(loan.getItem());
            clientListMap.put(loan.getClient(),itemList);
        }

        assertNotNull(clientListMap);

        for (Map.Entry<Client,List<LibraryItem>> entry : clientListMap.entrySet()) {
            System.out.println("Client : "+ entry.getKey().getName() + " " +"List : " + entry.getValue());
        }
    }

    @Test
    public void sortBookList() {
        List<Book> bookList = createBookList();
        Collections.sort(bookList);
        for(int i = 0; i < bookList.size() - 1; i++) {
            assertTrue(bookList.get(i).compareTo(bookList.get(i+1)) < 0);
        }
    }
}
