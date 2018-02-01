package mano.uzduotis_09;

import java.util.Scanner;

public class Uzduotis09 {

    private static final int OPERACIJA_SUMA = 1;
    private static final int OPERACIJA_SKIRTUMAS = 2;
    private static final int OPERACIJA_SANDAUGA = 3;
    private static final int KARTOJIMAS = 5;

    public Uzduotis09() {
        System.out.println("");
        System.out.println("Devinta uzduotis: ");

        Scanner in = new Scanner(System.in);
        int sk1, sk2, rezultatas = 0;
        int operacija, arKartoti = 1;


        do {
            System.out.println("Iveskite du skaicius: ");
            sk1 = in.nextInt();
            sk2 = in.nextInt();

            System.out.println("Iveskite skaiciu pagal norima operacija tarp priestai pasirinktu skaiciu: ");
            System.out.println("1 - suma");
            System.out.println("2 - skirtumas");
            System.out.println("3 - sandauga");
            operacija = in.nextInt();

            switch (operacija) {
                case OPERACIJA_SUMA:
                    rezultatas = sk1 + sk2;
                    break;
                case OPERACIJA_SKIRTUMAS:
                    rezultatas = sk1 - sk2;
                    break;
                case OPERACIJA_SANDAUGA:
                    rezultatas = sk1 * sk2;
                    break;
                default:
                    System.out.println("Reik pasirinkti nuo 1 iki 3");
                    break;
            }
            System.out.println("Rezultatas: " + rezultatas);
            System.out.println("Ar noretumete testi? Jei taip iveskite 5");
            arKartoti = in.nextInt();
        } while (arKartoti == KARTOJIMAS);
    }
}
