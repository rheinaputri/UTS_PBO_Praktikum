// Class User untuk mengelola fitur dasar pengguna
class User {
    protected UserProfile profile;

    // Constructor untuk inisialisasi user
    public User(UserProfile profile) {
        this.profile = profile;
    }

    // Method untuk login
    public boolean logIn(int inputUserId, String inputPassword) {
        return profile.logIn(inputUserId, inputPassword);
    }

    // Method untuk pemulihan kata sandi
    public void recoverPassword(String email, String newPassword) {
        System.out.println("Pemulihan password untuk email : " + email);
        // Mengubah password dalam UserProfile
        profile = new UserProfile(profile.getUserId(), profile.getName(), profile.getAge(), email, newPassword);
        System.out.println("Kata sandi berhasil diperbarui.");
    }

    // Method untuk logout
    public void logOut() {
        System.out.println("Pengguna berhasil keluar.");
    }
}
