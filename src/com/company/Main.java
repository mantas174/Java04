package com.company;

import mano.uzduotis_01.Uzduotis01;// paketu importavimas


import java.util.Scanner;

public class Main {
    private static final int EXIT_CODE = 0;
    private static final int Uzduotis_1 = 1;

    public static void main(String[] args) {
	    Main obj = new Main();
	    obj.vykdykPrograma();
    }

    private void pasirinkimai(){
        System.out.println("-------------------------------");
        System.out.println("Pasirinkimai:");
        System.out.println(Uzduotis_1+ " Pasirinkimas");

        System.out.println(EXIT_CODE+ " Baigs darba");
        System.out.println("-------------------------------");
        System.out.print("Koks pasirinkimas- ");
    }
    public void vykdykPrograma(){
        boolean arTesti = true;
        Scanner in = new Scanner(System.in);
        while(arTesti == true){
            pasirinkimai();
            int veiksmas = in.nextInt();
            switch (veiksmas) {
                case EXIT_CODE:
                    arTesti = false;
                    System.out.println("Darbas baigtas");
                    break;
                case Uzduotis_1:
                    new Uzduotis01();
                    break;

            }
        }
    }

}
