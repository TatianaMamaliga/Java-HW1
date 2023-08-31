package session9.practice.BookManagementSystem;

public class BookManagementSystem {

    public static void main(String[] args) {
        Book book1 = new Book("Dune", 150);
        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Animal Farm");
        book2.setPrice(200);
        book2.printBookInfo();

        System.out.println(book2.getTitle());
    }
}
