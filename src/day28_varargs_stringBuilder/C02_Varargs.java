package day28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        topla (5, 6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla(1);
        topla();
        topla(1,2,3,4,5,6,7);

         /*
                Bir method'da parametre sayisii sinirlandirmak istmezsek standart bir variable yerine
                varargs kullaniriz.

                Varargs data turunun yanina ... konularak deklare edilir.
                int ... ==> sayisi belirli olmayan int parametreler alan bir array'dir.

          */


    }

    private static void topla(int... sayilar) {

        int toplamSonucu = 0;
        for (int each: sayilar
             ) {

            toplamSonucu += each;

        }

        System.out.println("Girilen sayilarin toplami " + toplamSonucu);




    }
}
