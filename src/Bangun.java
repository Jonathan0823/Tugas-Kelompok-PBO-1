// Mengakses Package
import Tugas4.BangunRuang;
import java.util.Scanner;

public class Bangun {
    public static void main(String[] args) throws Exception {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Membuat Object
        BangunRuang bangun = new BangunRuang();

        // Selector untuk menu
        int selector;
        // untuk loop
        int loop = 1;

        do {
            // Menu
            System.out.println("\n\nProgram Menghitung Bangun Datar dan Bangun Ruang");
            System.out.println("==================================================");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            selector = input.nextInt();
            switch (selector) {
                // Bangun Datar
                case 1:
                    do {
                        // Sub Menu Bangun Datar
                        System.out.println("\n\nBangun Datar");
                        System.out.println("=============");
                        System.out.println("1. Persegi");
                        System.out.println("2. Persegi Panjang");
                        System.out.println("3. Lingkaran");
                        System.out.println("4. Segitiga");
                        System.out.println("9. Back");
                        System.out.println("0. Exit");
                        System.out.print("Pilih : ");
                        selector = input.nextInt();
                        switch (selector) {
                            // Persegi
                            case 1:
                                do {
                                    System.out.print("\nMasukkan sisi : ");
                                    int sisi = input.nextInt();
                                    System.out.println("\nLuas Persegi : " + bangun.LuasPersegi(sisi));
                                    System.out.println("Keliling Persegi : " + bangun.KelilingPersegi(sisi));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Persegi Panjang
                                case 2:
                                do {
                                    System.out.print("\nMasukkan panjang : ");
                                    int panjang = input.nextInt();
                                    System.out.print("Masukkan lebar : ");
                                    int lebar = input.nextInt();
                                    System.out.println("\nLuas Persegi Panjang : " + bangun.LuasPersegiPanjang(panjang, lebar));
                                    System.out.println("Keliling Persegi Panjang : " + bangun.KelilingPersegiPanjang(panjang, lebar));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Lingkaran
                            case 3:
                                do {
                                    System.out.print("\nMasukkan jari-jari : ");
                                    double jariJari = input.nextDouble();
                                    System.out.println("\nLuas Lingkaran : " + bangun.LuasLingkaran(jariJari));
                                    System.out.println("Keliling Lingkaran : " + bangun.KelilingLingkaran(jariJari));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Segitiga
                            case 4:
                                do {
                                    System.out.print("\nMasukkan alas : ");
                                    double alas = input.nextDouble();
                                    System.out.print("Masukkan tinggi : ");
                                    double tinggi = input.nextDouble();
                                    System.out.println("\nLuas Segitiga : " + bangun.LuasSegitiga(alas, tinggi));
                                    System.out.println("Keliling Segitiga : " + bangun.KelilingSegitiga(alas));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;
                            case 9:
                                loop = 0;
                                break;
                            default:
                                System.out.println("Exiting...");
                                System.exit(0);
                                break;
                        }
                    } while (loop == 1);
                    loop = 1; 
                    break;
                // Bangun Ruang
                case 2:
                    do {
                        // Sub Menu Bangun Ruang
                        System.out.println("\n\nBangun Ruang");
                        System.out.println("=============");
                        System.out.println("1. Kubus");
                        System.out.println("2. Balok");
                        System.out.println("3. Prisma");
                        System.out.println("4. Tabung");
                        System.out.println("9. Back");
                        System.out.println("0. Exit");
                        System.out.print("Pilih : ");
                        selector = input.nextInt();
                        switch (selector) {
                            // Kubus
                            case 1:
                                do {
                                    System.out.print("\nMasukkan sisi : ");
                                    int sisi = input.nextInt();
                                    System.out.println("Volume Kubus : " + bangun.VolumeKubus(sisi));
                                    System.out.println("Luas Permukaan Kubus : " + bangun.LuasPermukaanKubus(sisi));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Balok
                            case 2:
                                do {
                                    System.out.print("\nMasukkan panjang : ");
                                    int panjang = input.nextInt();
                                    System.out.print("Masukkan lebar : ");
                                    int lebar = input.nextInt();
                                    System.out.print("Masukkan tinggi : ");
                                    int tinggi = input.nextInt();
                                    System.out.println("Volume Balok : " + bangun.VolumeBalok(panjang, lebar, tinggi));
                                    System.out.println("Luas Permukaan Balok : " + bangun.LuasPermukaanBalok(panjang, lebar, tinggi));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Prisma
                            case 3:
                                do {
                                    System.out.print("\nMasukkan alas : ");
                                    double alas = input.nextDouble();
                                    System.out.print("Masukkan tinggi segitiga : ");
                                    double tinggiSegitiga = input.nextDouble();
                                    System.out.print("Masukkan tinggi prisma : ");
                                    double tinggi = input.nextDouble();
                                    System.out.println("Volume Prisma : " + bangun.VolumePrisma(alas, tinggiSegitiga, tinggi));
                                    System.out.println("Luas Permukaan Prisma : " + bangun.LuasPermukaanPrisma(alas, tinggiSegitiga, tinggi));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;

                            // Tabung
                            case 4:
                                do {
                                    System.out.print("\nMasukkan jari-jari : ");
                                    double jariJari = input.nextDouble();
                                    System.out.print("Masukkan tinggi : ");
                                    double tinggi = input.nextDouble();
                                    System.out.println("Volume Tabung : " + bangun.VolumeTabung(jariJari, tinggi));
                                    System.out.println("Luas Permukaan Tabung : " + bangun.LuasPermukaanTabung(jariJari, tinggi));
                                    System.out.println("\n1. Lagi");
                                    System.out.println("9. Back");
                                    System.out.print("Pilih : ");
                                    loop = input.nextInt();
                                } while (loop == 1);
                                loop = 1;
                                break;
                            case 9:
                                loop = 0;
                                break;
                            default:
                                System.out.println("Exiting...");
                                // end program
                                System.exit(0);
                                break;
                        }
                    } while (loop == 1);
                    loop = 1;
                    break;
                // Exit
                default:
                    System.out.println("\nTerima Kasih :)\n");
                    loop = 0;
                    break;
            }
        } while (loop == 1);

        input.close();
    }
}
