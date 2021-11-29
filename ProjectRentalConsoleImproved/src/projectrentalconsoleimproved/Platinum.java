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
public class Platinum extends Membership{
    private int diskon = 3;
    private int poin;
    private int cashback = 10000;
    private int pulsa = 5000;
    
    public Platinum(DataMember membership){
        super.membership = membership;
        super.sewa = 45000;
        super.inputPinjaman();
    }
    
    public void hitungBiaya(){
        this.poin = banyakHari * 10;
        this.sewa = this.sewa * this.banyakHari;
        this.diskon = (this.sewa * this.diskon)/100;
        this.sewa = this.sewa - this.diskon;
    }
    
    public void output(){
        super.output();
        System.out.println("Total Sewa          : Rp. " + this.sewa);
        System.out.println("Jumlah Poin         : " + this.poin);
        System.out.println("Jumlah Cashback     : Rp. " + this.cashback);
        System.out.println("Bonus Pulsa         : Rp. " + this.pulsa);
    }
}
