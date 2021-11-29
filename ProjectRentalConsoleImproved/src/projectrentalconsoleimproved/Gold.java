/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsoleimproved;

/**
 *
 * @author lanja
 */
public class Gold extends Membership{
    private int diskon = 2;
    private int poin;
    private int cashback = 5000;
    
    public Gold(DataMember membership){
        super.membership = membership;
        super.sewa = 30000;
        super.inputPinjaman();
    }
    
    public void hitungBiaya(){
        this.poin = banyakHari * 5;
        this.sewa = this.sewa * this.banyakHari;
        this.diskon = (this.sewa * this.diskon)/100;
        this.sewa = this.sewa - this.diskon;
    }
    
    public void output(){
        super.output();
        System.out.println("Total Sewa          : Rp. " + this.sewa);
        System.out.println("Jumlah Poin         : " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
    }
}
