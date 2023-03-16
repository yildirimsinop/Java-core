package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {
     /*

             Bir class icinde tum method'larin erisebilecegi variable'lar istenirse Class Level'da
             (Class'in icinde ama method'larin disinda) olusturulmalidir.

             1- Class Level'da olusturulan variablel'larin scope'u tum class'dir.

             2- Class Level'da olusturulan variable'lara deger atanmasa bile Java onlar icin tanimlanmis
                DEFAULT DEGERLER atar.

             3- Class Level'da olusturulan variable'lar static veya instance (static olmayan) olabilir.

             4- Static olarak tanimlanan variable'lar tum method'larda direk kullanilabilir.

             5- Method static ise, icerisine static olmayan hicbir sey almaz.

         */

     static int sayi = 10;
     static String isim;
     static boolean bl;

     static char chr;
     static int int1;

     int in2;

     boolean bl2;



     public static void main(String[] args) {

        System.out.println(sayi);
        System.out.println("String: " + isim);

         System.out.println("boolean : " + bl);

         System.out.println("char :" + chr);

         System.out.println("int : " + int1);

         // System.out.println(bl2); //instance

         staticMethod();
         // staticOlmayanMethod();



    }

    public static void staticMethod () {

        sayi ++;
        System.out.println(sayi); // static
        System.out.println(chr); // static
        //System.out.println(in2); //instance
        //System.out.println(bl2); // instance


    }

    public void staticOlmayanMethod () {

        sayi --;
        System.out.println(sayi);  // static
        System.out.println(bl);  // static
        System.out.println(bl2); // instance
        System.out.println(in2); // instance


    }
}
