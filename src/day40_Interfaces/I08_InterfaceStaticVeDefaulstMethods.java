package day40_Interfaces;

public interface I08_InterfaceStaticVeDefaulstMethods {

     /*
         Java 8 ile Developer'larin talebi uzerine yeni bir istisnai durum Java'ya eklnemistir.
         bir interface'i yillar icerisinde yuzlerce class inherit etmis olabilir.

         Sonraden interface'e eklenen bir abstract method, tum eski child'lar tarafindan inherit
         edilmelidir, aksi takdir de tum eski child class'lar CTE verecektir.

         Java 8 ile birlikte Java, Interface'lere default veya static ile isaretlenmek sarti ile
         body'si olan method eklenmesine izin vermistir.
         Bu sayede intreface'e sonraden eklenen method body'si oldugu icin override
         edilmek zorunda DEGILDIR.


         Interface icerisinde body'si olan method olusturmak icin kullanilan default
         ve statci keyword'leri arasinda tek bri fark vardir.

         default kullanilan method'lar obje olusturularak cagrilabilirken
         static olarak isaretlenen method'lar direk kullanilabilir.


      */

    void method1 ();
    void method2 ();


    // Interface'deki tum methodlar public ve abstractir.
    // biz interface'deki bir method deklarasyonuna default yazarsak
    // bu access modifier degildir.

    public default void method3 () {
        System.out.println("interface icindeki body'li default method");
    }

    public static void method4 () {
        System.out.println("interface icindeki body'li static method");
    }
}
