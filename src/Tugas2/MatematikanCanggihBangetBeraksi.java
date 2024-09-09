package Tugas2;

public class MatematikanCanggihBangetBeraksi {
    public static void main(String[] args) {
        // TODO code application logic here
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();
        
        System.out.println("Hasil pertambahan yaitu " +mtk.tambah(20, 10));
        System.out.println("Hasil perkalian yaitu " +mtk.kali(20, 10));
        System.out.println("Hasil modulus yaitu " +mtk.modulus(20, 10));
        System.out.println("Hasil pertambahan tiga yaitu " +mtk.pertambahanTiga(20, 10, 15));
        
    }
}
