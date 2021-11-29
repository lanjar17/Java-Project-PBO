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
public class Silver extends Membership{
    private int diskon = 1;
    private int poin;
    
    public Silver(DataMember membership){
        super.membership = membership;
        super.sewa = 25000;
        super.inputPinjaman();
    }
    
    public void hitungBiaya(){
        this.poin = banyakHari * 1;
        this.sewa = this.sewa * this.banyakHari;
        this.diskon = (this.sewa * this.diskon)/100;
        this.sewa = this.sewa - this.diskon;
    }
    
    public void output(){
        super.output();
        System.out.println("Total Sewa          : Rp. " + this.sewa);
        System.out.println("Jumlah Poin         : " + this.poin);
    }
}
