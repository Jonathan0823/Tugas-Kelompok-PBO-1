package Tugas4;

// Inheritance BangunDatar
public class BangunRuang extends BangunDatar{

    // Methon Menghitung Volume Balok
    public int VolumeBalok(int panjang, int lebar, int tinggi){
        return LuasPersegiPanjang(panjang, lebar) * tinggi;
    }

    // Method Menghitung Luas Permukaan Balok
    public int LuasPermukaanBalok(int panjang, int lebar, int tinggi){
        return 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
    }

    // Method Menghitung Volume Prisma
    public double VolumePrisma(double alas, double tinggiSegitiga, double tinggi){
        return LuasSegitiga(alas, tinggiSegitiga) * tinggi;
    }

    // Method Menghitung Luas Permukaan Prisma
    public double LuasPermukaanPrisma(double alas, double tinggiSegitiga, double tinggi){
        return (2 * LuasSegitiga(alas, tinggiSegitiga)) + KelilingSegitiga(alas) * tinggi;
    }
    

    // Method Menghitung Volume Tabung
    public double VolumeTabung(double jariJari, double tinggi){
        return 3.14 * jariJari * jariJari * tinggi;
    }

    // Method Menghitung Luas Permukaan Tabung
    public double LuasPermukaanTabung(double jariJari, double tinggi){
        return 2 * 3.14 * jariJari * (jariJari + tinggi);
    }


    // Method Menghitung Volume Kubus
    public int VolumeKubus(int sisi){
        return sisi * sisi * sisi;
    }

    // Method Menghitung Luas Permukaan Kubus
    public int LuasPermukaanKubus(int sisi){
        return 6 * LuasPersegi(sisi);
    }
}
