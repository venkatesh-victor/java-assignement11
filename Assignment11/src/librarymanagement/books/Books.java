package librarymanagement.books;

public class Books {

    int bookId;
    String name;
    String Author;
    String Publisher;

    public Books() { super(); }

    public Books(int bookId, String bookName, String author, String publisher) {
        this.bookId = bookId;
        this.name = bookName;
        Author = author;
        Publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return name;
    }

    public void setName(String bookName) {
        this.name = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
