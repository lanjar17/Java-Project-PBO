/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author lanja
 */
public class MPV extends BahanBakar{
    public double jarak;
    public int kecepatan;
    
    public double hitungBahanBakar(){
        double BB = this.jarak/14;
        return BB;
    }
    
    public double hitungWaktu(){
        double waktu = this.jarak/this.kecepatan;
        return waktu;
    }
}
