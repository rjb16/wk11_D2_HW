import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

      Library library;
      Book book1;
      Book book2;
      Book book3;

      @Before
      public void setUp() {
          library = new Library();
          book1 = new Book("When the lion feeds", "Wilbur Smith", "fiction");
          book2 = new Book("Pyramid", "Johny Smith", "fiction");
          book3 = new Book("Tales of Mars", "James Monks", "non-fiction");

      }
      @Test

      public void countBooks(){
          assertEquals(0, library.bookCount());
      }

      @Test
      public void addBookToStock(){
          library.addBook(book1);
          assertEquals(1, library.bookCount());
      }

      @Test
    public void checkBookCapacityAndAddIfPossible(){
          library.addBook(book1);
          library.addBook(book2);
          library.addBook(book3);
          assertEquals(2, library.bookCount());

      }

}




