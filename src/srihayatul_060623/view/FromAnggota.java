/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package annisa_060623.view;

import annisa_060623.controller.AnggotaController;
/**
 *
 * @author Slime1
 */
public class FromAnggota extends javax.swing.JFrame {

    /**
     * Creates new form FromAnggota
     */
    AnggotaController controller;
    public FromAnggota() {
        initComponents();
        controller = new AnggotaController(this);
        controller.clearForm();
        controller.tampil();
    }
    
    
    public javax.swing.JTextField gettxtkode(){
        return txtkode;
    }
     public javax.swing.JTextField gettxtnama(){
        return txtnama;
    }
      public javax.swing.JTextField gettxtalamat(){
        return txtalamat;
    }
       public javax.swing.JComboBox getcbojenkel(){
        return cbojenkel;
    }
     
    public javax.swing.JTable gettabelanggota(){
        return tabelanggota;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbojenkel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelanggota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 16);

        jLabel2.setText("Nama Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 90, 16);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 37, 16);

        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 80, 16);

        txtkode.setText("jTextField1");
        getContentPane().add(txtkode);
        txtkode.setBounds(150, 20, 120, 22);

        txtnama.setText("jTextField2");
        getContentPane().add(txtnama);
        txtnama.setBounds(150, 50, 120, 22);

        txtalamat.setText("jTextField3");
        getContentPane().add(txtalamat);
        txtalamat.setBounds(150, 80, 120, 22);

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert);
        btninsert.setBounds(20, 150, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(110, 150, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(210, 150, 72, 23);

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 150, 72, 23);

        cbojenkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbojenkel);
        cbojenkel.setBounds(150, 110, 72, 22);

        tabelanggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode anggota", "Nama Anggota", "Alamat", "Jenis Kelamin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelanggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelanggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelanggota);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 380, 150);

        setSize(new java.awt.Dimension(414, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     controller.clearForm();                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
    controller.saveAnggota();
    controller.tampil();
    controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        controller.updateAnggota();
        controller.tampil();
        controller.clearForm(); // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       controller.deleteAnggota();
        controller.tampil();
        controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tabelanggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelanggotaMouseClicked
       controller.getAnggota();  // TODO add your handling code here:
    }//GEN-LAST:event_tabelanggotaMouseClicked

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
            java.util.logging.Logger.getLogger(FromAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbojenkel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelanggota;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
