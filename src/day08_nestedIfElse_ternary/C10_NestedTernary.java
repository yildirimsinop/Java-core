package day08_nestedIfElse_ternary;

public class C10_NestedTernary {
    public static void main(String[] args) {

        int sayi = 20;

        System.out.println( sayi>0
                            ? sayi%2==0 ? "Cift sayi" : "Tek sayi"
                            : sayi>-1000 && sayi <-99 ? "uc basamakli" : "3 basamakli degil" );
    }
}
