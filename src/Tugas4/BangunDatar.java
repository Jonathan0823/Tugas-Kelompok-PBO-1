package Tugas4;

public class BangunDatar {

    public int LuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public int KelilingPersegiPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public double LuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double KelilingSegitiga(double alas) {
        return 3 * alas;
    }

    public double LuasLingkaran(double jariJari) {
        return 3.14 * jariJari * jariJari;
    }

    public double KelilingLingkaran(double jariJari) {
        return 2 * 3.14 * jariJari;
    }

    public int LuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public int KelilingPersegi(int sisi) {
        return 4 * sisi;
    }
}
