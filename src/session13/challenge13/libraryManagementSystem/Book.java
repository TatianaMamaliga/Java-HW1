package session13.challenge13.libraryManagementSystem;

import java.util.List;

public class Book {

    private final String title;
    private Author author;
    private final String publisher;
    private final String ISBN;
    private int copies;

    public Book(String title, Author author, String publisher, String ISBN, int copies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.copies = copies;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isBookAvailable(List<Book> bookList, Book book) {
        for (Book book1 : bookList) {
            if (book1.getTitle().equalsIgnoreCase(book.getTitle())) {
                System.out.println("Book is available.");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.toString() +
                ", publisher='" + publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", copies=" + copies +
                '}';
    }
}
