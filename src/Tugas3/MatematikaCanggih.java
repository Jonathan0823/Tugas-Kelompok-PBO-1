package Tugas3;

public class MatematikaCanggih extends Matematika {
    String nama;
    String nim;
    
    public MatematikaCanggih(String nama,String nim){
    this.nama = nama;
    this.nim = nim;
    }
    public double perkalian (double a, double b){
       return a * b; 
    }
    public double pembagian (double a, double b){
       return a / b;
    }
    public double modulus (double a, double b){
       return a % b;
    }
}
