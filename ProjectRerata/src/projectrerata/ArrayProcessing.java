/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;
import java.util.Scanner;
/**
 *
 * @author lanja
 */
public class ArrayProcessing {
    
    //array of integer --> data
    int[] dataBil = new int[100];
    
    //jumlah data 
    int n;
    int maksimum;
    int minimum;
    int urutan;
    
    //input
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    //nilai Maximum
    int max(){
        maksimum = this.dataBil[0];
        for(int i=0; i<n; i++){
            if(this.dataBil[i] > maksimum){
                maksimum = this.dataBil[i];
            }
        }
        return maksimum;
        
    }
    //nilai minimum
    int min(){
        minimum = this.dataBil[0];
        for(int i=0; i<n; i++){
            if(this.dataBil[i] < minimum){
                minimum = this.dataBil[i];
            }
        }
        return minimum;
        
    }
    
    //urutan ascending
    
    int urutkan(){
        urutan = this.dataBil[0];
        for(int i=0; i<(this.n -1); i++){
            for(int j=0; j<(this.n-i-1); j++){
                if(this.dataBil[j] > this.dataBil[j+1]){
                    urutan = this.dataBil[j];
                    this.dataBil[j] = this.dataBil[j+1];
                    this.dataBil[j+1] = urutan;
                    
                }
            }
        }
        System.out.println("Urutan Bilangan: ");
        for(int i=0; i<this.n; i++){
            System.out.print(this.dataBil[i] + " ");
        }
        return urutan;
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    void output(){
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: " + this.max());
        System.out.println("Nilai Minimum: " + this.min());
    }
}
