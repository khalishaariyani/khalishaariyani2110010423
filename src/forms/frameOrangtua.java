/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import Dataset.dsorangtua;
import javax.swing.JOptionPane;

/**
 *
 * @author windows 10
 */
public class frameOrangtua extends javax.swing.JFrame {
    dsorangtua datasetOrangtua;

    /**
     * Creates new form frameOrangtua
     */
    public frameOrangtua() {
        initComponents();
        this.setLocationRelativeTo(null);
        datasetOrangtua = new dsorangtua();
    
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtidsiswa = new javax.swing.JTextField();
        txtnamaayah = new javax.swing.JTextField();
        txtnamaibu = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        cmb1 = new javax.swing.JComboBox<>();
        btntambah = new javax.swing.JButton();
        btntampil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Orang tua");

        jLabel2.setText("id");

        jLabel3.setText("id siswa");

        jLabel4.setText("nama ayah");

        jLabel5.setText("nama ibu");

        jLabel6.setText("username");

        jLabel7.setText("password");

        jLabel8.setText("updateterakhir");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "januari", "februari", "maret", "april" }));

        btntambah.setText("Tambah data");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btntampil.setText("Tampil data");
        btntampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtid)
                                .addComponent(txtidsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnamaayah)
                                .addComponent(txtnamaibu)
                                .addComponent(txtusername)
                                .addComponent(txtpassword)
                                .addComponent(cmb1, 0, 208, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btntambah)
                        .addGap(105, 105, 105)
                        .addComponent(btntampil)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnamaayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtnamaibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btntampil))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
       datasetOrangtua.id(Integer.valueOf(txtid.getText()));
       datasetOrangtua.idsiswa(txtidsiswa.getText());
       datasetOrangtua.namaayah(txtnamaayah.getText());    
       datasetOrangtua.namaibu(txtnamaibu.getText());  
       datasetOrangtua.username(txtusername.getText());  
       datasetOrangtua.password(txtpassword.getText());
       datasetOrangtua.updateterakhir(cmb1.getSelectedItem().toString());
        
        String pesan = "Data Berhasil Disimpan";
        JOptionPane.showMessageDialog(this, pesan);
        // TODO add your handling code here:
    }//GEN-LAST:event_btntambahActionPerformed

    private void btntampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilActionPerformed
        
        String isipesan ="id : " + datasetOrangtua.getDatasetId().get(0)+
                      "idsiswa : " + datasetOrangtua.getDatasetIdsiswa().get(0)+
                      "\nNama namaayah : " + datasetOrangtua.getDatasetNamaayah().get(0) +
                      "\nNama namaibu : " + datasetOrangtua.getDatasetNamaibu().get(0) +
                      "\nusername : " + datasetOrangtua.getDatasetUsername().get(0) +
                      "\npassword : " + datasetOrangtua.getDatasetPassword().get(0)+
                       "\nUpdate Terakhir : " + datasetOrangtua.getDatasetUpdateterakhir().get(0);
         JOptionPane.showMessageDialog(this, isipesan);
        // TODO add your handling code here:
    }//GEN-LAST:event_btntampilActionPerformed

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
            java.util.logging.Logger.getLogger(frameOrangtua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameOrangtua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameOrangtua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameOrangtua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameOrangtua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntampil;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidsiswa;
    private javax.swing.JTextField txtnamaayah;
    private javax.swing.JTextField txtnamaibu;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
