package day12_forLoops;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        // Verilen bir rakam icin carpim tablosu olusturun

        int sayi = 6;

        int k = 1;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");

        }
        k ++;

        System.out.println("");

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");

        }
        System.out.println("");

        k++;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(k*i + " ");

        }
        System.out.println("");

        k++;

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(4*i + " ");

        }


        System.out.println("==================");

        for (int m = 1; m <=sayi ; m++) {
            for (int i = 1; i <=sayi ; i++) {
                System.out.print(m*i + " ");

            }

            System.out.println("");
        }

        System.out.println("=====================");

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {

                System.out.print(i*j + " ");

            }

            System.out.println("");

        }
    }
}
