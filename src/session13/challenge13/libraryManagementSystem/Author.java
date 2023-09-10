package session13.challenge13.libraryManagementSystem;

import java.util.List;

public class Author {

    private String name;
    private String nationality;
    private String birthDate;

    public Author(String name, String nationality, String birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Book addBook(String title, Author author, String publisher, String isbn, int copies) {
        return new Book(title, author, publisher, isbn, copies);
    }

    public void removeBook(List<Book> bookList, Book book) {
        bookList.remove(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
