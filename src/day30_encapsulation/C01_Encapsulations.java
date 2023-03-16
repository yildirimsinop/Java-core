package day30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1 = new AEncapsuleClass();
        // pers1.hastaneAdi = "Java Hastanesi"; private oldugu icin goremiyoruz.

        // pers1.hastaUcreti = 10000; private oldugu icin kullanilmaz.

        // pers1.hemsireAdresi= "Ankara";
        // pers1.hemsireIsmi = "Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmi());
        String isim = pers1.getHastaneIsmi();
        System.out.println(isim);


        pers1.setHastaUcreti(1000);

        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir.

        System.out.println(pers1.getHemsireAdresi());

        pers1.setHemsireAdresi("Istanbul");

        System.out.println(pers1.getHemsireIsmi());

        pers1.setHemsireIsmi("Hale");


    }
}
