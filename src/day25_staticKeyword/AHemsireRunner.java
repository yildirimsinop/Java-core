package day25_staticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {

        AHemsire h1 = new AHemsire();

        h1.personelIsim = "Ayse";
        h1.personelAdresi = "Ulus";
        h1.personelTelefon = "123456";
        System.out.println(h1);

        System.out.println("===============");

        AHemsire h2 = new AHemsire();
        System.out.println(h2);
        h2.personelIsim = "Hatice";
        h2.personelAdresi = "Sincan";
        h2.personelTelefon = "3124323232";
        h2.bashekimIsmi = "Yasar Kemal";

        System.out.println("===============");

        System.out.println("h2 : " + h2);
        System.out.println("h1 : " + h1);

        System.out.println("===============");

        AHemsire h3 = new AHemsire();

        System.out.println("h3 : " + h3);
        h3.hastaneIsmi = "Java Hastanesi";

        System.out.println(h3.hastaneIsmi);

    }
}
