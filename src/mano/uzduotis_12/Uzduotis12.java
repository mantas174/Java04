package mano.uzduotis_12;

public class Uzduotis12 {

    public Uzduotis12(){
        System.out.println("");
        System.out.println("Dvylikta uzduotis: ");

        int [] skaiciai = {10,6,7,8,99,4,7,100};
        System.out.println("Didziausias masyve skaicius: " +max(skaiciai));

    }
    public int max(int [] masyvas){
        int did = masyvas[1];

        for (int i = 0; i < masyvas.length; i++){
            if(masyvas[i] > did){
                did = masyvas[i];
            }
        }
        return did;
    }
}
