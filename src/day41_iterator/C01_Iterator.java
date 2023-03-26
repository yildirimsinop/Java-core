package day41_iterator;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        // Java collections icerisindeki bazi class'lar index desteklemez
        // Bu durumda index kullanmadan collection icerisindekii tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtihaclarimiz olur

        // List<> index yapisini destekledigi icin, boyle bir ihtiyac duymaz
        // ancak bugunluk index kullanmadan List' elemenlerine ulasmaya
        // ve onlari update etmeye calisalim.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        
        // index kullanmadan List'in tum elementlerini yazdirin.

        for (Integer each: sayilar
             ) {
            System.out.println(each + " ");
        }

        // Index kullanmadan List'in elementleri 1"er artirin
        // Index kullanmadan 25'den buyuk sayi'lari List'den silin.

        for (Integer each: sayilar
             ) {
            System.out.println(each+1 + " ");
        }

        System.out.println(sayilar);

        for (Integer each: sayilar
        ) {
            each += 1;

            System.out.println(each + " ");
        }

        System.out.println(sayilar);

        /*
           Index kullanmadan List'in elemanlarini kalici olarak degistirmek mumkun olmadi
           Java bunun icin Iterator interface'i olusturmustur.

         */
    }


}
