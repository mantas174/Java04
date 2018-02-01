package com.company;

// paketu importavimas jog butu galima naudotis klasemis
import mano.uzduotis_01.Uzduotis01;
import mano.uzduotis_02.Uzduotis02;
import mano.uzduotis_03.Uzduotis03;


import java.util.Scanner;

public class Main {
    private static final int EXIT_CODE = 0;
    private static final int UZDUOTIS_1 = 1;
    private static final int UZDUOTIS_2 = 2;
    private static final int UZDUOTIS_3 = 3;

    public static void main(String[] args) {
	    Main obj = new Main();
	    obj.vykdykPrograma();
    }

    private void pasirinkimai(){
        System.out.println("-------------------------------");
        System.out.println("Pasirinkimai:");
        System.out.println(UZDUOTIS_1+ " Uzduotis");
        System.out.println(UZDUOTIS_2+ " Uzduotis");
        System.out.println(UZDUOTIS_3+ " Uzduotis");
1

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
                case UZDUOTIS_1:
                    new Uzduotis01();
                    break;
                case UZDUOTIS_2:
                    new Uzduotis02();
                    break;
                case UZDUOTIS_3:
                    new Uzduotis03();
                    break;



            }
        }
    }

}
