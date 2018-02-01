package mano.uzduotis_13;

public class Uzduotis13 {

    public Uzduotis13(){
        System.out.println("");
        System.out.println("Trylikta uzduotis: ");

        int [] skaiciai = {1,2,5,4,7,8,9,2,4};

        System.out.println("Maziausias masyvo elemetas: " +min(skaiciai));
    }
    private int min(int [] masyvas){
        int min = masyvas[1];

        for(int ele : masyvas){
            if(ele < min){
                min = ele;
            }
        }
        return min;
    }
}
