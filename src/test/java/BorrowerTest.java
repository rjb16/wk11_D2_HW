import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library();
        book1 = new Book("When the lion feeds", "Wilbur Smith", "fiction");
        book2 = new Book("Pyramid", "Johny Smith", "fiction");
        book3 = new Book("Tales of Mars", "James Monks", "non-fiction");
    }
    @Test
    public void countBooks(){
        assertEquals(0, borrower.bookCount());
    }
    @Test
    public void borrowerCanBorrowBookFromLibrary(){
        library.addBook(book1);
        borrower.takeBook(library);
        assertEquals(1, borrower.bookCount());

    }
}