/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre_260423;

/**
 *
 * @author user
 */
public class TestBank {
    public static void main(String args[]){
        Account a2=new Account();
        Account a3=new Account();
        
        a2.setAccountName("Andre");
        a2.setAccount(2101092029);
        a2.setBalance(100000);
        
        a3.setAccountName("Aji");
        a3.setAccount(2101092021);
        a3.setBalance(5000000);
        
        a2.print();
        System.out.println("");
        a3.print();
    }
}
