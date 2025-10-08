package gabut;

import java.util.Scanner;

public class penentuanLulus {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.print("Masukkan nilai UTS: ");
        double uts = i.nextDouble();
        
        System.out.print("Masukkan nilai UAS: ");
        double uas = i.nextDouble();
        
        double rt = (uts + uas)/2;
        
        if (uts >= 60 && uas >= 60 && rt >= 70){
            System.out.println("Rata-rata: "+rt);
            System.out.println("Status: Lulus");
        }else {
            System.out.println("Rata-rata: "+rt);
            System.out.println("Status: Tidak lulus");            
        }
    }
}
