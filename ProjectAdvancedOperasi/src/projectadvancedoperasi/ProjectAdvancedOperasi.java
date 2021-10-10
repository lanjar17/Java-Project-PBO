/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Lanjar Dwi
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi o = new Operasi();
        
        //a
        int A = o.jumlahkan(3, 4);
        System.out.println("3 + 4 = " + A);
        
        //b
        int B = o.jumlahkan(4, 7, -9);
        System.out.println("4 + 7 + (-9) = " + B);
        
        //c
        double C = o.jumlahkan(3.4, -0.0002, 0.12313);
        System.out.println("3.4 + (-0.0002) + 0.12313 = " + C);
        
        
        // PERKALIAN
        
        int kaliA = o.perkalian(7, 3);
        System.out.println("7 x 3 = " + kaliA);
        
        double kaliB = o.perkalian(2.5, 7.23, 1.25);
        System.out.println("2.5 x 7.23 x 1.25 = " + kaliB);
    }
    
}
