package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {

        String dosyaYolu = "src/day36_checkedExceptions/Deneme.txt";

        int k=0;

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlis veya dosya arizali");

        } catch (IOException e) {

            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }

        /*
            Bir kod calisirken birden fazla exception olusma ihtimali varsa bu kodun
            calisir hale getirmek icin 4 ihtimal vardir.

            1- Herbir exception ic ice try-catch bloklari kullanmak
            2- Bir tane try blogu birden fazla catch blogu olusturmak
            3- method signature'na tum exception ihtimallerini yazmak
            4- eger muhtemel exception'larin tumunu kapsayan, daha genis kapsamli
            bir exception varsa onu kullanmak
         */

        /*
            2. veya 3. ihtimallerde olusmasi muhtemel exception'lar arasinda
            parent-child iliskisi olup olmadigi kontrol edilmelidir.
            aralarinda parent-child iliskisi yoksa exception'lari istedigimiz sirada yazabiliriz.

            Ancak parent-child iliskisi varsa once child, sonra parent yazilmalidir.
            Aksi takdirde parent daha kapsamli oldugundan tum exception'lari yakalar ve
            asagidaki child exception islevsiz kalir.
            Java bu durumu kabul etmez, CTE verir.
         */
    }
}
