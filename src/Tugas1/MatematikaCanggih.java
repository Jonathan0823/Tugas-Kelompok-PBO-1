package Tugas1;

public class MatematikaCanggih extends Matematika {
    String NIM;
    String Nama;
    
    public MatematikaCanggih(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }
    
    public double perkalian(double a, double b) {
        return a * b;
    }
    
    public double pembagian(double a, double b) {
        if(b != 0) {
            return a / b;
        }else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
            return 0;
        }
    }
    public double modulus(double a, double b) {
        return a % b;
    }        
    
    public void tampilkanData() {
        System.out.println("NIM     : " +NIM);
        System.out.println("Nama    : " +Nama);
   
    }
}
