/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author lanja
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran l1 = new Lingkaran();
        l1.setJariJari(10);
        l1.hitungLuas();
        System.out.println("Luas lingkaran berjari-jari " + l1.getJariJari() + " adalah " + l1.getLuas());
    }
    
}
