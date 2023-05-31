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
public class setorModel {
    int saldo=2000000;
    int setor=500000;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }
    
    public int saldoTambah(int setor){
        saldo=saldo+setor;
        return saldo;
    }
}
