package day34_overriding_pollymorphism;

public class DChild extends CParent {


    // Overriding Kurallari
    // 1- access modifier method signature'a dahil olmadigindan
    // overridden ve overriding access modifier'lar farkli olabilir.
    // child parent'i sinirlandiramaz.
    // yani overriding method'un access modifier'i
    // ayni veya daha genis kamsamli olmalidir.
    // private -- default -- protected -- public

    public void method1 () {

    }

    // 2- private ve static method'lar override edilemez.
    // ayni isimde method olusturulunca java CTE vermez.
    // ancak override isareti cikmaz ve
    // @Override notasyonu kullnilmak istenirse CTE olur.
    // Yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul eder.


    private void method3 () {


    }

    // 3- return type method signature'ina dahil olmadigindan
    // farkli secilebilir
    // return type void veya primitive ise ayni olmak zorundadir.
    // Eger return type'lar non-primitive ise
    // Child class'daki return type, parent class'daki return type'i
    // ile ayni veya child'i olmalidir

    public void method4 () {


    }

    public Integer method5 () {

        return 5;
    }



}
