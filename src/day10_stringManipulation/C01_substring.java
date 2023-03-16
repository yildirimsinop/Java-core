package day10_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ne kadar guzel";

        // 1 - tek parametre olursa, o index'den baslar sonuna kadar yazdirir.

        System.out.println(str.substring(8));

        System.out.println(str.substring(0));

        System.out.println(str.substring(5));

        System.out.println(str.substring(str.length() - 3));

        System.out.println(str.substring(str.length()));

        System.out.println(str.substring(str.length()-1));


        // 2- iki parametre girilirse baslangicIndex'inden (dahil) baslar
        // bitiIndex'ine(haric) kadar olan bolume yazdirir.

        System.out.println(str.substring(5, 7));
        System.out.println(str.substring(3, 4));
        System.out.println(str.substring(0, 1));

        //str'in 5. indexteki karakterini yazdirin

        System.out.println(str.charAt(5));
        System.out.println(str.substring(5, 6));
        System.out.println(str.substring(2, 2));
        // System.out.println(str.substring(5, 1)); Erorr

    }
}
