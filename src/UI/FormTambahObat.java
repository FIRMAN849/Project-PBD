package UI;


import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modul.konek;
import UI.ViewDataObat;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adeln
 */
public class FormTambahObat extends javax.swing.JFrame {
    public static String id_obat;
    /**
     * Creates new form Form_tambahBarang
     */
    public FormTambahObat() {
        initComponents();
        try {
             java.sql.Statement statement = (java.sql.Statement)konek.GetConnection().createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM data_obat WHERE kode_obat = '" + id_obat + "'");
             if(rs.next()){
                txt_kodeobat.setText(rs.getString(1));
                txt_namaobat.setText(rs.getString(2));
                txt_hargabeli.setText(rs.getString(3));
                txt_hargajual.setText(rs.getString(4));
                txt_stok.setText(rs.getString(5));
                Txt_TglMasuk.setDate(rs.getDate(7));
                Txt_TglKadaluarsa.setDate(rs.getDate(8));
                Txt_Suplier.setText(rs.getString(9));
                txt_kategori.getSelectedItem();
                
            } 
        } catch (Exception e) {
            System.out.println("Error Awal Obat : " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button3 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_namaobat = new javax.swing.JTextField();
        txt_hargabeli = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        txt_hargajual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_kodeobat = new javax.swing.JTextField();
        txt_kategori = new javax.swing.JComboBox<>();
        Txt_TglMasuk = new com.toedter.calendar.JDateChooser();
        Txt_TglKadaluarsa = new com.toedter.calendar.JDateChooser();
        Txt_Suplier = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Form");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button3.setBackground(new java.awt.Color(153, 0, 153));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Logout");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 246, 248));

        jLabel3.setText("Kode Obat");

        jLabel4.setText("Nama Obat");

        jLabel5.setText("Harga beli");

        jLabel6.setText("Stok Obat");

        txt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga Jual");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Form Obat");

        btn_simpan.setBackground(new java.awt.Color(128, 194, 255));
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 128, 128));
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setText("Kembali");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel7.setText("Jenis Obat");

        txt_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pil", "sirup", " " }));
        txt_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kategoriActionPerformed(evt);
            }
        });

        jLabel10.setText("Tanggal Masuk Obat");

        jLabel11.setText("Tanggal Kadaluarsa");

        jLabel12.setText("Suplier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_TglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Suplier, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_TglKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_hargabeli, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                            .addComponent(txt_kodeobat)
                                            .addComponent(txt_hargajual)
                                            .addComponent(txt_namaobat))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(4, 4, 4))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 278, Short.MAX_VALUE)
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(269, 269, 269)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(378, 378, 378))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_kodeobat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_namaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_hargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)))
                            .addComponent(Txt_TglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addComponent(Txt_TglKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Suplier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
       
       
        try {
           java.sql.Statement statement = (java.sql.Statement)konek.GetConnection().createStatement();
           ResultSet rs = statement.executeQuery("SELECT * FROM data_obat WHERE kode_obat = '" + id_obat + "'");
           
           String tampilan ="yyyy-MM-dd";
             SimpleDateFormat fm = new SimpleDateFormat(tampilan);
             String tglmasuk= String.valueOf(fm.format(Txt_TglMasuk.getDate()));
             String tglkadaluarsa= String.valueOf(fm.format(Txt_TglKadaluarsa.getDate()));
           
           if(rs.next()){
                statement.executeUpdate("UPDATE data_obat SET " 
                        
                        + "kode_obat = '" + txt_kodeobat.getText() + "',  " 
                        + "nama_obat = '" + txt_namaobat.getText() + "',  " 
                        + "harga_beli = '" + txt_hargabeli.getText() + "',  " 
                        + "harga_jual = '" + txt_hargajual.getText() + "',  " 
                        + "jumlah = '" + txt_stok.getText() + "',  " 
                        + "kategori = '" + txt_kategori.getSelectedItem()+ "',  " 
                        + "tgl_masukobat = '" +tglmasuk+ "',  " 
                        + "tgl_kadaluarsa = '" + tglkadaluarsa+ "',  " 
                        + "suplier = '" + Txt_Suplier.getText()+ "'  "
                        + "WHERE kode_obat = '" + id_obat + "'  " );
                        
           }else{
               statement.executeUpdate("INSERT INTO data_obat SET "
                       
                        + "kode_obat = '" + txt_kodeobat.getText() + "',  " 
                        + "nama_obat = '" + txt_namaobat.getText() + "',  " 
                        + "harga_beli = '" + txt_hargabeli.getText() + "',  " 
                        + "harga_jual = '" + txt_hargajual.getText() + "',  " 
                        + "jumlah = '" + txt_stok.getText() + "',  " 
                        + "kategori = '" + txt_kategori.getSelectedItem()+ "',  "
                        + "tgl_masukobat = '" + tglmasuk+ "',  " 
                        + "tgl_kadaluarsa = '" + tglkadaluarsa+ "',  " 
                        + "suplier = '" + Txt_Suplier.getText()+ "'  "); 
                      
               
           }
           
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            id_obat = "";
           
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        
        
        dispose();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stokActionPerformed

    private void txt_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kategoriActionPerformed

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
            java.util.logging.Logger.getLogger(FormTambahObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_Suplier;
    private com.toedter.calendar.JDateChooser Txt_TglKadaluarsa;
    private com.toedter.calendar.JDateChooser Txt_TglMasuk;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_hargabeli;
    private javax.swing.JTextField txt_hargajual;
    private javax.swing.JComboBox<String> txt_kategori;
    private javax.swing.JTextField txt_kodeobat;
    private javax.swing.JTextField txt_namaobat;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
