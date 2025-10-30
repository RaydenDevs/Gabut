package gabut;

import java.util.Random;
import java.util.Scanner;

public class tebakKata {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner i = new Scanner(System.in);

        String[] kata = {"angin", "pohon", "senyum", "tangga", "hujan", "pagi", "gelombang", "bintang", "sunyi", "harapan",
            "warna", "tirai", "tanah", "awan", "pasir", "daun", "senja", "cahaya", "jejak", "langkah",
            "ombak", "tenang", "langit", "bayangan", "melodi", "bayu", "jemari", "bulan", "rumput", "senandung",
            "embun", "kertas", "kisah", "pelangi", "larik", "nada", "sayap", "hutan", "cermin", "lentera",
            "cahaya", "gunung", "lazuardi", "sekilas", "embusan", "serpihan", "suara", "aksara", "dedaunan", "pelukan",
            "mentari", "gerimis", "perjalanan", "hamparan", "embusan", "lirih", "sepi", "purnama", "hembusan", "keheningan",
            "cinta", "semesta", "bisikan", "kenangan", "denting", "puisi", "jiwa", "tarian", "bayangan", "batas",
            "gema", "lukisan", "hembusan", "anggrek", "sayup", "siluet", "gerak", "temaram", "langkah", "irama",
            "teduh", "hembusan", "daunan", "kicau", "riang", "harmoni", "pelabuhan", "arsir", "cakrawala", "senyum",
            "ukiran", "mendung", "sajak", "dedikasi", "perhentian", "rindu", "sapuan", "gaung", "pelukan", "purnama"
        };
        int random = r.nextInt(kata.length);
        int nyawa = 5;
        String word = kata[random];
        char iChar;
        boolean found, tanpaNyawa;

        // System.out.println(word); //Hanya untuk pengecekan (Boleh dihapus)
        System.out.println("Permainan Tebak Kata!");
        System.out.print("Main tanpa nyawa? (true/false): ");
        tanpaNyawa = i.nextBoolean();
        if (tanpaNyawa == false) {
            System.out.println("\nJumlah nyawa\t: " + nyawa);
        }

        // Ubah isi word jadi bintang
        StringBuilder tebakan = new StringBuilder();
        for (int p = 0; p < word.length(); p++) {
            tebakan.append("*");
        }

        while (nyawa > 0 || tanpaNyawa == true) {
            System.out.print("\nTebak Kata\t: ");
            System.out.println(tebakan);
            System.out.print("Tebakan Huruf\t: ");
            iChar = i.next().charAt(0);
            found = false;
            for (int j = 0; j < tebakan.length(); j++) {
                if (word.charAt(j) == iChar) {
                    tebakan.setCharAt(j, iChar);
                    found = true;
                }
            }
            if (found == false && tanpaNyawa == false) {
                nyawa--;
                System.out.println("Sisa nyawa: " + nyawa);
            }
            if (nyawa == 0) {
                System.out.println("\nAnda Kalah.. jawaban yang benar adalah: " + word);
                break;
            } else if (word.equals(tebakan.toString())) {
                System.out.println("\nSelamat! Jawaban anda benar! (" + word + ")");
                break;
            } else {
                System.out.println(">> Tebak Lagi!");
            }
        }
    }
}
