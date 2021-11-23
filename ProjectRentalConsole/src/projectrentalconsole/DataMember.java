package projectrentalconsole;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanja
 */
public class DataMember {
    String IDmember;
    String namaMember;
    String jenisMember;
    
    public DataMember(String ID, String nama, String jenis){
        this.IDmember = ID;
        this.namaMember = nama;
        this.jenisMember = jenis;
        
    }
    
    void print(){
        System.out.println("ID Member           : " + this.IDmember);
        System.out.println("Nama Member         : " + this.namaMember);
        System.out.println("Jenis Member        : " + this.jenisMember);
        System.out.println("");
    }
}
