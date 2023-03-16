package day29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    public static void main(String[] args) {

        /*
           Buyuk projelerde datayi gorme (read) yada datayi degistirme (write) yetkilerini
           birbirinden bagimsiz olarak duzenlemek isteyebiliriz.

           Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir.
           ANCAK
           ulasilabilen dataya hem okuma hem yazma yapilabilirken
           Ulasilamayan data ne okunabilir ne de degistirilebilir.

           gercek hayatdaki ihtiyaclar dusunuldugunde
           Javaya yetki sinirlamayi uyarlamak istersek

           - Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise
             access modifier kullanilir.

           - Eger okuma ve yazma yetkileri birbirinden ayrilacaksa
             o zaman access modifier yeterli olmaz
             Encapsulation (getter ve setter method'lari) kullanilmalidir.
             */

             // get ve set daha onceki java objelerinde karsimiza cikmisti.



        List<Integer> sayilar = new ArrayList<>();


        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        System.out.println(sayilar.get(1));  // get okumaya izin var ama deger atamaya izin vermiyor.

        // System.out.println(sayilar.set(0)); set varsa MUTLAKA deger atamalisin.


    }
}
