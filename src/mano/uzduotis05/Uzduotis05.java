package mano.uzduotis05;

import java.util.Scanner;

public class Uzduotis05 {
    private int suma = 0;
    private int[] sk = new int[5];

    public Uzduotis05() {
        System.out.println("");
        System.out.println("Penkta uzduotis: ");

        skaiciuIvedimas();
        rezulatatas();

    }

    private void skaiciuIvedimas() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");

        for (int i = 0; i < sk.length; i++) {
            sk[i] = in.nextInt();
            suma += sk[i];
        }
    }
    private void rezulatatas(){
        System.out.println("Jusu ivestu skaiciu suma: " +suma);
        System.out.print("Jusu ivesti skaiciai: ");
        for (int i = 0; i < sk.length; i++) {
            System.out.print("" +sk[i]+ " ");
        }
        System.out.println("");
    }
}
