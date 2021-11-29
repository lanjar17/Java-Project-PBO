/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsoleimproved;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lanja
 */
public class Membership {
    protected DataMember membership;
    private LocalDate from;
    private LocalDate to;
    protected int banyakHari;
    protected int sewa;
    private ArrayList<DataMember> dataMember = new ArrayList<DataMember>(); 
    
    public void addMember(DataMember data){
        this.dataMember.add(data);
    }
    
    private void cariMember(String ID){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.dataMember.size(); i++){
            if (this.dataMember.get(i).getID().equals(ID)){
               index = i;
               ditemukan = true;
            }
        }
        if (ditemukan == true){
            this.membership = this.dataMember.get(index);
        } else {
           // jika tidak ditemukan
           System.out.println("Data Member tidak ditemukan");
        }
    }
    
    public DataMember input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member                : ");
        this.cariMember(input.nextLine());
        return this.membership;
    }
    
    protected void inputPinjaman(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)    : ");
        int tanggalPjm = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam	(1-12)    : ");
        int bulanPjm = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam             : ");
        int tahunPjm = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31)   : ");
        int tanggalKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)     : ");
        int bulanKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali            : ");
        int tahunKembali = input.nextInt();
        System.out.println();
        this.from = LocalDate.of(tahunPjm, bulanPjm, tanggalPjm);
        this.to = LocalDate.of(tahunKembali, bulanKembali, tanggalKembali);
        this.banyakHari = (int) ChronoUnit.DAYS.between(this.from, this.to);
    }
    
    public void output(){
        System.out.println("Tanggal Pinjam      : " + this.from);
        
        System.out.println("Tanggal Kembali     : " + this.to);
        
        System.out.println("Lama Sewa           : " + this.banyakHari + " hari");
        System.out.println();
    }
}
