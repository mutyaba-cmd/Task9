// Book.java
public class Book extends GeneralObject {
    private String author;
    private int pages;

    public Book(int id, String name, double basePrice, String author, int pages) {
        super(id, name, basePrice);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Book ===");
        System.out.println("ID: " + id);
        System.out.println("Title: " + name);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Base Price: " + basePrice);
    }
}
