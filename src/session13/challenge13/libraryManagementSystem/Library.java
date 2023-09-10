package session13.challenge13.libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();
    private List<InventoryItem> inventoryItemList = new ArrayList<>();
    private List<Member> memberList = new ArrayList<>();


    public Book addBook(String name, Author author, String publisher, String ISBN, int copies) {
        Book book = new Book(name, author, publisher, ISBN, copies);
        bookList.add(book);
        return book;
    }

    public InventoryItem addBookToInventory(Book book, int inventoryCopies) {
        InventoryItem inventoryItem = new InventoryItem(book, inventoryCopies);
        inventoryItemList.add(inventoryItem);
        System.out.println("Book is added to inventory.");
        return inventoryItem;
    }

    public boolean lendBooks(InventoryItem inventoryItem, String operation) {
        int newInvCopies = 0;
        for (InventoryItem inventoryItem1 : inventoryItemList) {
            if (inventoryItem1.getBook().getTitle().equalsIgnoreCase(inventoryItem.getBook().getTitle())) {
                if (operation.equalsIgnoreCase("borrow")) {
                    newInvCopies = inventoryItem1.getInventoryCopies() - inventoryItem.getInventoryCopies();
                    inventoryItem1.setInventoryCopies(newInvCopies);
                    return true;
                } else if (operation.equalsIgnoreCase("return")) {
                    newInvCopies = inventoryItem1.getInventoryCopies() + inventoryItem.getInventoryCopies();
                    inventoryItem1.setInventoryCopies(newInvCopies);
                    return true;
                }
            }
        }
        return false;
    }


    public Author addAuthor(String name, String nationality, String birthDate) {
        return new Author(name, nationality, birthDate);
    }


    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void displayAllBooks() {
        System.out.println("Books in the library: ");
        for (InventoryItem inventoryItem : inventoryItemList) {
            System.out.println(inventoryItem.toString());
        }
    }

    public String searchBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.toString();
            }
        }
        return "Book is not in the list.";
    }

    public String searchBookByAuthor(String name) {
        for (Book book : bookList) {
            Author author = book.getAuthor();
            if (author.getName().equalsIgnoreCase(name)) {
                return book.toString();
            }
        }
        return "Books by this author weren't found in the list.";
    }

    public String searchBookByIsbn(String isbn) {
        for (Book book : bookList) {
            if (book.getISBN().equals(isbn)) {
                return book.toString();
            }
        }
        return "Book with this ISBN isn't in the list";
    }

    public Member addMember(String name, String address, String contactInformation, String id) {
        Member member = new Member(name, address, contactInformation, id);
        memberList.add(member);
        return member;
    }

    public void removeMember(String name) {
        for (Member member : memberList) {
            if (member.getName().equalsIgnoreCase(name)) {
                memberList.remove(member);
            } else {
                System.out.println("Member is not in the list.");
            }
        }
    }

    public void displayAllMembers() {
        for (Member member : memberList) {
            System.out.println(member.toString());
        }
    }

    public void searchMemberByName(String name) {
        for (Member member : memberList) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.println("Result: " + member.toString());
            } else {
                System.out.println("Name is not in the member list.");
            }
        }
    }

    public void searchMemberById(String id) {
        for (Member member : memberList) {
            if (member.getId().equals(id)) {
                System.out.println("Result: " + member.toString());
            } else {
                System.out.println("ID is not in the member list");
            }
        }
    }
}
