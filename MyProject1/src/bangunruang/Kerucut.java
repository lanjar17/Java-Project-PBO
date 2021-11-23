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
public class Kerucut {
    public int r;
    public int tinggi;
    public int s;
    
    public void hitungVol(){
        double hasil = Math.round((Math.PI * r * r * tinggi)/3);
        System.out.println("Volume Kerucut: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = Math.round(Math.PI * r * s);
        System.out.println("Luas Selimut Kerucut: " + hasil);
    }
}
