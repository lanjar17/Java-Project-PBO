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
public class Lingkaran {
    // luas
    double hitungLuas(int r){
        return(Math.PI * r * r);
    }
    
    double hitungLuas(double r){
        return (Math.PI * r * r);
    }
    
    //keliling
    double hitungKeliling(int r){
        return (2 * Math.PI * r);
    }
    double hitungKeliling(double r){
        return (2 * Math.PI * r);
    }
}
