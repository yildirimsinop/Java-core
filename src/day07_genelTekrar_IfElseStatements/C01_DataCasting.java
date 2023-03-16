package day07_genelTekrar_IfElseStatements;

public class C01_DataCasting {
    public static void main(String[] args) {

        // Java'da bazi data turleri asla baska data turlerine cevrilemez

        /*
        String str1 = false;
        String str2 = 20;
        boolean bl1 = 'a';
        int sayi1 = "Merhaba";

        */

        // ozllikle sayisal data turundeki degerler, baska sayisal data turundeki variable'lara atanabilir

        double db1 = 23;
        short sh1 = 12;

        int sayi2 = sh1;

        // Daha dar data turundeki degeri, daha genis data turundeki variable'a atamaya autowidening denir ve
        // java bunu otomatik olarak yapar.

        sh1 = (short) sayi2;
        sayi2 = (int) db1;

        // Daha genis data turundeki degeri, daha dar data turundeki variable'a atamaya explicit narrowing denir ve
        // java bunu otomatik olarak yapmaz bizden onay ister.

        sayi2 = 'k';

        if (sayi2 > 'd') {

        }

        // char data turundeki degerler, sayisal islemlerde kullanilabilir
        // bir char matematiksel islmede kullanilirsa ASCII table'daki degeri ile isleme girer


        System.out.println('k' + 1); //108

        // eger bu islemenin char olarak degerini yazdirmak istersek
        // sayisal degerler char'a cast edilebilir.



        }
}
