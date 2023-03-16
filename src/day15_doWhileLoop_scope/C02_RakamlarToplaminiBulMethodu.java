package day15_doWhileLoop_scope;

public class C02_RakamlarToplaminiBulMethodu {

        // Verilen pozitif bir tamsayinin rakamlar toplamini bize
        // donduren method olusturun

        public static int rakamlarToplaminiBul (int verilenSayi){

            int sayi = verilenSayi;

            int birlerBasamagi = 0;

            int rakamlarToplami = 0;

            int basamakSayisi = (sayi + "").length();

            for (int i = 0; i <= basamakSayisi; i++) {

                birlerBasamagi = sayi % 10;
                rakamlarToplami += birlerBasamagi;
                sayi /= 10;


            }

            return rakamlarToplami;
        }
    }
