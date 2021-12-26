/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subclass;
import java.util.Calendar;
/**
 *
 * @author lanja
 */
public class Karyawan{
    String kodeKaryawan;
    String namaKaryawan;
    String alamatKaryawan;
    String tglLahir;
    String golonganKaryawan;
    int statusKaryawan = 0;
    int jumlahAnak = 0;
    int usia;
    int gajiPokok = 5000000;
    int tunjanganPasangan = 0;
    int tunjanganPegawai= 0;
    int tunjanganAnak = 0;
    int gajiKotor = 0;
    int potongan = 0;
    int gajiBersih = 0;
    boolean statusTunjangan = false;
    boolean statusPegawai = false;
    boolean statusAnak = false;
    
    public Karyawan(String kode, String nama, String alamat,String tanggalLahir, String golongan, int status, int jumlahAnak){
        this.kodeKaryawan = kode;   
        this.namaKaryawan = nama;
        this.alamatKaryawan = alamat;
        this.tglLahir = tanggalLahir;
        this.golonganKaryawan = golongan;
        this.statusKaryawan = status;
        this.jumlahAnak = jumlahAnak;
        
        Calendar kalender = Calendar.getInstance();
        int tahun = kalender.get(Calendar.YEAR);
        
        String[] arrString = this.tglLahir.split("-");
        int lahir = Integer.parseInt(arrString[0]);
        
        int umur = tahun - lahir;
        this.usia = umur;
        
        
        switch(this.golonganKaryawan){
            case "A":
                this.gajiPokok = 5000000;
                break;
            case "B":
                this.gajiPokok = 6000000;
                break;
            case "C":
                this.gajiPokok = 7000000;
                break;
        }
        
        switch(this.statusKaryawan){
            case 1:
                this.tunjanganPasangan = 10 * this.gajiPokok/100;
                this.statusTunjangan = true;
                break;
        }
        
        if(this.usia>30){
            this.tunjanganPegawai = 15*this.gajiPokok/100;
            this.statusPegawai = true;
        }
        
        switch(this.statusKaryawan){
            case 1:
                if(this.jumlahAnak>0){
                    this.tunjanganAnak = this.jumlahAnak*5*this.gajiPokok/100;
                    this.statusAnak = true;
                }
                break;
        }
        
        this.gajiKotor = this.gajiPokok + this.tunjanganPasangan + this.tunjanganPegawai + this.tunjanganAnak;
        this.potongan = 25*this.gajiKotor/1000;
        this.gajiBersih = this.gajiKotor - this.potongan;
    }
    
    
    public void cetak(){
        System.out.println("============================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("--------------------------------------------");
        System.out.println("Kode Karyawan           : " + this.kodeKaryawan);
        System.out.println("Nama Karyawan           : " + this.namaKaryawan);
        System.out.println("Golongan                : " + this.golonganKaryawan);
        System.out.println("Usia                    : " + this.usia);
        
        switch(this.statusKaryawan){
            case 0:
                System.out.println("Status Menikah          : Belum Menikah");
                System.out.println("--------------------------------------------");
                break;
            case 1:
                System.out.println("Status Menikah          : Sudah Menikah");
                System.out.println("Jumlah Anak             : " + this.jumlahAnak);
                System.out.println("--------------------------------------------");
        }
       
        System.out.println("Gaji Pokok              : Rp " + this.gajiPokok);
        if(this.statusTunjangan){
            System.out.println("Tunjangan Istri/Suami   : Rp " + this.tunjanganPasangan);
        }
        if(this.statusPegawai){
            System.out.println("Tunjangan Pegawai       : Rp " + this.tunjanganPegawai);
        }
        if(this.statusAnak){
            System.out.println("Tunjangan Anak          : Rp " + this.tunjanganAnak);
        }
        System.out.println("-------------------------------------------- + ");
        System.out.println("Gaji Kotor              : Rp " + this.gajiKotor);
        System.out.println("Potongan                : Rp " + this.potongan);
        System.out.println("-------------------------------------------- - ");
        System.out.println("Gaji Bersih             : Rp " + this.gajiBersih);
        
    }
    
}
