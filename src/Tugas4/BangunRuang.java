package Tugas4;

public class BangunRuang extends BangunDatar{

    public int VolumeBalok(int panjang, int lebar, int tinggi){
        return LuasPersegiPanjang(panjang, lebar) * tinggi;
    }

    public int LuasPermukaanBalok(int panjang, int lebar, int tinggi){
        return 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
    }

    public double VolumePrisma(double alas, double tinggiSegitiga, double tinggi){
        return LuasSegitiga(alas, tinggiSegitiga) * tinggi;
    }

    public double LuasPermukaanPrisma(double alas, double tinggiSegitiga, double tinggi){
        return (2 * LuasSegitiga(alas, tinggiSegitiga)) + KelilingSegitiga(alas) * tinggi;
    }
    
    public double VolumeTabung(double jariJari, double tinggi){
        return 3.14 * jariJari * jariJari * tinggi;
    }

    public double LuasPermukaanTabung(double jariJari, double tinggi){
        return 2 * 3.14 * jariJari * (jariJari + tinggi);
    }

    public int VolumeKubus(int sisi){
        return sisi * sisi * sisi;
    }

    public int LuasPermukaanKubus(int sisi){
        return 6 * LuasPersegi(sisi);
    }
}
