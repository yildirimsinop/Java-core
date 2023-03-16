package day26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByvalueList2 {
    public static void main(String[] args) {

        // Bir method olusturalim
        // method'da yeni bir Liste olusturun
        // Listeye sayilar Listesindeki degerlerin 5 fazlasini element olarak atayin.
        // sonra sayilar Listesine deger olarak yeni List'i atayin
        // ve sayilar List'ini yazdirin.

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);

        System.out.println(sayilar);



    }

    public static void yeniListDegeriAta (List<Integer> sayilar) {
        // method'da yeni bir Liste olusturun

        List<Integer> yeniList = new ArrayList<>();

        // Listeye sayilar Listesindeki degerlerin 5 fazlasini element olarak atayin.

        for (int i = 0; i < sayilar.size(); i++) {

            yeniList.add(sayilar.get(i)+5);

           // System.out.println("method call'dan sonra main method'da sayilar List : " + sayilar);


        }
        // sonra sayilar Listesine deger olarak yeni List'i atayin

        sayilar = yeniList;

        // ve sayilar List'ini yazdirin.

        System.out.println("method'da sayilar Listesinin son hali : " + sayilar);

        System.out.println(yeniList);

    }
}
