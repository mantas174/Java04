package mano.uzduotis_02;

import java.util.Scanner;

public class Uzduotis02 {
    private static final String EXIT_CODE = "pabaiga";
    public Uzduotis02(){
        System.out.println("Antra uzduotis: ");
        System.out.println("Antra uzduotis: ");

        Scanner in = new Scanner(System.in);
        String zodis; //vartotojo ivestas zodis

        do {
            System.out.println("Iveskite pasirinkta zodi: ");
            zodis = in.nextLine();

            System.out.println("Jusu pasirinktas zodis - " +zodis);

            System.out.println("Ar noretumete kartoti programa, jei ne iveskite \"pabaiga\" ");

        }while(!zodis.equals(EXIT_CODE));



    }
}
