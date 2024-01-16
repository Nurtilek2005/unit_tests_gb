package seminars.fourth.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);

    List<Book> findAll();

    List<Book> findBooksByTitle(String title);

    List<Book> findBooksByAuthor(String author);
}
