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
public class HalamanTarik extends javax.swing.JFrame {

    /**
     * Creates new form HalamanTarik
     */
    saldoModel saldo;
    public HalamanTarik() {
        initComponents();
        panelBerhasil.setVisible(false);
        saldo=new saldoModel();
        txtSaldo1.setText("Jumlah Saldo Rp."+saldo.getSaldo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBerhasil = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        txtTarik = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        panelUtama = new javax.swing.JPanel();
        btn200 = new javax.swing.JButton();
        btn400 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSaldo1 = new javax.swing.JLabel();
        btnKembali1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(null);

        panelBerhasil.setBackground(new java.awt.Color(0, 153, 255));
        panelBerhasil.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PENARIKAN BERHASIL");
        panelBerhasil.add(jLabel2);
        jLabel2.setBounds(220, 60, 630, 44);

        txtSaldo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSaldo.setText("Sisa Saldo : Rp");
        panelBerhasil.add(txtSaldo);
        txtSaldo.setBounds(40, 290, 940, 44);

        txtTarik.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtTarik.setForeground(new java.awt.Color(255, 255, 255));
        txtTarik.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTarik.setText("Jumlah Penarikan : Rp");
        panelBerhasil.add(txtTarik);
        txtTarik.setBounds(40, 170, 930, 44);

        btnKembali.setBackground(new java.awt.Color(0, 153, 255));
        btnKembali.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("KEMBALI KE HALAMAN UTAMA");
        btnKembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        panelBerhasil.add(btnKembali);
        btnKembali.setBounds(310, 400, 450, 100);

        getContentPane().add(panelBerhasil);
        panelBerhasil.setBounds(0, 0, 1030, 600);

        panelUtama.setBackground(new java.awt.Color(0, 153, 255));
        panelUtama.setLayout(null);

        btn200.setBackground(new java.awt.Color(0, 153, 255));
        btn200.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn200.setForeground(new java.awt.Color(255, 255, 255));
        btn200.setText("Rp200.000");
        btn200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });
        panelUtama.add(btn200);
        btn200.setBounds(100, 220, 250, 70);

        btn400.setBackground(new java.awt.Color(0, 153, 255));
        btn400.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn400.setForeground(new java.awt.Color(255, 255, 255));
        btn400.setText("Rp400.000");
        btn400.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn400ActionPerformed(evt);
            }
        });
        panelUtama.add(btn400);
        btn400.setBounds(670, 220, 250, 70);

        btn100.setBackground(new java.awt.Color(0, 153, 255));
        btn100.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn100.setForeground(new java.awt.Color(255, 255, 255));
        btn100.setText("Rp100.000");
        btn100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        panelUtama.add(btn100);
        btn100.setBounds(100, 100, 250, 70);

        btn300.setBackground(new java.awt.Color(0, 153, 255));
        btn300.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn300.setForeground(new java.awt.Color(255, 255, 255));
        btn300.setText("Rp300.000");
        btn300.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn300ActionPerformed(evt);
            }
        });
        panelUtama.add(btn300);
        btn300.setBounds(670, 90, 250, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TARIK TUNAI");
        panelUtama.add(jLabel3);
        jLabel3.setBounds(310, 30, 390, 44);

        txtSaldo1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtSaldo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSaldo1.setText("Jumlah Saldo Rp");
        panelUtama.add(txtSaldo1);
        txtSaldo1.setBounds(350, 340, 390, 44);

        btnKembali1.setBackground(new java.awt.Color(0, 153, 255));
        btnKembali1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnKembali1.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali1.setText("KEMBALI");
        btnKembali1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali1ActionPerformed(evt);
            }
        });
        panelUtama.add(btnKembali1);
        btnKembali1.setBounds(390, 420, 250, 70);

        getContentPane().add(panelUtama);
        panelUtama.setBounds(0, 0, 1030, 600);

        setBounds(0, 0, 1046, 656);
    }// </editor-fold>//GEN-END:initComponents

    private void btn300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn300ActionPerformed
        // TODO add your handling code here:
        panelBerhasil.setVisible(true);
        panelUtama.setVisible(false);
        int tarik=300000;
        saldo=new saldoModel();
        saldo.saldoBaru(tarik);
        txtTarik.setText("Jumlah Penarikan : Rp."+tarik);
        txtSaldo.setText("Sisa Saldo : Rp."+saldo.getSaldo());
    }//GEN-LAST:event_btn300ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
        panelBerhasil.setVisible(true);
        panelUtama.setVisible(false);
        int tarik=100000;
        saldo=new saldoModel();
        saldo.saldoBaru(tarik);
        txtTarik.setText("Jumlah Penarikan : Rp."+tarik);
        txtSaldo.setText("Sisa Saldo : Rp."+saldo.getSaldo());
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn400ActionPerformed
        // TODO add your handling code here:
        panelBerhasil.setVisible(true);
        panelUtama.setVisible(false);
        int tarik=400000;
        saldo=new saldoModel();
        saldo.saldoBaru(tarik);
        txtTarik.setText("Jumlah Penarikan : Rp."+tarik);
        txtSaldo.setText("Sisa Saldo : Rp."+saldo.getSaldo());
    }//GEN-LAST:event_btn400ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
        panelBerhasil.setVisible(true);
        panelUtama.setVisible(false);
        int tarik=200000;
        saldo=new saldoModel();
        saldo.saldoBaru(tarik);
        txtTarik.setText("Jumlah Penarikan : Rp."+tarik);
        txtSaldo.setText("Sisa Saldo : Rp."+saldo.getSaldo());
    }//GEN-LAST:event_btn200ActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new HalamanUtama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali1ActionPerformed
        // TODO add your handling code here:
        new HalamanUtama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembali1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HalamanTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanTarik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanTarik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btn400;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKembali1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelBerhasil;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtSaldo1;
    private javax.swing.JLabel txtTarik;
    // End of variables declaration//GEN-END:variables
}