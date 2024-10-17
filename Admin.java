// Class Admin untuk mengelola fitur admin, extends User
class Admin extends User {
    private String vehicleName = "";
    private String vehicleType = "";

    // Constructor untuk inisialisasi admin
    public Admin(UserProfile profile) {
        super(profile);
    }

    // Method untuk menambahkan kendaraan
    public void addVehicle(String name, String type) {
        this.vehicleName = name;
        this.vehicleType = type;
        System.out.println("Kendaraan berhasil ditambahkan : " + vehicleName + ", Jenis : " + vehicleType);
    }

    // Method untuk memperbarui detail kendaraan
    public void updateVehicleDetails(String name, String type) {
        this.vehicleName = name;
        this.vehicleType = type;
        System.out.println("Detail kendaraan berhasil diperbarui : " + vehicleName + ", Jenis : " + vehicleType);
    }

    // Method untuk mengambil keluhan dari customer
    public void retrieveComplaints(Customer customer) {
        System.out.println("Keluhan untuk pengguna ID\t: " + customer.profile.getUserId() + " :");
        customer.showComplaints();
    }

    // Method untuk memverifikasi customer
    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("Pengguna terverifikasi.");
        } else {
            System.out.println("Pengguna belum terverifikasi.");
        }
    }

    // Method untuk menampilkan informasi kendaraan
    public void showVehicle() {
        System.out.println("Kendaraan : " + (vehicleName.isEmpty() ? "Tidak ada kendaraan" : vehicleName + ", Jenis : " + vehicleType));
    }

    public String getEmailId() {
        return profile.getEmailId();
    }

    public int getUserId() {
        return profile.getUserId();
    }
}
