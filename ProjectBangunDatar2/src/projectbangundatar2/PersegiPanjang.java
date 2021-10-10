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
public class PersegiPanjang {
    //luas
    int hitungLuas(int panjang, int lebar){
        return(panjang * lebar);
    }
    double hitungLuas(double panjang, double lebar){
        return(panjang * lebar);
    }
    
    //keliling
    int hitungKeliling(int panjang, int lebar){
        return (2 * (panjang + lebar));
    }
    double hitungKeliling(double panjang, double lebar){
        return (2 * (panjang + lebar));
    }
}
