package day40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {

    // Bir class'i bir interface'in child'i yapmak icin implements keyword kullanilir.

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interface
        // sayi = 40; yazili olmasada Interface icerisinde oldugundan final'dir ve atama yapilamaz.

        System.out.println(Integer.MAX_VALUE);

        // normalde variable isimleri, kucuk harfle baslar ve camelcase kullanilir.
        // ancak java da ortak kabul olarak
        // static ve final olarak isaretlenen variable isimleri tamamen BUYUK HARF ile yazilir.


        System.out.println(Math.PI);
    }

    @Override
    public Void method1() {
        return null;
    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
