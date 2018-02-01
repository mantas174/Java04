package mano.uzduotis_08;

import java.util.Scanner;

public class Uzduotis08 {

    private Scanner in;

    public Uzduotis08() {
        System.out.println("");
        System.out.println("Astunta uzduotis: ");

        in = new Scanner(System.in);
        int kiek;

        System.out.println("Iveskite kiek noresite ivesti skaiciu: ");
        kiek = in.nextInt();

        int[] skaiciai = new int[kiek];

        ivedimas(skaiciai);

    }

    private void ivedimas(int[] sk_masyvas) {
        in = new Scanner(System.in);
        for (int i = 0; i < sk_masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu");
            sk_masyvas[i] = in.nextInt();
        }
        spausdinimas(sk_masyvas);
    }

    private void spausdinimas(int[] skaiciai) {
        System.out.println("Ivesti skaiciai kurie buvo idesni nei 100: ");
        for (int i = 0; i < skaiciai.length; i++) {
            if (skaiciai[i] > 100) {
                System.out.println(skaiciai[i]);
            }
        }
    }
}
