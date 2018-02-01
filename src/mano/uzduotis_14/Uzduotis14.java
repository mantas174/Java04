package mano.uzduotis_14;

public class Uzduotis14 {

    public Uzduotis14(){
        System.out.println("");
        System.out.println("Keturiolikta uzduotis: ");

        int [] skaiciai = {1,2,3,4,5};

        skaiciai = apsuktas(skaiciai);
        System.out.print("Apsuktas masyvas: ");
        for(int i = 0; i <skaiciai.length; i++ ){
            System.out.print(skaiciai[i]+ " ");
        }
        System.out.println();


    }
    public int[] apsuktas(int [] masyvas){
        int [] temp = new int [masyvas.length];
        int t = 0;

        for(int i = masyvas.length - 1; i >= 0; i--){
            temp[t] = masyvas[i];
            t++;
        }
        return temp;

    }
}
