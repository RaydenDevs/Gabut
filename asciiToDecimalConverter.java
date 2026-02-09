package gabut;

import java.util.Scanner;

public class asciiToDecimalConverter {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        OUTER: //Label
        while (true) {
            System.out.println("===Konverter Ascii Text - Decimal (bytes)===");
            System.out.println("1.Ascii To Decimal");
            System.out.println("2.Decimal To Ascii");
            System.out.print("Pilih: ");
            int selectMenu = i.nextInt();
                    i.nextLine(); //buffer
            switch (selectMenu) {
                case 1 -> {
                    //hint
                    System.out.println("\nContoh penulisan \"Halo\", \"Hello World\", dll.");
                    System.out.print("ASCII Text: ");
                    String text = i.nextLine(); //ASCII input
                    decimalToAscii(text); //Decimal to ASCII conv. function
                    break OUTER; //Break to the label
                }
                case 2 -> {
                    //hint
                    System.out.println("\nPisahkan dengan (Spasi)");
                    System.out.println("Contoh penulisan \"45\", \"45 65 32\", dst.");
                    System.out.print("Decimal (byte): ");
                    String kode = i.nextLine(); //Decimal input
                    asciiToDecimal(kode); //ASCII to Decimal conv. function
                    break OUTER; //Break to the label
                }
                default ->
                    //repeat
                    System.out.println("\n>> Pilihan hanya berupa angka dan yang hanya ada di menu.\n");
            }
        }
    }
    
    //Decimal (byte) Function
    public static void decimalToAscii(String text) {
        int[] kode = new int[text.length()];
        for (int i = 0; i < kode.length; i++) {
            char conv = (char) text.charAt(i);
            //System.out.println("char ["+i+"] = "+conv); //debug
            kode[i] = (int) conv;
            //System.out.println("int ["+i+"] = "+kode[i]); //debug
        }
        //Result
        System.out.println("ASCII Text \t= \""+text+"\"");
        System.out.print("Decimal (byte) \t= ");
        for (int i : kode) {
            System.out.print(i+" ");
        }
    }
    
    //Ascii Text Function
    public static void asciiToDecimal(String code) {
        //Get numbers
        String[] nums = code.trim().split("\\s+");
        //Convert
        int[] kode = new int[nums.length];
        char[] kata = new char[nums.length];
        for (int j = 0; j < nums.length; j++) {
            kode[j] = Integer.parseInt(nums[j]);
            kata[j] = (char) kode[j];
            //System.out.println("char ["+j+"] = "+kata[j]); //debug
        }
        //Result
        System.out.print("\nDecimal (byte) \t= ");
        for (int c : kode) {
            System.out.print(c+" ");
        }
        System.out.println("");
        
        System.out.print("ASCII Text \t= \"");
        for (char c : kata) {
            System.out.print(c);
        }
        System.out.println("\"");
    }
}
