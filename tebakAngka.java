package gabut;

import java.util.Random;
import java.util.Scanner;

public class tebakAngka {
    public static void main(String[] args) {
        try (Scanner i = new Scanner(System.in)) {
            Random r = new Random();
            
            //Jumlah angka random
            int ab = 25;
            
            //Angka rahasia yang harus ditebak
            int a = r.nextInt(ab) + 1;
            /*
            karena angka dimulai dari 0 (0-24), maka harus ditambah 1 (+1) agar
            angka random bisa sampai ke angka 25 atau sesuai dengan nilai var. ab
            */
            
            //kesempatan menebak
            int c = 5;
            
            System.out.println("Ini adalah permainan tebak angka dari 0 - " + ab);
            System.out.println("Anda memiliki " + c + " kesempatan untuk menebak.");
            
            while (c > 0){
                //Angka yang dimasukkan
                System.out.print("\nMasukkan Tebakanmu: ");
                int b = i.nextInt();
                
                if (b == a){
                    System.out.println("SELAMAT! TEBAKANMU BENAR!!");
                    break;
                    //nilai c akan dikurangi di bawah, tapi program selesai disini
                }else if (b > a){
                    System.out.println("Angka terlalu tinggi!\n");
                }else {
                    System.out.println("Angka terlalu rendah!\n");
                }
                
                c--; //nilai c akan dikurangi 1 setiap tebakan salah
                if (b != a && c > 0){
                    System.out.println("Kesempatanmu sisa: " + c);
                }else {
                    System.out.println("Kesempatanmu habis, angka yang benar adalah: " + a);
                }
            }
        }
    }
    
}
