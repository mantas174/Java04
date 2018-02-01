package com.company;

// paketu importavimas jog butu galima naudotis klasemis
import mano.uzduotis_01.Uzduotis01;
import mano.uzduotis_02.Uzduotis02;
import mano.uzduotis_03.Uzduotis03;
import mano.uzduotis_04.Uzduotis04;
import mano.uzduotis_05.Uzduotis05;
import mano.uzduotis_06.Uzduotis06;
import mano.uzduotis_07.Uzduotis07;
import mano.uzduotis_08.Uzduotis08;
import mano.uzduotis_09.Uzduotis09;


import java.util.Scanner;

public class Main {
    private static final int EXIT_CODE = 0;
    private static final int UZDUOTIS_1 = 1;
    private static final int UZDUOTIS_2 = 2;
    private static final int UZDUOTIS_3 = 3;
    private static final int UZDUOTIS_4 = 4;
    private static final int UZDUOTIS_5 = 5;
    private static final int UZDUOTIS_6 = 6;
    private static final int UZDUOTIS_7 = 7;
    private static final int UZDUOTIS_8 = 8;
    private static final int UZDUOTIS_9 = 9;

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
        System.out.println(UZDUOTIS_4+ " Uzduotis");
        System.out.println(UZDUOTIS_5+ " Uzduotis");
        System.out.println(UZDUOTIS_6+ " Uzduotis");
        System.out.println(UZDUOTIS_7+ " Uzduotis");
        System.out.println(UZDUOTIS_8+ " Uzduotis");
        System.out.println(UZDUOTIS_9+ " Uzduotis");


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
                case UZDUOTIS_4:
                    new Uzduotis04();
                    break;
                case UZDUOTIS_5:
                    new Uzduotis05();
                    break;
                case UZDUOTIS_6:
                    new Uzduotis06();
                    break;
                case UZDUOTIS_7:
                    new Uzduotis07();
                    break;
                case UZDUOTIS_8:
                    new Uzduotis08();
                    break;
                case UZDUOTIS_9:
                    new Uzduotis09();
                    break;



            }
        }
    }

}
