package mano.uzduotis_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzduotis04 {
    public Uzduotis04(){
        System.out.println("");
        System.out.println("Ketvirta uzduotis: ");

        int sk, suma = 0;

        do{
            sk = arSkaicius();

            suma += sk;

            System.out.println("Ar noresite kartoti, jei ne iveskite \"0\" ");

        }while(sk != 0);
        System.out.println("Jusu ivestu skaiciu suma: " + suma);
    }
    private int arSkaicius(){
        Scanner in = new Scanner(System.in);
        int skaicius = -1;
        boolean arsk = false;

        while(arsk == false){
            try{
                System.out.println("Iveskite norima skaiciu: ");
                skaicius = in.nextInt();
                arsk = true;
            }catch (InputMismatchException ivedimoKlaida){
                System.out.println("Klaida - " +ivedimoKlaida);
                in.next();
            }
        }
        return skaicius;
    }
}
