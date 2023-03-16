package day14_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {


        /*

        Java overloading kurallari

        1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
        2- Data turleri farkli olan parametrelerin yerlerini degistirirsek java yeni bir method olarak kabul eder
           (int, double) (double, int)

         Overloading olan class'larda Java hangi method'un calistirilacagina su sekilde karar verir
           1- Cagrilan isimde method var mi?
           2- method call'da kullanilan arguments ile method'lardaki parametrelerin %100 uyumlu oldugu var mi?
           3- Argument ile parametre ayni olmasa bile verilen argumentleri kabul edecek parametre var mi?
           4- Casting ile birden fazla method'u kullanabiliyorsa daha az casting ile calisacak method'u kullanir.


         */

        topla(3, 5);
        topla(3.4, 5.2);

        topla('a', 'b'); // iki int 195

        topla(3f, 4f); // iki double toplami 7.0

        topla(3f, 4);


    }

    public static void topla (int a, int b) {

        System.out.println("Iki tamsayinin toplami : " + (a + b));
    }

    public static void topla (double a, double b) {

        System.out.println("Iki double sayinin toplami : " + (a + b));
    }

    public static void topla (int sayi1, double sayi2) {

        System.out.println("int ve double sayinin toplami : " + (sayi1 + sayi2));
    }

    public static void topla (double sayi1, int sayi2) {

        System.out.println("Double ve int toplami : " + (sayi1 + sayi2));
    }


}
