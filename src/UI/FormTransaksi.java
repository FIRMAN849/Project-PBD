/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modul.konek;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author adeln
 */
public class FormTransaksi extends javax.swing.JFrame {

    /**
    
     */
    public FormTransaksi() {
        initComponents();
        totalharga();
        no_transaksi();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_IDbrg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_namaBrg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_HSatuan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_jumlahBeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_jumlahHarga = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kasir = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        bnt_batal = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        txt_notra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bnt_cetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 246, 248));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("TRANSAKSI");

        jLabel2.setText("ID Obat");

        txt_IDbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDbrgActionPerformed(evt);
            }
        });
        txt_IDbrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IDbrgKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IDbrgKeyReleased(evt);
            }
        });

        jLabel8.setText("Nama Obat");

        txt_namaBrg.setEditable(false);
        txt_namaBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaBrgActionPerformed(evt);
            }
        });

        jLabel9.setText("Harga");

        txt_HSatuan.setEditable(false);
        txt_HSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HSatuanActionPerformed(evt);
            }
        });

        jLabel10.setText("Jumlah Beli");

        txt_jumlahBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahBeliActionPerformed(evt);
            }
        });
        txt_jumlahBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahBeliKeyReleased(evt);
            }
        });

        jLabel5.setText("Jumlah Harga");

        txt_jumlahHarga.setEditable(false);
        txt_jumlahHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahHargaActionPerformed(evt);
            }
        });

        btn_simpan.setBackground(new java.awt.Color(128, 194, 255));
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jLabel6.setText("Total");

        jLabel7.setText("Bayar");

        jLabel11.setText("Kembali");

        txt_total.setEditable(false);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        txt_kembalian.setEditable(false);
        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });

        tbl_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Barang", "Nama Barang", "Pcs", "Sub total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_kasir);

        jLabel12.setText("Item yang akan dibeli ");

        btn_tambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        bnt_batal.setBackground(new java.awt.Color(255, 128, 128));
        bnt_batal.setForeground(new java.awt.Color(255, 255, 255));
        bnt_batal.setText("Batal");
        bnt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_batalActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        txt_notra.setEditable(false);
        txt_notra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notraActionPerformed(evt);
            }
        });

        jLabel1.setText("No. Transaksi");

        bnt_cetak.setBackground(new java.awt.Color(255, 128, 128));
        bnt_cetak.setForeground(new java.awt.Color(255, 255, 255));
        bnt_cetak.setText("Cetak");
        bnt_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_notra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_jumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_jumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_HSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_namaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_IDbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(131, 131, 131)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(bnt_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(bnt_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 158, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_notra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_IDbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_namaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_HSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_jumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt_cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_tambah)
                                    .addComponent(btn_reset))))))
                .addContainerGap(106, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        //
    }//GEN-LAST:event_jPanel1ComponentShown

    private void txt_notraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notraActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_notraActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        MenuKaryawan db = new MenuKaryawan();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void bnt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_batalActionPerformed
        // TODO add your handling code here:
        mdl.getDataVector().removeAllElements();
        mdl.fireTableDataChanged();
        tbl_kasir.setModel(mdl);
        txt_total.setText("0");
        txt_bayar.setText("");
        txt_IDbrg.requestFocus();
    }//GEN-LAST:event_bnt_batalActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        int no = tbl_kasir.getRowCount();
        no++;
        mdl.addRow(new Object []
            {no,txt_IDbrg.getText(),txt_namaBrg.getText(),txt_jumlahBeli.getText(),txt_jumlahHarga.getText()} );
        totalharga();
        reset();
        tbl_kasir.setModel(mdl);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
        int total = Integer.parseInt(txt_total.getText());
        int bayar = Integer.parseInt(txt_bayar.getText());
        int d = bayar - total;
        if(total > 0){
            txt_kembalian.setText(Integer.toString(d));
        }
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        int sumtotal = 0;
        int row = mdl.getRowCount();

        try{
            Statement st = (Statement)konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transaksi where no_trans = '"+txt_notra.getText()+"' ");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Maaf,\n Nomor Transaksi sudah terdaftar");
                rs.close();
            } else {

                int total,bayar;
                total = Integer.parseInt(txt_total.getText());
                bayar = Integer.parseInt(txt_bayar.getText());
                if (bayar >= total){

                    st.executeUpdate("INSERT into transaksi (total_belanja,tanggal)"
                        + " VALUES('"+total+"',CURRENT_DATE)");
                    ResultSet rs1 = st.executeQuery("select count(*) as jumlah from detil_transaksi");
                    int id_det = 1;
                    if (rs1.next()) {
                        id_det = Integer.parseInt(rs1.getString("jumlah"));
                        for (int i = 0; i < row; i++) {
                            ++id_det;
                            st.executeUpdate(" insert into detil_transaksi set id_detil='detil"+id_det+"',"
                                + "no_trans='"+txt_notra.getText()+"',"
                                + "total_belanja='"+txt_total.getText()+"',"
                                + "tanggal = CURRENT_DATE,"
                                + "kode_obat = '"+tbl_kasir.getValueAt(i, 1)+"',"
                                + "nama_obat = '"+tbl_kasir.getValueAt(i, 2)+"', "
                                + "harga_jual = '"+tbl_kasir.getValueAt(i, 4)+"', "
                                + "kuantitas = '"+tbl_kasir.getValueAt(i, 3)+"' ");

                            st.executeUpdate("UPDATE data_obat set jumlah = jumlah - '"+tbl_kasir.getValueAt(i, 3)+"' "
                                + "WHERE kode_obat='"+tbl_kasir.getValueAt(i, 1)+"' ");
                        }
                    } else {
                        for (int i = 0; i < row; i++) {
                            st.executeUpdate(" insert into detil_transaksi set id_detil='detil"+id_det+"',"
                                + "no_trans='"+txt_notra.getText()+"',"
                                + "total_belanja='"+txt_total.getText()+"',"
                                + "tanggal = CURRENT_DATE,"
                                + "kode_obat = '"+tbl_kasir.getValueAt(i, 1)+"',"
                                + "nama_obat = '"+tbl_kasir.getValueAt(i, 2)+"', "
                                + "harga_jual = '"+tbl_kasir.getValueAt(i, 4)+"', "
                                + "kuantitas = '"+tbl_kasir.getValueAt(i, 3)+"' ");

                            st.executeUpdate("UPDATE data_obat set jumlah = jumlah - '"+tbl_kasir.getValueAt(i, 3)+"' "
                                + "WHERE kode_obat='"+tbl_kasir.getValueAt(i, 1)+"' ");
                        }
                    }
                    no_transaksi();
                    JOptionPane.showMessageDialog(null, "Selamat,\n Transaksi anda berhasil");
                    mdl.setRowCount(0);
                    txt_total.setText("");
                    txt_bayar.setText("");
                    txt_kembalian.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Maaf,\nJumlah Bayar Kurang");
                    txt_bayar.requestFocus();
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_jumlahHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahHargaActionPerformed

    private void txt_jumlahBeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahBeliKeyReleased
        // TODO add your handling code here:
        if(!txt_jumlahBeli.equals("") && !txt_HSatuan.equals("")){
            int harga =  Integer.parseInt(txt_HSatuan.getText());
            int pcs =  Integer.parseInt(txt_jumlahBeli.getText());
            int rumus = pcs*harga;
            String hasil = String.valueOf(rumus);
            txt_jumlahHarga.setText(hasil);
        } else {
            txt_jumlahHarga.setText("");
        }
    }//GEN-LAST:event_txt_jumlahBeliKeyReleased

    private void txt_jumlahBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahBeliActionPerformed

    private void txt_HSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HSatuanActionPerformed

    private void txt_namaBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaBrgActionPerformed

    private void txt_IDbrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDbrgKeyReleased
        // TODO add your handling code here:
        String a = txt_IDbrg.getText();

        try {
            Statement st = (Statement)konek.GetConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from data_obat Where kode_obat = '"+a+"' ");
            while(rs.next()){
                txt_namaBrg.setText(rs.getString("nama_obat"));
                txt_HSatuan.setText(rs.getString("harga_jual"));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"SQL GAGAL");
        }
    }//GEN-LAST:event_txt_IDbrgKeyReleased

    private void txt_IDbrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDbrgKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_IDbrgKeyPressed

    private void txt_IDbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDbrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDbrgActionPerformed

    private void bnt_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_cetakActionPerformed
        try{
            String file = "/Struk/struk.jasper";
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            HashMap param = new HashMap();
            
            
            param.put("kode",txt_notra.getText());
            param.put("total",txt_jumlahHarga.getText());
            param.put("uang",txt_bayar.getText());
            param.put("kembalian",txt_kembalian.getText());
            
            JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream(file),param,konek.GetConnection());
            JasperViewer.viewReport(print, false);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_bnt_cetakActionPerformed


    
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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_batal;
    private javax.swing.JButton bnt_cetak;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_kasir;
    private javax.swing.JTextField txt_HSatuan;
    private javax.swing.JTextField txt_IDbrg;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_jumlahBeli;
    private javax.swing.JTextField txt_jumlahHarga;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_namaBrg;
    private javax.swing.JTextField txt_notra;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
        int baris = 0 ; 
        Object kolom[] = {"No."," ID Barang ", " Nama Barang ","Pcs","Sub total"} ; 
        DefaultTableModel mdl = new DefaultTableModel(kolom,baris);
        private void totalharga(){
            int jml = mdl.getRowCount();
            int totalbiaya = 0;
            int subtotal;
            for (int i = 0; i < jml; i++) {
                subtotal = Integer.valueOf(mdl.getValueAt(i, 4).toString());
                totalbiaya += subtotal;
            }
            txt_total.setText(String.valueOf(totalbiaya));
        }
        private void no_transaksi(){
            String notra,str = "";
            boolean sama = false;
            try {
                Statement st = (Statement)konek.GetConnection().createStatement();
                ResultSet rs = st.executeQuery(" select no_trans as jumlah from transaksi ORDER by no_trans desc ");
                if (rs.next()){
                    str = rs.getString("jumlah");
                    int no_u = Integer.parseInt(rs.getString("jumlah")) + 1;
                    txt_notra.setText(Integer.toString(no_u));
                }else{
                  txt_notra.setText("1");
            }
            rs.close();
            }
            catch (Exception e ){
               
            }
        }     
        
        private void reset(){
            txt_IDbrg.setText("");
            txt_namaBrg.setText("");
            txt_HSatuan.setText("");
            txt_jumlahBeli.setText("");
            txt_jumlahHarga.setText("");
        }
}
