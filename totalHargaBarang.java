package gabut;

import java.util.Scanner;

public class totalHargaBarang {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan Jumlah barang: ");
        int n = i.nextInt();

        i.nextLine(); //pembersih buffer

        int total = 0;
        int diskon = 0;
        double totalDiskon = 0;
        double bayar = 0;

        for (int b = 1; b <= n; b++) {
            System.out.println("Barang ke-" + b);

            System.out.print("Nama barang: ");
            String namaBarang = i.nextLine();
            System.out.print("Harga barang: ");
            int hargaBarang = i.nextInt();
            System.out.print("Jumlah beli: ");
            int jumlahBarang = i.nextInt();

            i.nextLine(); // pembersih buffer

            double totalHargaBarang = hargaBarang * jumlahBarang;
            total += totalHargaBarang;

            System.out.println(""); //pemberi jarak
        }

        System.out.println("===== HASIL AKHIR =====");
        System.out.println("Total belanja\t: " + total);

        if (total >= 1000000) {
            diskon = 20;
            totalDiskon = total * 0.2;
            bayar += (total - totalDiskon);
        } else if (total >= 500000 && total < 1000000) {
            diskon = 10;
            totalDiskon = total * 0.1;
            bayar += (total - totalDiskon);
        } else if (total >= 250000 && total < 500000) {
            diskon = 5;
            totalDiskon = total * 0.05;
            bayar += (total - totalDiskon);
        } else {
            diskon = 0;
            totalDiskon = 0;
        }

        System.out.println("Diskon (" + diskon + "%)\t: " + totalDiskon);
        System.out.println("Total bayar\t: " + bayar);
    }
}
