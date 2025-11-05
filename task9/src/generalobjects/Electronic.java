// Electronic.java
public class Electronic extends GeneralObject {
    private String brand;
    private int warrantyMonths;

    public Electronic(int id, String name, double basePrice, String brand, int warrantyMonths) {
        super(id, name, basePrice);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Electronic ===");
        System.out.println("ID: " + id);
        System.out.println("Model: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Warranty (months): " + warrantyMonths);
        System.out.println("Base Price: " + basePrice);
    }
}
