// Class UserProfile untuk menyimpan dan mengelola profil pengguna
class UserProfile {
    private int userId;
    private String password; 
    private String name;
    private int age;
    private String emailId;
    private String document;

    // Constructor untuk inisialisasi profil pengguna
    public UserProfile(int userId, String password, int age, String name, String emailId ) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.document = "";
    }

    // Method untuk autentikasi pengguna
    public boolean logIn(int inputUserId, String inputPassword) {
        if (this.userId == inputUserId && this.password.equals(inputPassword)) {
            System.out.println("Berhasil masuk dengan ID\t: " + inputUserId);
            return true;
        } else {
            System.out.println("ID pengguna atau kata sandi salah.");
            return false;
        }
    }

    // Method untuk mengedit profil pengguna
    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil berhasil diperbarui untuk pengguna ID : " + userId);
    }

    // Method untuk menampilkan profil pengguna
    public void showProfile() {
        System.out.println("Profil Pengguna ID: " + userId);
        System.out.println("Nama\t\t: " + name);
        System.out.println("Umur\t\t: " + age);
        System.out.println("Email\t\t: " + emailId);
        System.out.println("Dokumen\t\t: " + (document.isEmpty() ? "Belum ada dokumen" : document));
    }

    // Method untuk menambahkan dokumen verifikasi
    public void addDocument(String document) {
        this.document = document;
        System.out.println("Dokumen berhasil ditambahkan : " + document);
    }

    public String getEmailId() {
        return emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
       return age;
    }
}
