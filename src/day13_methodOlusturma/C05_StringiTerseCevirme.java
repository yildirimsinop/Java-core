package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir Stringi tersine cevirip
        // bize donduren bir method olusturun.

        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Adamin dibisin"));
    }

    public static String stringTersineCevir(String metin) { // Java

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        return tersMetin;



  }
}
