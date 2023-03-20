package day34_overriding_pollymorphism;

public class BChild extends Aparent {

    public void method1() {

        System.out.println("Child class method1");
    }

    public void method2 (int a) {

        // overriding olabilmesi icin
        // hem method ismi, hem de method signature ayni olmalidir.

        System.out.println("Child class method2");
    }

    public void method2 (String isim) {

        // Overriding Child ve parents claslari arasinda olur.

        System.out.println("Child class String parametreli method");
    }

    @Override
    public void method3(String str) {
        // super.method3(str);
        // overriding varsa parent ve child class'daki
        // overridden ve overriding method'lardan sadece biri calisir.
        // eger ikisini birden calistirmak isterseniz
        // super.overriddenMethodIsmi yazilir.

        /*
           Overrideng method @Override notasyonu ile isaretlenebilir.
           @override kullanilmayan overriding isleminde, parent class'daki
           overridden method silinirse hic bir sorun olmaz.

           Ancak @override kullanilmayan overriding isleminde, parent class'daki
           overridden method silinirse veya signature'i degistirilirse
           Java CTE verir, boylece overridden method'un
           silinmesi engellenir.

         */
    }
}
