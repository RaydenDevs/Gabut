import java.util.Scanner;

public class VandingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Produk
        String[] namaProduk = {"Airmineral", "Snack", "Sambusa", "Roti"};
        int[] hargaProduk = {10000, 4000, 2000, 3500};
        int[] stok = {10, 5, 3, 6};

        //Pengecekan panjang array
        if (namaProduk.length > hargaProduk.length || namaProduk.length > stok.length) {
            System.out.println("Array nama produk terlalu banyak");
            sc.close();
            return;
        }
        if (hargaProduk.length > namaProduk.length || hargaProduk.length > stok.length) {
            System.out.println("Array harga produk terlalu banyak");
            sc.close();
            return;
        }
        if (stok.length > hargaProduk.length || stok.length > namaProduk.length) {
            System.out.println("Array stok produk terlalu banyak");
            sc.close();
            return;
        }

        // Simpan Uang dulu (bisa dibilang simpan uang ke dompet dululah :v)
        // Kusimpan di luar loop (do-while supaya tetap tersimpan nilainya/tidak tereset setiap perulangan)
        System.out.print("Masukan Uang Anda: ");
        int uang = sc.nextInt();

        // Loop Mesin
        do {
            // Tampilan menu
            System.out.println("\nVANDING MACHINE");
            for (int i = 0; i < namaProduk.length; i++) {
                // Kurapihkan
                System.out.println((i + 1) + ". " + namaProduk[i]); // Index kutambah 1 supaya lebih manusiawi pilihannya
                System.out.println("   | Harga: Rp" + hargaProduk[i]);
                System.out.println("   | stok: " + stok[i]);
            }
            System.out.println("0. Keluar");

            // Input
            System.out.println("\nUang Anda: " + uang);
            System.out.print("Pilihan\t:  ");
            int pilihan = sc.nextInt() - 1; // Kukurangi 1 biar terbaca sebagai index bukan angka menu

            // Kalau memilih 0
            if (pilihan < 0) {
                System.out.println("Keluar dari program...");
                break; // Menghentikan loop
            } // Kalau pilihannya masuk di dalam menu
            else if (pilihan >= 0 && pilihan < namaProduk.length) {
                // Kalau uangnya cukup dan stok ada
                if (uang >= hargaProduk[pilihan] && stok[pilihan] > 0) {
                    uang -= hargaProduk[pilihan];
                    stok[pilihan]--;
                    System.out.println("Berhasil membeli " + namaProduk[pilihan] + " seharga " + hargaProduk[pilihan]);
                } // Kalau uangnya cukup tapi stok habis
                else if (uang > hargaProduk[pilihan] && stok[pilihan] <= 0) {
                    System.out.println("Produk Habis!");
                } // Kalau uangnya tidak cukup
                else {
                    System.out.println("Uang tidak cukup!");
                }
            } // kalau pilihannya tidak tersedia tapi tidak memilih "keluar"
            else {
                System.out.println("Produk yang dipilih tidak ada atau tidak tersedia!");
            }

            // Antisipasi kalau semua stok sudah habis agar tidak mengulang terus menerus saat produk kosong
            boolean _stop = true;
            for (int j = 0; j < stok.length; j++) {
                if (stok[j] >= 1) {
                    _stop = false;
                    break;
                }
            }
            // Menghentikan mesin
            if (_stop) {
                System.out.println("\nProduk sudah habis!");
                break;
            }
        } while (true);
        sc.close(); // Ini cuman menutup input, menghindari memory leak
    }
}
