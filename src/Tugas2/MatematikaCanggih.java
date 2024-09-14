package tugas2;

public class MatematikaCanggih extends Matematika {
    String NIM;
    String Nama;
    
    public MatematikaCanggih(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }
    
    
    public double modulus(double a, double b) {
        return a % b;
    }        
    
    public void tampilkanData() {
        System.out.println("NIM     : " +NIM);
        System.out.println("Nama    : " +Nama);
   
    }
}
