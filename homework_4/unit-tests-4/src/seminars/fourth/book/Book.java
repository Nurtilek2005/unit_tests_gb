package seminars.fourth.book;

public class Book {
    private String id;
    private String title;
    private String author;

    public Book(String id) {
        this.id = id;
    }

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        StringBuilder bookInfo = new StringBuilder();
        bookInfo.append(String.format("ID: %s, ", this.id));
        bookInfo.append(String.format("Title: %s, ", this.title));
        bookInfo.append(String.format("Author: %s", this.author));
        return bookInfo.toString();
    }
}
