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
public class Account {
    String AccountName;
    int Account;
    int Balance;
    
    public int getBalance(){
        return Balance;
    }
    
    public int getAccount(){
        return Account;
    }
    
    public String getAccountName(){
        return AccountName;
    }
    
    public void setBalance(int Balance){
        this.Balance=Balance;
    }
    
    public void setAccount(int Account){
        this.Account=Account;
    }
    
    public void setAccountName(String AccountName){
        this.AccountName=AccountName;
    }
    
    void print(){
        System.out.println("Nama Nasabah : "+AccountName
                +"\nNo Rekening : "+Account+"\nSaldo : "+Balance);                            
    }
    
    public void setDeposit(int deposit){
        Balance=Balance+deposit;
    }
    
    void setTarik(int i){
        Balance=Balance-i;
    }
}