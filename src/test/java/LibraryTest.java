import org.junit.Before;

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


  }

