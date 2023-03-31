package day45_maps;

import day44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {

        // Ogrenci map'inde numarasi verilen sayilarin arasinda (sinirlar dahil) olan ogrencilerin
        // isim soyisim ve bolumlerini list olarak bize döndüren bir method oluşturun.

        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
        */

        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();

        ogrenciMap.put(107, "Tugay-Cil-12-K-MF");
        ogrenciMap.put(103, "Hikmet-Saglam-11-M-Soz");

        int basNo = 102;
        int bitisNo = 120;

        List<String> isimListesi = MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap, basNo, bitisNo);

        System.out.println(isimListesi);

    }
}
