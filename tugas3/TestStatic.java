public class TestStatic {
    int a = 10;
    static int b = 20;
    protected int c = 30;
    public int d = 40;
    private int e = 50;

    void satu() {
        dua();
        System.out.println("Satu ...................");
        System.out.println("Satu ................... a : " + a);
        System.out.println("Satu ................... b : " + b);
        System.out.println("Satu ................... c : " + c);
        System.out.println("Satu ................... d : " + d);
        System.out.println("Satu ................... e : " + e);
    }

    void dua() {
        System.out.println("Dua .................... " + b);
    }

    public static void main(String[] a) {
        dua();
    }
}
