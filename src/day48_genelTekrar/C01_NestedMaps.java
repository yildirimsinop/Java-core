package day48_genelTekrar;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMaps {
    public static void main(String[] args) {

        Map<String, String> kullaniciBilgileriMap = new HashMap<>();

        kullaniciBilgileriMap.put("isim", "Mehmet");
        kullaniciBilgileriMap.put("hesap turu", "USD");


        Map<String, String > hesapHareketDtayiMap = new HashMap<>();

        Map<String,String> hesapHareketleriMap = new HashMap<>();
        hesapHareketleriMap.put("101", "hesapHareketleriMap");


    }
}
