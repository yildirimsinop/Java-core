package day12_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse,
         */

        int bas = 20;

        int bit = 4000000;

        int sayiToplami = 0;

        if (bit<bas) {

            System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");

        } else {

            for (int i = bas; i <= bit; i++) {

                sayiToplami += i;

            }
        }

        System.out.println("Sayilarin toplami : " + sayiToplami);



    }

}
