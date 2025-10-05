package Overiding;

class Kucing extends Hewan {
    // Overriding: method suara() diubah perilakunya
    @Override
    void suara() {
        System.out.println("Meong... Meong...");
    }
}
