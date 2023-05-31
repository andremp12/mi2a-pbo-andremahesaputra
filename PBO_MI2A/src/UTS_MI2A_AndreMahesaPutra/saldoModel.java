/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_MI2A_AndreMahesaPutra;

/**
 *
 * @author user
 */
public class saldoModel {
    int saldo=2000000;
    int transfer;
    String rekening;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = Integer.parseInt(transfer);
    }

    public String getRekening() {
        return rekening;
    }

    public void setRekening(String rekening) {
        this.rekening = rekening;
    }
    
    public int saldoBaru(int a){
        saldo=saldo-a;
        return saldo;
    }
    
    public int prosesTransfer(){
        saldo=saldo-transfer;
        return saldo;
    }
}
