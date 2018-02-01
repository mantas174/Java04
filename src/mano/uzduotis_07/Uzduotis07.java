package mano.uzduotis_07;

import java.util.Scanner;

public class Uzduotis07 {

    private int[] skaiciai;

    public Uzduotis07(){
        ivedimas();
        spausdinimas();

    }
    private void ivedimas(){
        Scanner in = new Scanner(System.in);
        int kiek;

        System.out.println("Iveskite kiek noresite ivesti skaiciu: ");
        kiek = in.nextInt();


        skaiciai = new int[kiek];
        for (int i = 0; i < skaiciai.length; i++){
            System.out.println("Iveskite " +(i+1)+ " skaiciu");
            skaiciai[i] = in.nextInt();
        }

    }
    private void spausdinimas(){
        boolean arNera = true;
        System.out.println("Ivesti skaiciai kurie buvo idesni nei 100: ");
        for (int i = 0; i < skaiciai.length; i++){
            if (skaiciai[i] > 100){
                System.out.println(skaiciai[i]);
            }
        }
    }
}
