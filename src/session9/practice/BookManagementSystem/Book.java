package session9.practice.BookManagementSystem;

import java.time.LocalDate;
import java.util.List;

public class Book {

    private String title;
    private float price;
/*
    private List<Author> authors;
    private String genre;
    private int numberPages;
    private int stock;
    private float discount;
    private LocalDate publishDate;
    private String ISBN;
    private String publishingHouse;
*/

    public Book(String title, float price){
        this.title = title;
        this.price = price;
    }

    public Book(){
    }

    void printBookInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Book price: " + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
