package day26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        // bir method olusturalim ve method'da List'deki sayilari 5 artiralim
        // ve method'da Listenin son halini yazdiralim.

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5ArtirMethodu(sayilar);
        elementleri5ArtirMethodu(sayilar);
        elementleri5ArtirMethodu(sayilar);

        // method call sonrasi main method icerisinde List'i tekrar yazdiralim

        System.out.println("Method call sonrasi main method'da list : " + sayilar);


    }


    public static void elementleri5ArtirMethodu (List<Integer> sayilar) {

        for (int i = 0; i < sayilar.size(); i++) {

            sayilar.set(i, sayilar.get(i) + 5);

        }

        System.out.println(sayilar);

    }
}
