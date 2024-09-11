package tugas1;
  
public class MatematikaCanggih {
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public int kurang(int a, int b) {
        return a - b;
    }
    
    public int kali(int a, int b) {
        return a * b;
    }
    
    public int bagi(int a, int b) {
        if(b != 0) {
            return a / b;
        }else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
            return 0;
        }
    }
    
    public int modulus(int a, int b) {
        return a % b;
    }
}
