package tugas3;

public class MatematikaCanggih extends Matematika {
    String nama;
    String nim;
    
    //constructor
    public MatematikaCanggih(String nama,String nim){
    this.nama = nama;
    this.nim = nim;
    }

    //method perkalian
    public double perkalian (double a, double b){
       return a * b; 
    }

    //method pembagian
    public double pembagian (double a, double b){
       return a / b;
    }

    //method modulus
    public double modulus (double a, double b){
       return a % b;
    }
}
