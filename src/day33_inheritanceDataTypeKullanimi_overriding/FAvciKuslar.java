package day33_inheritanceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar{

    public void hareket () {
        System.out.println("Avci kuslar ucarlar");
    }

    public void beslenme () {
        System.out.println("Avci kuslar etle beslenir");
    }

    public void pence () {
        System.out.println("Avci kuslar pencelidir");
    }

    public void gaga () {
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1 = new FAvciKuslar();

        /*
           Bir obje olusturulurken constructor ve data turu ayni ise
           Hangi method'un gecerli oldugunu bulmak icin o class'a gider
           varsa kullaniriz yoksa sirasi ile parent'lara gider ilk buldugumuzu
           kullaniriz.
         */
        avci1.beslenme(); // Avci kuslar
        avci1.gaga(); // Avci kuslar
        avci1.pence(); // Avci kuslar
        avci1.hareket(); // Avci kuslar
        avci1.cogalma(); // Kuslar
        avci1.kanat(); // Kuslar
        avci1.omur(); // Hayvanlar
        avci1.solunum(); // Kuslar

        // Avci kuslar etle beslenir
        //Avci kuslar sivri gagalidir
        //Avci kuslar pencelidir
        //Avci kuslar ucarlar
        //Kuslar yumurta ile cogalirlar
        //Kuslar kanatlidirlar
        //Hayvanlar yasarlar ve olurler
        //Kuslar akcigerle nefes alirlar

        System.out.println("================");

        EKuslar avci2 = new FAvciKuslar();
        /*
           Bir obje olusturulurken data turu ile constructor farkli ise
           hangi METHOD'un gercerli olacagini bulmak icin

           Once data turunun oldugu class ve parent'larina bakarak o method'u
           buluruz. Bulamazsak CTE verir.

           Bulursak HEMEN CALISTIRMAYIZ.
           calistirmadan once o method override edilmis mi diye kontrol ederiz. Override edilmisse
           override eden method'u calistiririz.

         */

        avci2.beslenme(); // Avci kuslar
        avci2.gaga(); // Avci kuslar
        // avci2.pence(); // CTE
        avci2.hareket(); // Avci kuslar
        avci2.cogalma(); // Kuslar
        avci2.kanat(); // Kuslar
        avci2.omur(); // Hayvanlar
        avci2.solunum(); // Kuslar

        // Avci kuslar etle beslenir
        //Avci kuslar sivri gagalidir
        //Avci kuslar ucarlar
        //Kuslar yumurta ile cogalirlar
        //Kuslar kanatlidirlar
        //Hayvanlar yasarlar ve olurler
        //Kuslar akcigerle nefes alirlar

        System.out.println("================");

        DHayvanlar avci3 = new FAvciKuslar();

        avci3.beslenme(); // Avci kuslar
        // avci3.gaga(); // CTE
        // avci3.pence(); // CTE
        avci3.hareket(); // Avci kuslar
        avci3.cogalma(); // Kuslar
        // avci3.kanat(); // CTE
        avci3.omur(); // Hayvanlar
        avci3.solunum(); // Kuslar

        // Avci kuslar etle beslenir
        //Avci kuslar ucarlar
        //Kuslar yumurta ile cogalirlar
        //Hayvanlar yasarlar ve olurler
        //Kuslar akcigerle nefes alirlar


        EKuslar kus1 = new EKuslar();
        kus1.cogalma(); // Kuslar
        kus1.gaga(); // Kuslar
        kus1.kanat(); // Kuslar
        kus1.hareket(); //Hayvanlar
        kus1.solunum(); // Kuslar
        kus1.beslenme(); // Hayvanlar
        kus1.omur(); // Hayvanlar


        /*
            Method'larla belirlenen ozelliklar en guncel bilgiyi bulurken

            variable ile belirlenenn ozellikler ilk
            buldugu degeri kullanir
            bunun icin method'lara dinamik ozellik
            variable'a statik ozellik denir.
         */


        DHayvanlar kus2 = new EKuslar();

        kus2.cogalma(); // Kuslar
       // kus2.gaga(); // CTE
       // kus2.kanat(); // CTE
        kus2.hareket(); //Hayvanlar
        kus2.solunum(); // Kuslar
        kus2.beslenme(); // Hayvanlar
        kus2.omur(); // Hayvanlar




    }
}
