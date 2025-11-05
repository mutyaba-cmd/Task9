// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        // Create instances of subclasses
        Book book = new Book(1, "Java Basics", 30.0, "A. Author", 320);
        Electronic phone = new Electronic(2, "SmartPhone X", 250.0, "BrandZ", 24);
        Furniture chair = new Furniture(3, "Office Chair", 85.0, "Mesh+Steel", 12.5);

        // Display details
        book.displayDetails();
        System.out.println();

        phone.displayDetails();
        System.out.println();

        chair.displayDetails();
        System.out.println();

        // Use computeValue for each object with a given multiplier parameter
        double multiplier = 1.15; // for example: 15% markup
        System.out.println("Computed values with multiplier " + multiplier + ":");
        System.out.printf("Book value: %.2f%n", book.computeValue(multiplier));
        System.out.printf("Electronic value: %.2f%n", phone.computeValue(multiplier));
        System.out.printf("Furniture value: %.2f%n", chair.computeValue(multiplier));

        // Example use of subclass-specific method
        double ratePerKg = 3.5;
        System.out.printf("Furniture shipping cost (rate %.2f per kg): %.2f%n",
                ratePerKg, chair.shippingCost(ratePerKg));
    }
}
