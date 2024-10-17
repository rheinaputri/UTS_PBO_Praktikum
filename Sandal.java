
class Sandal extends AlasKaki {
    public String brand;

    // Constructor
    public Sandal(int size, String color, String brand) {
        super(size, color); // Call the superclass constructor
        this.brand = brand;
    }

    // Method get brand
    public String getBrand() {
        return brand;
    }
}