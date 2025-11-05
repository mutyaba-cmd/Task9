// Furniture.java
public class Furniture extends GeneralObject {
    private String material;
    private double weightKg;

    public Furniture(int id, String name, double basePrice, String material, double weightKg) {
        super(id, name, basePrice);
        this.material = material;
        this.weightKg = weightKg;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Furniture ===");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Base Price: " + basePrice);
    }

    // Example: furniture might want an additional helper method (optional)
    public double shippingCost(double ratePerKg) {
        return weightKg * ratePerKg;
    }
}
