package mano.uzduotis_10;


import java.util.Scanner;

public class Uzduotis10 {

    public Uzduotis10() {
        System.out.println("");
        System.out.println("Desimta uzduotis: ");

        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        boolean arTinka = false;

        do {
            System.out.println("iveskite skaiciu");
            n = in.nextInt();
            if (n >= 1) {
                sum = suma(n);
                arTinka = true;
            } else {
                System.out.println("Skaicius turi buti didesnis arba lygus vienam!");
            }
        } while (arTinka == false);
        System.out.println("Suma: " +sum);
    }

    private int suma(int n) {
        if (n == 0) {
            return 0;
        } else
            return n + suma(n - 1);
    }
}

