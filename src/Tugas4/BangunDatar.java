package tugas4;

public class BangunDatar {

    // Method Menghitung Luas Persegi Panjang
    public int LuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Method Menghitung Keliling Persegi Panjang
    public int KelilingPersegiPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    // Method Menghitung Luas Segitiga
    public double LuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Method Menghitung Keliling Segitiga
    public double KelilingSegitiga(double alas) {
        return 3 * alas;
    }

    // Method Menghitung Luas Lingkaran
    public double LuasLingkaran(double jariJari) {
        return 3.14 * jariJari * jariJari;
    }

    // Method Menghitung Keliling Lingkaran
    public double KelilingLingkaran(double jariJari) {
        return 2 * 3.14 * jariJari;
    }

    // Method Menghitung Luas Persegi
    public int LuasPersegi(int sisi) {
        return sisi * sisi;
    }

    // Method Menghitung Keliling Persegi
    public int KelilingPersegi(int sisi) {
        return 4 * sisi;
    }
}
