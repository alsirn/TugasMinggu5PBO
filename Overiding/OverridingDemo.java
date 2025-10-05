package Overiding;

public class OverridingDemo {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Kucing k = new Kucing();

        h.suara(); // memanggil method dari class Hewan
        k.suara(); // memanggil method dari class Kucing (override)
    }
}
