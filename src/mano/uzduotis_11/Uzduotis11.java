package mano.uzduotis_11;

import java.util.Scanner;

public class Uzduotis11 {

    private static final int PASIRINKIMAS_SUMA = 1;
    private static final int PASIRINKIMAS_SANDAUGA = 2;

    public Uzduotis11(){
        System.out.println("");
        System.out.println("Vienuolika uzduotis: ");

        Scanner in = new Scanner(System.in);
        int n, sum = 0, san = 1;
        boolean arTinka = false;
        int operacija;

        do {
            System.out.println("iveskite skaiciu");
            n = in.nextInt();
            if (n >= 1) {
                System.out.println("Ka skaiciuoti: 1-suma, 2-sandauga");
                operacija = in.nextInt();
                switch (operacija){
                    case PASIRINKIMAS_SUMA:
                        sum = suma(n);
                        System.out.println("Suma: " +sum);
                        break;
                    case PASIRINKIMAS_SANDAUGA:
                        san = sandauga(n);
                        System.out.println("Sandauga: " +san);
                        break;
                }

                arTinka = true;
            } else {
                System.out.println("Skaicius turi buti didesnis arba lygus vienam!");
            }
        } while (arTinka == false);

    }

    private int suma(int n) {
        if (n == 0) {
            return 0;
        } else
            return n + suma(n - 1);
    }
    private int sandauga(int n) {
        if (n == 1) {
            return 1;
        } else
            return n * sandauga(n - 1);
    }
}