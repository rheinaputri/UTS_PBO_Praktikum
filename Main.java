
// Main class for testing
public class Main {
    public static void main(String[] args) {
        SandalHeels sandalHeels1 = new SandalHeels(38, "Red", "Gucci", 10);
    
    System.out.println("Alas Kaki (parent class)");
    System.out.println("Ukuran Alas Kaki: "+ sandalHeels1.getSize());
    System.out.println("Warna\t\t: "+ sandalHeels1.getColor());
    System.out.println();

    System.out.println("Sandal (child class dari AlasKaki)");
    System.out.println("Ukuran Alas Kaki: "+ sandalHeels1.getSize());
    System.out.println("Warna\t\t: "+ sandalHeels1.getColor());
    System.out.println("Merek\t\t: "+sandalHeels1.getBrand());
    System.out.println();

    System.out.println("SandalHeels (child class dari Sandal)");
    System.out.println("Ukuran Alas Kaki: "+ sandalHeels1.getSize());
    System.out.println("Warna\t\t: "+ sandalHeels1.getColor());
    System.out.println("Merek\t\t: "+sandalHeels1.getBrand());
    System.out.println("Tinggi Heels\t: "+sandalHeels1.getHeightHeels() + "cm");
    System.out.println();
 }
}