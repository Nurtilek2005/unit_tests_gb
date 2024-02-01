package seminars.fourth.book;

import me.nurtilek2005.json.Json;
import me.nurtilek2005.json.JsonEncoder;
import me.nurtilek2005.json.JsonDecoder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class JsonBookRepository implements BookRepository {
    private final String filename = "books.json";
    private final Json<Map<String, Object>> books = new Json<>();

    public JsonBookRepository() {
        if (!Files.isRegularFile(Path.of(this.filename))) {
            this.books.fromJsonString("{}");
            Book book1 = new Book("1", "Book1", "Author1");
            Book book2 = new Book("2", "Book2", "Author2");
            Book book3 = new Book("3", "Book3", "Author3");
            this.books.put("1", this.convertBookToJsonMap(book1));
            this.books.put("2", this.convertBookToJsonMap(book2));
            this.books.put("3", this.convertBookToJsonMap(book3));
            this.books.saveToFile(this.filename);
        }
        this.books.loadFromFile(this.filename);
    }

    @Override
    public Book findById(String id) {
        return (Book) this.books.get(id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        for (Object value: this.books.getAll().values()) {
            Map<String, String> bookData = (Map<String, String>) value;
            bookList.add(new Book(bookData.get("id"), bookData.get("title"), bookData.get("author")));
        }
        return bookList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> findBooksByTitle(String title) {
        List<Book> bookList = new ArrayList<>();
        for (Object value: this.books.getAll().values()) {
            Map<String, String> bookData = (Map<String, String>) value;
            if (!bookData.get("title").contains(title)) continue;
            bookList.add(new Book(bookData.get("id"), bookData.get("title"), bookData.get("author")));
        }
        return bookList;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> findBooksByAuthor(String author) {
        List<Book> bookList = new ArrayList<>();
        for (Object value: this.books.getAll().values()) {
            Map<String, String> bookData = (Map<String, String>) value;
            if (!bookData.get("author").contains(author)) continue;
            bookList.add(new Book(bookData.get("id"), bookData.get("title"), bookData.get("author")));
        }
        return bookList;
    }

    private String convertBookToJsonString(Book book) {
        JsonEncoder encoder = new JsonEncoder();
        Map<String, String> bookInfo = new HashMap<>();
        bookInfo.put("id", book.getId());
        bookInfo.put("title", book.getTitle());
        bookInfo.put("author", book.getAuthor());
        return encoder.encode(bookInfo);
    }

    private Object convertBookToJsonMap(Book book) {
        JsonDecoder decoder = new JsonDecoder();
        return decoder.decode(this.convertBookToJsonString(book));
    }
}
