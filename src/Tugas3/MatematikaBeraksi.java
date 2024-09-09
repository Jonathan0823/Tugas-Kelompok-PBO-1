package Tugas3;

public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih("Chairul", "23100");
        System.out.println("Pertambahan" + mtk.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan" + mtk.pertambahan(23, 34.5));
        System.out.println("Pertambahan" + mtk.pertambahan(12.6, 28, 14));
        System.out.println("Pertambahan" + mtk.pertambahan(3.4, 9));
        
        
    }
    
}