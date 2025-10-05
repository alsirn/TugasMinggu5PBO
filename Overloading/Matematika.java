package Overloading;

class Matematika {
    // Method 1
    int tambah(int a, int b) {
        return a + b;
    }

    // Method 2 (Overloading) - parameter berbeda
    double tambah(double a, double b) {
        return a + b;
    }

    // Method 3 (Overloading) - 3 parameter
    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}
