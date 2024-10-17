// class AlasKaki {
//     protected int size;
//     protected String color;

//     // Constructor
//     public AlasKaki(int size, String color) {
//         this.size = size;
//         this.color = color;
//     }
    
//     void size() {
//         System.out.println("Ukuran Alas Kaki\t: " + size);
//     }

//     void color() {
//         System.out.println("Warna Alas Kaki\t\t: " + color);
//     }
// }

class AlasKaki {
    protected int size;
    protected String color;

    // Constructor
    public AlasKaki(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // Method get size
    public int getSize() {
        return size;
    }

    // Method get color
    public String getColor() {
        return color;
    }
}
