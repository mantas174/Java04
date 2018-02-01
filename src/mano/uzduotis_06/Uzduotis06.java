package mano.uzduotis_06;

import java.util.Scanner;

public class Uzduotis06 {
    private String[] sk = new String[5];

    public Uzduotis06() {
        System.out.println("");
        System.out.println("Sesta uzduotis: ");

        zodziuIvedimas();
        rezulatatas();

    }

    private void zodziuIvedimas() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");

        for (int i = 0; i < sk.length; i++) {
            sk[i] = in.nextLine();
        }
    }
    private void rezulatatas(){
        System.out.print("Jusu ivesti zodziai: ");
        for (int i = 0; i < sk.length; i++) {
            System.out.print("" +sk[i]+ ", ");
        }
        System.out.println("");
    }
}
