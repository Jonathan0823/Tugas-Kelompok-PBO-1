package tugas2;

public class MatematikaCanggihBeraksi {
        public static void main(String[] args) {
        MatematikaCanggih matematika = new MatematikaCanggih("123456", "Budi Siregar");

        matematika.tampilkanData();

        System.out.format("Pertambahan  (12.5 + 28.7 + 14.2): %.2f\n", matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.format("Pertambahan  (23 + 34.5): %.2f\n" ,matematika.pertambahan(23, 34.5));
        System.out.format("Pertambahan  (12.6 + 28, 14): %.2f\n", matematika.pertambahan(12.6, 28, 14));
        System.out.format("Pertambahan  (3.4 + 9): %.2f\n", matematika.pertambahan(3.4, 9));

        System.out.format("Pengurangan  (28.7 - 12.5 - 14.2): %.2f\n", matematika.pengurangan(28.7, 12.5, 14.2));
        
        System.out.format("Perkalian    (12.5 * 28.7): %.2f\n", matematika.perkalian(12.5, 28.7));
        System.out.format("Pembagian    (28.7 / 12.5): %.2f\n", matematika.pembagian(28.7, 12.5));
        System.out.println("Modulus      (28.7 % 12.5): " + matematika.modulus(28.7, 12.5));
    }
}
