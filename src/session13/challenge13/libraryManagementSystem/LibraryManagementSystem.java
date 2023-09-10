package session13.challenge13.libraryManagementSystem;

import java.time.LocalDate;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Author author1 = library.addAuthor("Stephen King", "American", "1947-21-09");
        Author author2 = library.addAuthor("Thomas Hobbes", "British", "1588-05-04");

        Member member = library.addMember("Lucia Franz", "Los Angeles", "random contact info", "64fc821e743bd1.24232651");

        Book book = library.addBook("Institute", author1, "Scribner", "9781529331660", 5000);
        Book book1 = library.addBook("Leviathan", author2, "Leviathan", "9781416573609", 5000);
        library.addBookToInventory(book, 20);
        library.addBookToInventory(book1, 25);
        library.displayAllBooks();


        String resultByTitle = library.searchBookByTitle("institute");
        System.out.println(resultByTitle);
        String resultByAuthor = library.searchBookByAuthor("Stephen King");
        System.out.println(resultByAuthor);
        String resultByIsbn = library.searchBookByIsbn("9781529331660");
        System.out.println(resultByIsbn);

        library.displayAllMembers();

        library.searchMemberByName("lucia franz");

        InventoryItem requestedBook = member.selectedBook(book);
        InventoryItem requestedBook1 = member.selectedBook(book1);

        member.borrowBook(requestedBook, library.lendBooks(requestedBook, "borrow"));
        member.borrowBook(requestedBook1, library.lendBooks(requestedBook1, "borrow"));
        library.displayAllBooks();
        member.displayAllMyBooks();

        member.returnBook(requestedBook, library.lendBooks(requestedBook, "return"));
        member.displayAllMyBooks();
        library.displayAllBooks();

        member.hasOverdueBooks(LocalDate.of(2022, 8, 1));
    }
}
