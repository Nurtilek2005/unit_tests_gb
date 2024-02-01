package homeworks.fourth.book;

import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    public void testFindBookById() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findById("1")).thenReturn(new Book("1", "MockBook", "MockAuthor"));

        BookService bookService = new BookService(mockRepository);
        Book result = bookService.findBookById("1");

        verify(mockRepository, times(1)).findById("1");
        assertEquals("MockBook", result.getTitle());
        assertEquals("MockAuthor", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findAll()).thenReturn(Arrays.asList(new Book("1", "MockBook1", "MockAuthor1"), new Book("2", "MockBook2", "MockAuthor2")));

        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findAllBooks();

        verify(mockRepository, times(1)).findAll();
        assertEquals(2, result.size());
        assertEquals("MockBook1", result.get(0).getTitle());
        assertEquals("MockAuthor1", result.get(0).getAuthor());
        assertEquals("MockBook2", result.get(1).getTitle());
        assertEquals("MockAuthor2", result.get(1).getAuthor());
    }

    @Test
    public void testFindBooksByTitle() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findBooksByTitle("MockTitle")).thenReturn(Arrays.asList(new Book("1", "MockBook1", "MockAuthor1"), new Book("2", "MockBook2", "MockAuthor2")));

        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findBooksByTitle("MockTitle");

        verify(mockRepository, times(1)).findBooksByTitle("MockTitle");
        assertEquals(2, result.size());
        assertEquals("MockBook1", result.get(0).getTitle());
        assertEquals("MockAuthor1", result.get(0).getAuthor());
        assertEquals("MockBook2", result.get(1).getTitle());
        assertEquals("MockAuthor2", result.get(1).getAuthor());
    }

    @Test
    public void testFindBooksByAuthor() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findBooksByAuthor("MockAuthor")).thenReturn(Arrays.asList(new Book("1", "MockBook1", "MockAuthor"), new Book("2", "MockBook2", "MockAuthor")));

        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findBooksByAuthor("MockAuthor");

        verify(mockRepository, times(1)).findBooksByAuthor("MockAuthor");
        assertEquals(2, result.size());
        assertEquals("MockBook1", result.get(0).getTitle());
        assertEquals("MockAuthor", result.get(0).getAuthor());
        assertEquals("MockBook2", result.get(1).getTitle());
        assertEquals("MockAuthor", result.get(1).getAuthor());
    }
}
