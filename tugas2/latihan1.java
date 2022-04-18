
public class latihan1 {
    public static void main(String[] a) {
        Mobil2 avanza = new Mobil2();
        Mobil2 xenia = new Mobil2();
        avanza.hidupkanMobil("Avanza Silver");
        avanza.ubahGigi("Avanza Silver");
        avanza.maju();
        avanza.mundur();
        avanza.belok();
        System.out.println("Roda Avanza\t: " + avanza.roda1);
        System.out.println("Roda Xenia\t: " + xenia.roda1);
        System.out.println("Mesin Avanza\t: " + avanza.mesin1);
        System.out.println("Mesin Xenia\t: " + xenia.mesin1);
        System.out.println("Roda Avanza\t: " + avanza.roda2);
        System.out.println("Roda Xenia\t: " + xenia.roda1);
        System.out.println("Mesin Avanza\t: " + avanza.mesin2);
        System.out.println("Mesin Xenia\t: " + xenia.mesin2);
        System.out.println("Mesin Avanza\t: " + avanza.mesin2);
        System.out.println("Mesin Xenia\t: " + xenia.mesin2);
        avanza.matikanMobil("Avanza Silver");
    }
}
