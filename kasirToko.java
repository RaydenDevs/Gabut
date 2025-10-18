package OneHundredDaysOfCoding;

import java.util.Scanner;

public class kasirToko {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("==== MENU TOKO SERBA ADA ====");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
        int p = i.nextInt();

        int total, pJumlah, p2, uang, kembalian;

        if (p == 1) {
            System.out.println("--- Menu Makanan ---");
            System.out.println("1. Nasi Goreng\t: Rp15.000");
            System.out.println("2. Mie Ayam\t: Rp12.000");
            System.out.println("3. Sate Ayam\t: Rp18.000");
            System.out.print("Pilih makanan: ");
            p2 = i.nextInt();
            System.out.print("Masukkan Jumlah: ");
            pJumlah = i.nextInt();
            if (p2 == 1) {
                total = 15000 * pJumlah;
            } else if (p2 == 2) {
                total = 12000 * pJumlah;
            } else {
                total = 18000 * pJumlah;
            }
            System.out.println("Total Harga: " + total);
            System.out.print("Masukkan uang anda: ");
            uang = i.nextInt();
            if (uang >= total) {
                kembalian = uang - total;
                System.out.println("Kembalian: " + uang);
                System.out.println("Terima kasih telah berbelanja!");

                System.out.println("\n===== HASIL OUTPUT =====");
                System.out.println("Pilih menu: " + p);
                System.out.println("Pilih makanan" + p2);
                System.out.println("Jumlah: " + pJumlah);
                System.out.println("Total harga: " + total);
                System.out.println("Uang: " + uang);
                System.out.println("Kembalian: " + kembalian);
                System.out.println("Terima kasih telah berbelanja!");
            } else {
                System.out.println("Uang tidak cukup!");
            }
        } else if (p == 2) {
            System.out.println("--- Menu Minuman ---");
            System.out.println("1. Es Teh\t: Rp5.000");
            System.out.println("2. Kopi Susu\t: Rp8.000");
            System.out.println("3. Jus Jeruk\t: Rp10.000");
            System.out.print("Pilih minuman: ");
            p2 = i.nextInt();
            System.out.print("Masukkan Jumlah: ");
            pJumlah = i.nextInt();
            if (p2 == 1) {
                total = 15000 * pJumlah;
            } else if (p2 == 2) {
                total = 12000 * pJumlah;
            } else {
                total = 18000 * pJumlah;
            }
            System.out.println("Total Harga: " + total);
            System.out.print("Masukkan uang anda: ");
            uang = i.nextInt();
            if (uang >= total) {
                kembalian = uang - total;
                System.out.println("Kembalian: " + uang);
                System.out.println("Terima kasih telah berbelanja!");

                System.out.println("\n===== HASIL OUTPUT =====");
                System.out.println("Pilih menu: " + p);
                System.out.println("Pilih makanan" + p2);
                System.out.println("Jumlah: " + pJumlah);
                System.out.println("Total harga: " + total);
                System.out.println("Uang: " + uang);
                System.out.println("Kembalian: " + kembalian);
                System.out.println("Terima kasih telah berbelanja!");
            } else {
                System.out.println("Uang tidak cukup!");
            }
        } else {
            System.out.println("Keluar.");
        }
    }
}
