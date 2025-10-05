package AbstakClass;

abstract class Hewan {
    abstract void suara();  // method abstrak (belum punya isi)

    void tidur() {          // method normal (punya isi)
        System.out.println("Hewan sedang tidur");
    }
}
