package OneHundredDaysOfCoding;

import java.util.Scanner;

public class catRumah {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
         System.out.print("Nama Proyek: ");
         String nama = i.nextLine();
         System.out.print("Panjang tembok (meter): ");
         double p = i.nextDouble();
         System.out.print("Lebar tembok (meter): ");
         double l = i.nextDouble();
         System.out.print("Harga cat per liter: ");
         double harga = i.nextDouble();
         
         double luas = p*l;
         double cat = luas/12;
         double total = cat*harga;
         
         System.out.println("==== HASIL ====");
         System.out.println("Nama proyek\t: "+nama);
         System.out.println("Luas tembok\t: "+luas+" m2");
         System.out.println("Kebutuhan cat\t: "+cat+" liter");
         System.out.println("Total biaya cat\t: Rp"+total);
    }
}
