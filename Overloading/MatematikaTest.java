package Overloading;

public class MatematikaTest {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("Hasil 1: " + m.tambah(5, 10));          // int + int
        System.out.println("Hasil 2: " + m.tambah(2.5, 3.5));       // double + double
        System.out.println("Hasil 3: " + m.tambah(1, 2, 3));        // 3 parameter
    }
}