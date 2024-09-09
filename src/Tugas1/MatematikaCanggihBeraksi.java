package Tugas1;

public class MatematikaCanggihBeraksi {
        public static void main(String[] args) {
        MatematikaCanggih matematika = new MatematikaCanggih("123456", "Budi Siregar");

        matematika.tampilkanData();

        System.out.println("Pertambahan (12.5 + 28.7 + 14.2): " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (23 + 34.5): " + matematika.pertambahan(23, 34.5));
        System.out.println("Pertambahan (12.6 + 28, 14): " + matematika.pertambahan(12.6, 28, 14));
        System.out.println("Pertambahan (3.4 + 9): " + matematika.pertambahan(3.4, 9));

        System.out.println("Pengurangan (28.7 - 12.5 - 14.2): " + matematika.pengurangan(28.7, 12.5, 14.2));
        
        System.out.println("Perkalian (12.5 * 28.7): " + matematika.perkalian(12.5, 28.7));
        System.out.println("Pembagian (28.7 / 12.5): " + matematika.pembagian(28.7, 12.5));
        System.out.println("Modulus (28.7 % 12.5): " + matematika.modulus(28.7, 12.5));
    }
}
