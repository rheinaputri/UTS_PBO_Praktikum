class SandalHeels extends Sandal {
    public int heightHeels;

    // Constructor
    public SandalHeels(int size, String color, String brand, int heightHeels) {
        super(size, color, brand); // Call the superclass constructor
        this.heightHeels = heightHeels;
    }

    // method get heels
    public int getHeightHeels() {
        return heightHeels;
    }
}



// public class Heels extends Sandal {
//     int heightHeels;

//     Heels(int size, String color, String brand, int heightHeels){
//         super(size, color, brand);
//         this.heightHeels= heightHeels;
//     }

//     void heightHeels() {
//         System.out.println("Tinggi hak\t\t: " + heightHeels + " cm");
//     }


// }