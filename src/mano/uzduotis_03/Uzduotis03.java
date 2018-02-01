package mano.uzduotis_03;

import java.util.Scanner;

public class Uzduotis03 {
    public Uzduotis03(){
        System.out.println("");
        System.out.println("Trecia uzduotis: ");

        Scanner in = new Scanner(System.in);
        int sk, suma = 0;

        do{
            System.out.println("Iveskite norima skaiciu: ");
            sk = in.nextInt();

            suma += sk;

            System.out.println("Ar noresite kartoti, jei ne iveskite \"0\" ");

        }while(sk != 0);
        System.out.println("Jusu ivestu skaiciu suma: " + suma);
    }
}
