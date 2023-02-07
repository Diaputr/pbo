package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmPeminjaman extends javax.swing.JFrame {
    public FrmPeminjaman() {
        initComponents();
        kosongkanForm();
        tampilData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtTglKembali = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        txtIdAnggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        btncariAnggota = new javax.swing.JButton();
        btncariBuku = new javax.swing.JButton();
        txtNama = new javax.swing.JLabel();
        txtJudul = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Tanggal Pinjam");

        jLabel3.setText("Tanggal Kembali");

        txtIdPeminjaman.setEditable(false);
        txtIdPeminjaman.setEnabled(false);
        txtIdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPeminjamanActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah Baru");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPeminjaman);

        txtIdAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAnggotaActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Anggota");

        jLabel6.setText("ID Buku");

        txtIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBukuActionPerformed(evt);
            }
        });

        btncariAnggota.setText("Cari");
        btncariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariAnggotaActionPerformed(evt);
            }
        });

        btncariBuku.setText("Cari");
        btncariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariBukuActionPerformed(evt);
            }
        });

        txtNama.setText("Nama Anggota");

        txtJudul.setText("Judul Buku");

        jLabel8.setText("Format: YYYY/MM/DD");

        jLabel9.setText("Format: YYYY/MM/DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnTambah)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncariAnggota))
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTglPinjam)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btncariBuku))
                            .addComponent(txtTglKembali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama)
                            .addComponent(txtJudul)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncariAnggota)
                            .addComponent(txtNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncariBuku)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtJudul)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPeminjamanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Anggota ang = new Anggota().getById(Integer.parseInt(txtIdAnggota.getText()));
        if (ang.getIdanggota() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak Ada Anggota");
            return;
        }
        
        Buku buku = new Buku().getById(Integer.parseInt(txtIdBuku.getText()));
        if (buku.getIdbuku()== 0) {
            JOptionPane.showMessageDialog(null, "Tidak Ada buku");
            return;
        }
        
        Peminjaman pjm = new Peminjaman();
        pjm.setIdPeminjaman(Integer.parseInt(txtIdPeminjaman.getText()));
        pjm.setTglPinjam(txtTglPinjam.getText());
        pjm.setTglKembali(txtTglKembali.getText());
        pjm.setAnggota(ang);
        pjm.setBuku(buku);
        pjm.save();
        txtIdPeminjaman.setText(Integer.toString(pjm.getIdPeminjaman()));
        tampilData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();
        
        Peminjaman pjm = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        pjm.delete();
        kosongkanForm();
        tampilData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();
        
        Peminjaman pjm = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        txtIdPeminjaman.setText(model.getValueAt(row, 0).toString());
        txtIdAnggota.setText(Integer.toString(pjm.getAnggota().getIdanggota()));
        txtIdBuku.setText(Integer.toString(pjm.getBuku().getIdbuku()));
        txtTglPinjam.setText(model.getValueAt(row, 3).toString());
        txtTglKembali.setText(model.getValueAt(row, 4).toString());
        
        txtNama.setText(pjm.getAnggota().getNama());
        txtJudul.setText(pjm.getBuku().getJudul());
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void txtIdAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAnggotaActionPerformed

    private void txtIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBukuActionPerformed

    private void btncariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariAnggotaActionPerformed
        // TODO add your handling code here:
        Anggota ang = new Anggota().getById(Integer.parseInt(txtIdAnggota.getText()));
        if (ang.getIdanggota() == 0) {
            txtNama.setText("Tidak ada Anggota");
        } else txtNama.setText(ang.getNama());
    }//GEN-LAST:event_btncariAnggotaActionPerformed

    private void btncariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariBukuActionPerformed
        // TODO add your handling code here:
        Buku buku = new Buku().getById(Integer.parseInt(txtIdBuku.getText()));
        if (buku.getIdbuku()== 0) {
            txtJudul.setText("Tidak ada buku");
        } else txtJudul.setText(buku.getJudul());
    }//GEN-LAST:event_btncariBukuActionPerformed
    
    public void kosongkanForm(){
        txtIdPeminjaman.setText("0");
        txtTglPinjam.setText("");
        txtTglKembali.setText("");
        txtIdBuku.setText("");
        txtIdAnggota.setText("");
        txtNama.setText("Nama Anggota");
        txtJudul.setText("Judul Buku");
    }
    
    public void tampilData(){
        String[] kolom = {"ID", "Nama", "Judul", "Tgl Pinjam", "Tgl Kembali"};
        ArrayList<Peminjaman> list = new Peminjaman().getAll();
        Object rowData[] = new Object[5];
        
        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        for (Peminjaman p : list) {
            rowData[0] = p.getIdPeminjaman();
            rowData[1] = p.getAnggota().getNama();
            rowData[2] = p.getBuku().getJudul();
            rowData[3] = p.getTglPinjam();
            rowData[4] = p.getTglKembali();
            
            ((DefaultTableModel)tblPeminjaman.getModel()).addRow(rowData);
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btncariAnggota;
    private javax.swing.JButton btncariBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JLabel txtNama;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}