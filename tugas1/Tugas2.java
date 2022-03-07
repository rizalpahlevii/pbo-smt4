public class Tugas2 {
    public static void main(String[] s) {
        persegi();
        segitiga();
        lingkaran();
        kubus();
    }

    static void persegi() {
        int panjang = 20;
        int lebar = 30;
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("======= Persegi =======");
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
        System.out.println("=======================");
        System.out.println("\t");
    }

    static void segitiga() {
        int alas = 20;
        int tinggi = 15;
        int sisi1 = alas;
        int sisi2 = 20;
        int sisi3 = 30;
        int luas = 1 / 2 * (alas * tinggi);
        int keliling = sisi1 + sisi2 + sisi3;
        System.out.println("======= Segitiga =======");
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
        System.out.println("=======================");
        System.out.println("\t");
    }

    static void lingkaran() {
        int r = 20;
        double phi = 3.14;
        double luas = phi * (r * r);
        double keliling = 2 * phi * r;
        System.out.println("======= Lingkaran =======");
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
        System.out.println("=======================");
        System.out.println("\t");
    }

    static void kubus() {
        int s = 20;
        double luas = 6 * (s * s);
        double volume = s * s * s;
        System.out.println("======= Kubus =======");
        System.out.println("Luas : " + luas);
        System.out.println("Volume : " + volume);
        System.out.println("=======================");
        System.out.println("\t");
    }

}
