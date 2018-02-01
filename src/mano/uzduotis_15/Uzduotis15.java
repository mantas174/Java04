package mano.uzduotis_15;

public class Uzduotis15 {

    public Uzduotis15(){
        System.out.println("");
        System.out.println("Penkiolikta uzduotis: ");

        String eil = "Sioje eiluteje yra trys \"a\" raides";
        String eil2 = "aa654";

        System.out.println("Eiluteje yra " + aKiekis(eil2)+ "\"a\" raide (-s) ");
    }

    public int aKiekis (String eilute){
        int kiek = 0;
        int arNeSk = arNeSkaicius(eilute);

        if(arNeSk == 1) {
            for (int i = 0; i < eilute.length(); i++) {
                if (eilute.charAt(i) == 'a') {
                    kiek++;
                }
            }
            return kiek;
        }else {
            return 0;
        }
    }
    private int arNeSkaicius(String eilute){
        float test;
        try{
            test = Float.parseFloat(eilute);
            return 0;
        }catch(Exception e) {
            //System.out.print("Klaida " +e);
            return 1;
        }
    }
}
