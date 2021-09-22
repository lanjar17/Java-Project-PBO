/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lanjar Dwi
 */
public class Bola {
    public int r;
    
    public void hitungVol(){
        double hasil = Math.round((4* Math.PI * r * r * r)/3);
        System.out.println("Volume Bola: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = Math.round(4 * Math.PI * r * r);
        System.out.println("Luas Selimut Bola: " + hasil);
    }
}
