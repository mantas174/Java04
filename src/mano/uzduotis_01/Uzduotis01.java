package mano.uzduotis_01;

import java.util.Scanner;

public class Uzduotis01 {

    public Uzduotis01(){
        System.out.println("");
        System.out.println("Pirma uzduotis: ");

        Scanner in = new Scanner(System.in);
        int sk; //vartootojo norimas skaicius

        System.out.print("Iveskite norima skaiciu: ");
        sk = in.nextInt();

        if (sk % 2 == 0){

            System.out.println(sk+ " Yra lyginis skaicius");
        }else {
            System.out.println(sk+ " Yra nelyginis skaicius");
        }
    }

}
