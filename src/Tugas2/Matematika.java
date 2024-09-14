package tugas2;

public class Matematika {
    public double pertambahan(double a, double b) {
        return a + b;
    } 
    
    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }
    
    public double pengurangan(double a, double b) {
        return a - b;
    }
    
    public double pengurangan(double a, double b, double c) {
        return a - b - c;
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
}
