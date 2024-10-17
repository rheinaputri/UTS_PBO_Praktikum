// Class Customer untuk mengelola fitur customer, extends User
class Customer extends User {
    private boolean verificationStatus = false;
    private String complaint = "";

    // Constructor untuk inisialisasi customer dengan profil
    public Customer(UserProfile profile) {
        super(profile);
    }

    // Method untuk mendapatkan status verifikasi
    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    // Method untuk menerapkan verifikasi dengan dokumen
    public void applyVerification(String doc) {
        if (doc.endsWith(".jpg") || doc.endsWith(".png") || doc.endsWith(".pdf")) {
            verificationStatus = true;
            profile.addDocument(doc);
            System.out.println("Verifikasi berhasil dengan dokumen\t: " + doc);
        } else {
            System.out.println("Format dokumen tidak valid. Hanya menerima .jpg, .png, atau .pdf");
        }
    }

    // Method untuk menambah keluhan
    public void addComplaint(String complaint) {
        this.complaint = complaint;
        System.out.println("Keluhan berhasil ditambahkan\t: " + complaint);
    }

    // Method untuk menampilkan keluhan
    public void showComplaints() {
        System.out.println("Keluhan\t: " + (complaint.isEmpty() ? "Tidak ada keluhan" : complaint));
    }

    // Method untuk mengedit profil customer
    public void editProfile(String name, int age, String emailId) {
        profile.editProfile(name, age, emailId);
    }

    // Method untuk menampilkan profil customer
    public void showProfile() {
        profile.showProfile();
    }

    public String getEmailId() {
        return profile.getEmailId();
    }

    public int getUserId() {
        return profile.getUserId();
    }

}
