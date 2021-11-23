/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;
/**
 *
 * @author lanja
 */
public class ProjectRentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Membership member = new Membership();
        member.addMember(new DataMember("M001", "Mr. X", "Silver"));
        member.addMember(new DataMember("M002", "Mr. Y", "Gold"));
        member.addMember(new DataMember("M003", "Mr. Z", "Platinum"));
        
        DataMember data = member.input();
        switch(data.jenisMember){
            case "Silver" :
                Silver perak = new Silver(data);
                perak.hitungBiaya();
                perak.output();
                break;
            case "Gold" :
                Gold emas = new Gold(data);
                emas.hitungBiaya();
                emas.output();
                break;
            case "Platinum" :
                Platinum premium = new Platinum(data);
                premium.hitungBiaya();
                premium.output();
                break;
        }
        
        
    }
    
}
