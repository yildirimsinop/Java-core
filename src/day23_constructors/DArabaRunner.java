package day23_constructors;

public class DArabaRunner {
    public static void main(String[] args) {

        // DAraba class'indan bir obje olusturalim

        DAraba arb1 = new DAraba();

        System.out.println(arb1.marka); // Marka belirtilmedi
        System.out.println(arb1.model); // Marka belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yil); //0
        System.out.println(arb1.fiyat); //0

        arb1.marka = "Tofas";
        arb1.model = "Kartal";
        arb1.yakit = "Benzin";
        arb1.yil= 1991;
        arb1.fiyat = 50000;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka); // Tofas

        System.out.println(arb1.model); // Kartal

        System.out.println(arb1.yakit); // Benzin

        System.out.println(arb1.yil); //1991

        System.out.println(arb1.fiyat); //50000

        System.out.println(arb1.maxHiz(arb1.yakit)); // 230

        DAraba arb2 = new DAraba();

        // arb2'nin ozelliklerini yazdirmak istesek

        System.out.println("Marka : " + arb2.marka);
        System.out.println("Model : " +arb2.model);
        System.out.println("Yakit : " +arb2.yakit);
        System.out.println("Yil : " +arb2.yil);
        System.out.println("Fiyat : " +arb2.fiyat);

        DAraba arb3 =new DAraba();

        System.out.println(arb3);
        System.out.println(arb1);

        System.out.println("=======================");

        DAraba arb4 = new DAraba();

        System.out.println(arb4);


    }
}
