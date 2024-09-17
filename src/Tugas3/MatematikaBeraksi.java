package tugas3;
import java.util.Scanner;

public class MatematikaBeraksi {

    public static void main(String[] args) {
        // variabel untuk loop
        int loop = 1;

        // variabel untuk pilihan/selector
        int pilih;

        // variabel untuk input jumlah bilangan yang ingin dihitung
        int bilangan;

        // Scanner
        Scanner input = new Scanner(System.in);

        // Input informasi data diri
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        if (!nim.matches("[0-9]+")) {
            System.out.println("NIM harus berupa angka");
            System.out.println("Silahkan ulangi program");
            System.exit(0);
        }

        // Membuat object
        MatematikaCanggih matematika = new MatematikaCanggih(nama,nim);

        // Loop untuk menu
        do {
            //Menu
            System.out.println("\nNama: " + matematika.nama);
            System.out.println("NIM: " + matematika.nim);
            System.out.println();
            System.out.println("Menu:");
            System.out.println("=====");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            switch (pilih) {
                //Pertambahan
                case 1:
                do{
                    System.out.println("\n\nPertambahan");
                    System.out.println("=============");
                    System.out.print("Masukkan jumlah bilangan yang ingin anda tambah: ");
                    bilangan = input.nextInt();
                    if (bilangan == 2) {
                        System.out.print("Masukkan bilangan Pertama: ");
                        double bilangan1 = input.nextDouble();
                        System.out.print("Masukkan bilangan Kedua: ");
                        double bilangan2 = input.nextDouble();
                        System.out.println("Hasil dari " + bilangan1 + " + " + bilangan2 + " = " + matematika.pertambahan(bilangan1, bilangan2));
                    } else if (bilangan == 3) {
                        System.out.print("Masukkan bilangan Pertama: ");
                        double bilangan1 = input.nextDouble();
                        System.out.print("Masukkan bilangan Kedua: ");
                        double bilangan2 = input.nextDouble();
                        System.out.print("Masukkan bilangan ketiga: ");
                        double bilangan3 = input.nextDouble();
                        System.out.println("Hasil dari " + bilangan1 + " + " + bilangan2 + " + " + bilangan3 + " = " + matematika.pertambahan(bilangan1, bilangan2, bilangan3));
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }

                    System.out.println("Apakah ingin mengulang? (1 = ya, 0 = tidak)");
                    loop = input.nextInt();
                } while (loop == 1); 
                loop = 1;
                break;

                //Pengurangan
                case 2:
                do{
                    System.out.println("\n\nPengurangan");
                    System.out.println("=============");
                    System.out.print("Masukkan jumlah bilangan yang ingin anda kurang: ");
                    bilangan = input.nextInt();
                    if (bilangan == 2) {
                        System.out.print("Masukkan bilangan Pertama: ");
                        double bilangan1 = input.nextDouble();
                        System.out.print("Masukkan bilangan Kedua: ");
                        double bilangan2 = input.nextDouble();
                        System.out.println("Hasil dari " + bilangan1 + " - " + bilangan2 + " = " + matematika.pengurangan(bilangan1, bilangan2));
                    } else if (bilangan == 3) {
                        System.out.print("Masukkan bilangan Pertama: ");
                        double bilangan1 = input.nextDouble();
                        System.out.print("Masukkan bilangan Kedua: ");
                        double bilangan2 = input.nextDouble();
                        System.out.print("Masukkan bilangan ketiga: ");
                        double bilangan3 = input.nextDouble();
                        System.out.println("Hasil dari " + bilangan1 + " - " + bilangan2 + " - " +  bilangan3 + " = " + matematika.pengurangan(bilangan1, bilangan2, bilangan3));
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }

                    System.out.println("Apakah ingin mengulang? (1 = ya, 0 = tidak)");
                    loop = input.nextInt();
                } while (loop == 1); 
                loop = 1;
                break;

                //Perkalian
                case 3:
                do{
                    System.out.println("\n\nPerkalian");
                    System.out.println("=============");
                    System.out.print("Masukkan bilangan Pertama: ");
                    double bilangan1 = input.nextDouble();
                    System.out.print("Masukkan bilangan Kedua: ");
                    double bilangan2 = input.nextDouble();
                    System.out.println("Hasil dari " + bilangan1 + " * " + bilangan2 + " = " + matematika.perkalian(bilangan1, bilangan2));

                    System.out.println("Apakah ingin mengulang? (1 = ya, 0 = tidak)");
                    loop = input.nextInt();
                } while (loop == 1); 
                loop = 1;
                break;

                //Pembagian
                case 4:
                do{
                    System.out.println("\n\nPembangian");
                    System.out.println("=============");
                    System.out.print("Masukkan bilangan Pertama: ");
                    double bilangan1 = input.nextDouble();
                    System.out.print("Masukkan bilangan Kedua: ");
                    double bilangan2 = input.nextDouble();
                    System.out.println("Hasil dari " + bilangan1 + " / " + bilangan2 + " = " + matematika.pembagian(bilangan1, bilangan2));

                    System.out.println("Apakah ingin mengulang? (1 = ya, 0 = tidak)");
                    loop = input.nextInt();
                } while (loop == 1); 
                loop = 1;
                break;

                //Modulus
                case 5:
                do{
                    System.out.println("\n\nModulus");
                    System.out.println("=============");
                    System.out.print("Masukkan bilangan Pertama: ");
                    double bilangan1 = input.nextDouble();
                    System.out.print("Masukkan bilangan Kedua: ");
                    double bilangan2 = input.nextDouble();
                    System.out.println("Hasil dari "+ bilangan1 + " % " + bilangan2 + " = " + matematika.modulus(bilangan1, bilangan2));

                    System.out.println("Apakah ingin mengulang? (1 = ya, 0 = tidak)");
                    loop = input.nextInt();
                } while (loop == 1); 
                loop = 1;
                break;
                case 0:
                loop = 0;
                break;
            }
        } while (loop == 1);
        
        input.close();
        System.out.println("\n\nTerima kasih");
    }
    
}