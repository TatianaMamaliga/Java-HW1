package session13.challenge13.libraryManagementSystem;

import java.time.LocalDate;

public class InventoryItem {
    private Book book;
    private int inventoryCopies;
    private LocalDate lentDate = LocalDate.now();


    public InventoryItem(Book book, int inventoryCopies) {
        this.book = book;
        this.inventoryCopies = inventoryCopies;
        LocalDate lentDate1 = lentDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public int getInventoryCopies() {
        return inventoryCopies;
    }

    public void setInventoryCopies(int inventoryCopies) {
        this.inventoryCopies = inventoryCopies;
    }

    public LocalDate getLentDate() {
        return lentDate;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "book=" + book +
                ", inventoryCopies=" + inventoryCopies +
                '}';
    }
}
