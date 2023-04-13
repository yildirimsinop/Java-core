package day33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota{

    String model = "Corolla";
    String uretimYeri = "Turkiye";
    int yil = 2023;

    public static void main(String[] args) {

        /*
             Bir obje olusturulurken
             data turu ve constructor ayni class'dan ise
             bir VARIABLE'in degerini bulmak icin o
             class'a gideriz. O class'da yoksa sirasiyla
             parent class'lara bakilir ilk bulunan kullanilir.
         */

        Corolla corolla1 = new Corolla();
        System.out.println(corolla1.model);
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.yil);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.motor);
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);

        //Corolla
        //Turkiye
        //2023
        //Binek araclarin markasi vardir
        //Tum araclar motor kullanir
        //Tum araclarin plakasi olur
        //Toyota cevreci yakit kullanir

        System.out.println("==============");


        BToyota corolla2 = new Corolla();
        /*
           Obje olusturulurken data turu ve constructor
           farkli ise VARIABLE'in degerini bulmak icin
           Data turu olan class'a gidilir. Varsa kullanilir,
           yoksa o class'in parent'larina bakilir.
           Bulunamazsa CTE verir. Geri vites yapmaz.
         */

        System.out.println(corolla2.model);
       // System.out.println(corolla2.uretimYeri);
        System.out.println(corolla2.yil);
        System.out.println(corolla2.marka);
        System.out.println(corolla2.motor);
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);

        //Binek araclarin modeli olur
        //1900
        //Binek araclarin markasi vardir
        //Tum araclar motor kullanir
        //Tum araclarin plakasi olur
        //Toyota cevreci yakit kullanir

        System.out.println("==============");

        Araba corolla3 = new Corolla();

        // System.out.println(corolla3.model);
        // System.out.println(corolla3.uretimYeri);
        // System.out.println(corolla3.yil);
        // System.out.println(corolla3.marka);
        System.out.println(corolla3.motor);
        System.out.println(corolla3.plaka);
        System.out.println(corolla3.yakit);

        // Tum araclar motor kullanir
        //Tum araclarin plakasi olur
        //Araclar farkli yakitlar kullanir

        System.out.println("==============");

        BToyota toyota1 = new BToyota();
        System.out.println(toyota1.marka);
        System.out.println(toyota1.model);
        System.out.println(toyota1.yil);
        System.out.println(toyota1.yakit);
        System.out.println(toyota1.motor);
        System.out.println(toyota1.plaka);

        //Binek araclarin markasi vardir
        //Binek araclarin modeli olur
        //1900
        //Toyota cevreci yakit kullanir
        //Tum araclar motor kullanir
        //Tum araclarin plakasi olur

        System.out.println("==============");

        Araba toyota2 = new BToyota();
        // System.out.println(toyota2.marka);
        // System.out.println(toyota2.model);
        // System.out.println(toyota2.yil);
        System.out.println(toyota2.yakit);
        System.out.println(toyota2.motor);
        System.out.println(toyota2.plaka);

        //Araclar farkli yakitlar kullanir
        //Tum araclar motor kullanir
        //Tum araclarin plakasi olur

        System.out.println("==============");

    }

}
