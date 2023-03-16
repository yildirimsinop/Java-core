package day12_forLoops;

public class C04_Faktoryel {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
         */


        int bas = 5;

        int sayilarCarpimi = 1;

        for (int i = bas; i >=1 ; i--) {

            sayilarCarpimi *= i;


        }

        System.out.println("Faktoryel :" + sayilarCarpimi);
    }
}
