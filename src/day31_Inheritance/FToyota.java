package day31_Inheritance;

public class FToyota extends EAraba{

    FToyota () {
        System.out.println("Toyota cont. calisti");
    }

    protected String marka = "Toyota";
    protected String motor = "Toyota araclar cevreci motorlar kullanir";
    protected String utetimYeri = "Uretim yeri belirtilmemis";
    protected int hiz = 140;
}
