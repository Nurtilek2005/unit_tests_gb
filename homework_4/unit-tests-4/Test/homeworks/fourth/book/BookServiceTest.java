package homeworks.fourth.book;

import org.junit.jupiter.api.Test;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;
import seminars.fourth.book.InMemoryBookRepository;

public class BookServiceTest {
    BookService bookService;
    BookRepository bookRepository;

    @Test
    public void serviceTest() {
        this.bookRepository = new InMemoryBookRepository();
        this.bookService = new BookService(bookRepository);
    }
}
