package day04_dataCasting_WrapperClasses;

public class C04_WrapperClases {
    public static void main(String[] args) {

        Integer sayi = 10;

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        String sonucStr = "345";

        System.out.println(sonucStr + 10);


        int sonuc = Integer.parseInt(sonucStr);

        System.out.println(sonuc+10);

        sonuc = Integer.valueOf(sonucStr);

        System.out.println(sonuc+10);


        char krk = '3';

        System.out.println(Character.isDigit(krk));
        System.out.println(Character.isLetter(krk));

        System.out.println(Character.isAlphabetic(krk));


    }
}
