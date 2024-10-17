// Class Demo untuk menjalankan aplikasi
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Inisialisasi customer dan admin dengan profil
        UserProfile customerProfile = new UserProfile(1, "customerpass", 20, "reyna", "rey@gmail.com");
        UserProfile adminProfile = new UserProfile(2, "adminpass", 30, "admin", "admin@gmail.com");

        Customer customer = new Customer(customerProfile);
        Admin admin = new Admin(adminProfile);

        boolean running = true;

        // Loop utama untuk menjalankan aplikasi
        while (running) {
            System.out.println("\n********* Daftar Menu *********");
            System.out.println("1. Login customer");
            System.out.println("2. Login admin");
            System.out.println("3. Recovery password");
            System.out.println("4. Logout");
            System.out.print("Pilih Menu : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Proses login untuk customer
                    System.out.print("Masukkan ID Customer\t: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Password\t: ");
                    String customerPassword = sc.nextLine();
                    if (customer.logIn(customerId, customerPassword)) {
                        boolean customerMenu = true;
                        while (customerMenu) {
                            System.out.println("\n=========== Pilih Menu Customer ===========");
                            System.out.println("1. Masukkan dokumen");
                            System.out.println("2. Kirim keluhan");
                            System.out.println("3. Tampilkan keluhan");
                            System.out.println("4. Tampilkan profil");
                            System.out.println("5. Edit Profil");
                            System.out.println("6. Logout");
                            System.out.print("Pilih Menu : ");
                            int customerChoice = sc.nextInt();
                            sc.nextLine();

                            switch (customerChoice) {
                                case 1:
                                    // Masukkan dokumen untuk verifikasi
                                    System.out.print("Masukkan dokumen (.jpg, .png, .pdf)\t: ");
                                    String doc = sc.nextLine();
                                    customer.applyVerification(doc);
                                    break;
                                case 2:
                                    // Tambah keluhan
                                    System.out.print("Masukkan keluhan\t: ");
                                    String complaint = sc.nextLine();
                                    customer.addComplaint(complaint);
                                    break;
                                case 3:
                                    // Tampilkan keluhan
                                    customer.showComplaints();
                                    break;
                                case 4:
                                    // Tampilkan profil customer
                                    customer.showProfile();
                                    break;
                                case 5:
                                    // Edit profil customer
                                    System.out.print("Masukkan nama baru\t: ");
                                    String name = sc.nextLine();
                                    System.out.print("Masukkan umur baru\t: ");
                                    int age = sc.nextInt();
                                    sc.nextLine(); // Consume newline
                                    System.out.print("Masukkan email baru\t: ");
                                    String email = sc.nextLine();
                                    customer.editProfile(name, age, email);
                                    break;
                                case 6:
                                    // Logout dari menu customer
                                    customer.logOut();
                                    customerMenu = false;
                                    break;
                            }
                        }
                    }
                    break;

                case 2:
                    // Proses login untuk admin
                    System.out.print("Masukkan ID Admin\t: ");
                    int adminId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Password\t: ");
                    String adminPassword = sc.nextLine();
                    if (admin.logIn(adminId, adminPassword)) {
                        boolean adminMenu = true;
                        while (adminMenu) {
                            System.out.println("\n=========== Pilih Menu Admin ===========");
                            System.out.println("1. Tambahkan Kendaraan");
                            System.out.println("2. Update Detail Kendaraan");
                            System.out.println("3. Verifikasi User");
                            System.out.println("4. Tampilkan Kendaraan");
                            System.out.println("5. Tampilkan Keluhan Customer");
                            System.out.println("6. Logout");
                            System.out.print("Pilih Menu : ");
                            int adminChoice = sc.nextInt();
                            sc.nextLine();

                            switch (adminChoice) {
                                case 1:
                                    // Tambahkan kendaraan
                                    System.out.print("Masukkan nama kendaraan\t: ");
                                    String vehicleName = sc.nextLine();
                                    System.out.print("Masukkan jenis kendaraan\t: ");
                                    String vehicleType = sc.nextLine();
                                    admin.addVehicle(vehicleName, vehicleType);
                                    break;
                                case 2:
                                    // Update detail kendaraan
                                    System.out.print("Masukkan nama kendaraan baru \t: ");
                                    String updatedVehicleName = sc.nextLine();
                                    System.out.print("Masukkan jenis kendaraan baru\t: ");
                                    String updatedVehicleType = sc.nextLine();
                                    admin.updateVehicleDetails(updatedVehicleName, updatedVehicleType);
                                    break;
                                case 3:
                                    // Verifikasi customer
                                    admin.verifyUser(customer);
                                    break;
                                case 4:
                                    // Tampilkan detail kendaraan
                                    admin.showVehicle();
                                    break;
                                case 5:
                                    // Tampilkan keluhan dari customer
                                    admin.retrieveComplaints(customer);
                                    break;
                                case 6:
                                    // Logout dari menu admin
                                    admin.logOut();
                                    adminMenu = false;
                                    break;
                            }
                        }
                    }
                    break;

                    case 3:
                    // Recovery password
                    System.out.print("Masukkan ID pengguna\t: ");
                    int recoveryId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Masukkan email\t: ");
                    String recoveryEmail = sc.nextLine();
                    System.out.print("Masukkan password baru\t: ");
                    String newPassword = sc.nextLine();
                
                    // Cek dan ubah password jika ID dan email valid
                    if ((recoveryId == customer.getUserId() && recoveryEmail.equals(customer.getEmailId())) ||
                        (recoveryId == admin.getUserId() && recoveryEmail.equals(admin.getEmailId()))) {
                        if (recoveryId == customer.getUserId()) {
                            customer.recoverPassword(recoveryEmail, newPassword);
                        } else {
                            admin.recoverPassword(recoveryEmail, newPassword);
                        }
                        System.out.println("Password berhasil diperbarui.");
                    } else {
                        System.out.println("ID atau email tidak valid.");
                    }
                    break;
                

                case 4:
                    // Keluar dari aplikasi
                    System.out.println("Keluar dari sistem.");
                    running = false;
                    break;

                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
                    break;
            }
        }
        sc.close();
    }
}
