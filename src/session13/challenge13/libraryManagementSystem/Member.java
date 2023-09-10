package session13.challenge13.libraryManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private List<InventoryItem> memberBooks = new ArrayList<>();
    private String name;
    private String address;
    private String contactInformation;
    private String id;

    public Member(String name, String address, String contactInformation, String id) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public InventoryItem selectedBook(Book book) {
        InventoryItem inventoryItem = new InventoryItem(book, 1);
        return inventoryItem;
    }

    public void borrowBook(InventoryItem inventoryItem, boolean isLendingBook) {
        if (isLendingBook) {
            memberBooks.add(inventoryItem);
            System.out.println("Book is added to your list.");
        }
    }

    public void returnBook(InventoryItem inventoryItem, boolean isReturningBook) {
        if (isReturningBook) {
            memberBooks.remove(inventoryItem);
            System.out.println("Book is removed from your list.");
        }
    }

    public boolean hasOverdueBooks(LocalDate dueDate) {
        for (InventoryItem book : memberBooks) {
            if (book.getLentDate().isAfter(dueDate)) {
                System.out.println(book.getBook().getTitle() + " is overdue.");
                return true;
            }
        }
        return false;
    }

    public void displayAllMyBooks() {
        System.out.println("Books in my collection: ");
        for (InventoryItem book : memberBooks) {
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
