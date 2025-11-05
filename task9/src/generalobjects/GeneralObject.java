// GeneralObject.java
public abstract class GeneralObject {
    protected int id;
    protected String name;
    protected double basePrice;

    // Constructor initializing common attributes
    public GeneralObject(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Abstract method to display details specific to each subclass
    public abstract void displayDetails();

    // Concrete method: compute a value (e.g., cost/score) based on a multiplier
    public double computeValue(double multiplier) {
        return basePrice * multiplier;
    }
}
