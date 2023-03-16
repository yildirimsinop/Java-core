package day11_stringManipulations_ForLoop;

public class C09_ForLoop {
    public static void main(String[] args) {

        // 50'den baslayip, 100'e kadar sayilari yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 50; i <=100 ; i++) {

            System.out.print(i + " ");

        }

        System.out.println("");
        
        // 3 basamakli sayilardan 23 ile bolunebilenleri yan yana, aralarinda bir bosluk olacak sekilde yazdririn

        for (int i = 100; i <1000 ; i++) {

            if (i%23==0) {

                System.out.print(i + " ");
            }

            System.out.println("");

            // 20'den baslayip, 7'ser artarak 100'e kadar yazdirin
            // (100 yazdirmaniz gerekiyorsa yazdirin ama 100'u gecmeyin)

            for (int j = 20; j <=100 ; j +=7) {
                System.out.print(j + " ");

            }

            System.out.println("");

            //100'den baslayarak 1'e kadar (sinirlar dahil)
            // 7 ile bolunebilen sayilari yazdirin


            for (int j = 100; j >=1 ; j--) {

                if (i%7==0) {
                    System.out.print(j+ " ");
                }

            }
            
        }
    }
}
