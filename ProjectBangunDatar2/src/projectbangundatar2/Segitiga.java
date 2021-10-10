/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lanjar Dwi
 */
public class Segitiga {
    //luas
    int hitungLuas(int a, int t){
        return((a*t)/2);
    }
    
    double hitungLuas(double a, double t){
        return((a*t)/2);
    }
    
    //keliling
    double hitungKeliling(int a, int t){
        double sisiMiring = Math.sqrt(Math.pow((a/2), 2) + Math.pow(t, 2) );
        return(a+(2 * sisiMiring));
    }
    
    double hitungKeliling(double a, double t){
        double sisiMiring = Math.sqrt(Math.pow((a/2), 2) + Math.pow(t, 2) );
        return(a+(2 * sisiMiring));
    }
}
