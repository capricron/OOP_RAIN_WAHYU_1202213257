package Modul1_WAHYU;

import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Database db = new Database();
        User user = new User();

        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==================================");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan Nama Anda : ");
            String name = sc.nextLine();
            System.out.print("Masukkan No. Telepon Anda : ");
            int phone = sc.nextInt();
            user.setName(name);
            user.setPhone(phone);

            System.out.println("Register Success");
            System.out.println("Name: " + user.name);
            System.out.println("Phone: " + user.phone);
            System.out.println("");
            while (true) {
                System.out.println("==================================");

                System.out.println("1. Menu");
                System.out.println("2. Pilih Menu");
                System.out.println("3. Keluar");
                System.out.println("==================================");
                System.out.print("Masukan Pilihan :");
                int pilihan = sc.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Menu");
                        System.out.println("==================================");
                        db.showMenu();
                        break;

                    case 2:
                        System.out.println("Masukan Nama Menu: ");
                        String pilihanMenu = sc.next();
                        db.searchMenu(pilihanMenu);
                        break;

                    case 3:
                        System.out.println("Terima Kasih");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Pilihan Tidak Tersedia");
                        break;
                }
            }
        }
    }
}
