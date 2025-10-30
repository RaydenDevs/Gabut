package gabut;

import java.util.Random;
import java.util.Scanner;

public class BatuGuntingKertas {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Random r = new Random();

        for (int c = 0; c == 0; c++) {
            int cpu = r.nextInt(1, 3);
            System.out.println("\nPermainan Batu, Gunting, Kertas");
            System.out.println("Player vs CPU");
            System.out.println("1. Batu");
            System.out.println("2. Gunting");
            System.out.println("3. Kertas");
            System.out.print("\nPilih: ");
            String a = i.nextLine();
            if (a.equalsIgnoreCase("batu") || a.equals("1")) {
                System.out.println("\nPlayer: Batu");
                switch (cpu) {
                    case 1 -> {
                        System.out.println("Cpu: Batu");
                        System.out.println("Seri");
                        c--;
                    }
                    case 2 -> {
                        System.out.println("Cpu: Gunting");
                        System.out.println("Menang");
                    }
                    case 3 -> {
                        System.out.println("Cpu: Kertas");
                        System.out.println("Kalah");
                    }
                }
            } else if (a.equalsIgnoreCase("gunting") || a.equals("2")) {
                System.out.println("\nPlayer: Gunting");
                switch (cpu) {
                    case 1 -> {
                        System.out.println("Cpu: Batu");
                        System.out.println("Kalah");
                    }
                    case 2 -> {
                        System.out.println("Cpu: Gunting");
                        System.out.println("Seri");
                        c--;
                    }
                    case 3 -> {
                        System.out.println("Cpu: Kertas");
                        System.out.println("Menang");
                    }
                }
            } else if (a.equalsIgnoreCase("kertas") || a.equals("3")) {
                System.out.println("\nPlayer: Kertas");
                switch (cpu) {
                    case 1 -> {
                        System.out.println("Cpu: Batu");
                        System.out.println("Menang");
                    }
                    case 2 -> {
                        System.out.println("Cpu: Gunting");
                        System.out.println("Kalah");
                    }
                    case 3 -> {
                        System.out.println("Cpu: Kertas");
                        System.out.println("Seri");
                        c--;
                    }
                }
            } else {
                System.out.println("Pilihan tidak ada.");
            }
        }

    }
}
