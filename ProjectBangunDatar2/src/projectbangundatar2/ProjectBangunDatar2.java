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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lingkaran
        Lingkaran L = new Lingkaran();
        System.out.println("Lingkaran");
        System.out.println("Luas Lingkaran 1 : " + L.hitungLuas(5));
        System.out.println("Luas Lingkaran 2 : " + L.hitungLuas(7.4));
        System.out.println("Keliling Lingkaran 1 : " + L.hitungKeliling(5));
        System.out.println("Keliling Lingkaran 2 : " + L.hitungKeliling(7.4));
        
        
        //persegi
        Persegi P = new Persegi();
        System.out.println("");
        System.out.println("Persegi");
        System.out.println("Luas Persegi 1 : " + P.hitungLuas(4.5));
        System.out.println("Luas Persegi 2 : " + P.hitungLuas(7));
        System.out.println("Keliling Persegi 1 : " + P.hitungKeliling(4.5));
        System.out.println("Keliling Persegi 2 : " + P.hitungKeliling(7));
        
        //persegi panjang
        PersegiPanjang pp= new PersegiPanjang();
        System.out.println("");
        System.out.println("Persegi Panjang");
        System.out.println("Luas Persegi Panjang 1 : " + pp.hitungLuas(10, 5));
        System.out.println("Luas Persegi Panjang 2 : " + pp.hitungLuas(3.6, 8));
        System.out.println("Luas Persegi Panjang 3 : " + pp.hitungLuas(6, 8.3));
        System.out.println("Luas Persegi Panjang 4 : " + pp.hitungLuas(5.6, 8.8));
        System.out.println("Keliling Persegi Panjang 1 : " + pp.hitungKeliling(10, 5));
        System.out.println("Keliling Persegi Panjang 2 : " + pp.hitungKeliling(3.6, 8));
        System.out.println("Keliling Persegi Panjang 3 : " + pp.hitungKeliling(6, 8.3));
        System.out.println("Keliling Persegi Panjang 4 : " + pp.hitungKeliling(5.6, 8.8));
        
        //segitiga
        Segitiga s3 = new Segitiga();
        System.out.println("");
        System.out.println("egitiga");
        System.out.println("Luas Segitiga 1 : " + s3.hitungLuas(8, 10));
        System.out.println("Luas Segitiga 2 : " + s3.hitungLuas(8, 11.5));
        System.out.println("Luas Segitiga 3 : " + s3.hitungLuas(12.2, 9));
        System.out.println("Luas Segitiga 4 : " + s3.hitungLuas(13.9, 20.7));
        System.out.println("Keliling Segitiga 1 : " + s3.hitungKeliling(8, 10));
        System.out.println("Keliling Segitiga 2 : " + s3.hitungKeliling(8, 11.5));
        System.out.println("Keliling Segitiga 3 : " + s3.hitungKeliling(12.2, 9));
        System.out.println("Keliling Segitiga 4 : " + s3.hitungKeliling(13.9, 20.7));
    }
    
}
