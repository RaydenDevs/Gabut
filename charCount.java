package gabut;

import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String teks = i.nextLine().replace(" ", "");
        String p = "";
        String s = "";
        for (int j = 0; j < teks.length(); j++) {
            char c = teks.charAt(j);
            int index = s.indexOf(c);
            if (index != -1) s = s.substring(index + 1);
            s += c;
            if (s.length() > p.length()) p = s;
            System.out.print("["+c+" = "+index+"] "); //pengecekan
            System.out.println(s+" - "+p);
        }
        System.out.println("Terpanjang: "+p);
    }
}
