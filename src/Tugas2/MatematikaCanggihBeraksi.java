package Tugas2;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        
        System.out.println("Hasil pertambahan yaitu " +mtk.tambah(10, 5));
        System.out.println("Hasil pengurangan yaitu " +mtk.kurang(10, 5));
        System.out.println("Hasil perkalian yaitu " +mtk.kali(10, 5));
        System.out.println("Hasil pembagian yaitu " +mtk.bagi(10, 5));
        System.out.println("Hasil modulus yaitu " +mtk.modulus(10, 5));
    }
    
}
