/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Lanjar Dwi
 */
public class OperasiBilangan {
    // atribut
    public int bilPertama;
    public int bilKedua;
    
    //methods
    public void hitungPenjumlahan() {
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil Perkaliannya: " + hasil);
    }
    
    public void hitungPembagian(){
        double hasil = (double)bilPertama / (double)bilKedua;
        System.out.println("Hasil Pembagiannya: " + hasil);
    }
}
