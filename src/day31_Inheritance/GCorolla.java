package day31_Inheritance;

public class GCorolla extends FToyota{

    String model = "Corolla";
    String uretimYeri = "Turkiye";

    GCorolla () {
        System.out.println("Corolla cont. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1 = new GCorolla();
        System.out.println(corolla1.marka);  //Toyota


        /*
           Bir child class'dan obje olusturdugumuzda olusturulan obje sadece child class'a ait ozellikleri degil
           tum parent class'larindaki ozellikleri de tasir.

           Bir objenin bir class'in ozelliklerini tasimasi icin o obje olusturulurken class'a ait
           constructor'in calismis olmasi gerekir. Yani child class'indaki obje olusturulurken
           tum paretn class'lardaki constructor'lar da otomatik olarak calisir.

           Java bu islem icin soyle bir mekanizma gelistirmistir.
           Bir class olusturdugumuzda biz constructor olusturmasak da
           Java'nin o class'a default constructor koydugu gibi
           extends keyword kullanan bir class'da olusturulan her bir constructor'in
           ilk satirina biz gormesek de super () constructor call koyar.

         */
    }
}
