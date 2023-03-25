package day40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface {

    // Eger bir interface'i baska bir interface'in child'i yapmak isterseniz
    // extends keyword kullanilir.

    // Bir interface concrete class'i INHERIT EDEMEZ.


    Void method1 ();
    // Interface bir child parent interface'deki
    // abstract methodu override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur.

    int method4 ();
    boolean method5 ();

}
