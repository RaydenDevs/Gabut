package OneHundredDaysOfCoding;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int saldo = 1000000;
        System.out.println("==== MENU ATM ====");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int p = i.nextInt();
        
        if (p == 1) {
            System.out.println("Saldo anda saat ini: "+saldo);
        } else if (p == 2) {
            System.out.print("Masukkan nominal tarik: ");
            int tarik = i.nextInt();
            if (tarik<saldo) {
                saldo -= tarik;
                System.out.println("Transaksi berhasil!");
                System.out.println("Saldo anda sekarang: "+saldo);
            } else {
                System.out.println("Saldo tidak cukup!");
            }
        } else if (p == 3) {
            System.out.println("Jumlah yang ingin disetor: ");
            int setor = i.nextInt();
            saldo += setor;
            System.out.println("Saldo saat ini: "+saldo);
        } else {
            System.out.println("Terima kasih telah menggunakan ATM kami.");
        }
    }
}
