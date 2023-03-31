package day45_maps;

import day44_maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        // Ogrenci Map'inden Numara, isim ve soyisim degerlerini yazdiralim

        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        ogrenciMap.put(110, "Suleyman-Sah-11-H-MF");
        ogrenciMap.put(105, "Sule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
    }
}
