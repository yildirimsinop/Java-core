package day33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota{

    String model = "Corolla";
    String uretimYeri = "Turkiye";
    int yil = 2023;

    public static void main(String[] args) {

        Corolla corolla1 = new Corolla();
        BToyota corolla2 = new Corolla();
    }

}
