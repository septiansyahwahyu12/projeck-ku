/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.security.provider.MD5;

/**
 *
 * @author oryza
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    //Membuat variabel bertipe Connection dengan nama koneksi 
    //tipe variabel ini terdapat pada java.sql lihat pada bagian import java.sql
    Connection koneksi;
    //Membuat variabel bertipe Statement dengan nama stat
    //tipe variabel ini terdapat pada java.sql lihat pada bagian import java.sql
    Statement stat;
    //Membuat variabel bertipe Resultset dengan nama hasil
    //tipe variabel ini terdapat pada java.sql lihat pada bagian import java.sql
    ResultSet hasil;
    //Membuat variabel bertipe String dengan nama query
    String query;
    //membuat Instan kelas Enkripsi.java
    Enkripsi enkrip=new Enkripsi();
    
    public Login() {
        initComponents();
        
        //Instan kelas koneksi
        Koneksi konek=new Koneksi();
        /*
            memanggil fungsi konfigurasi untuk mengetes koneksi dengan databse
            dan menampilkan messege box jika koneksi berhasil maka akan tampil 
            messege box koneksi berhasil dan lanjut menampilkan form login
            jika gagal maka muncul messege box dan keluar dari system
        */
        
        if (konek.konfigurasi().equals("Gagal Koneksi")){
            JOptionPane.showMessageDialog(this,konek.konfigurasi());
            System.exit(0);
        }else{
        //memanggil variabel statemen yang ada pada kelas Koneksi.java dengan instan yang telah dibuat
        stat=konek.statemen;
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("                            POLKAM MART");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");
        setBackground(new java.awt.Color(204, 204, 0));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Pengguna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 153, 51))); // NOI18N

        jLabel1.setText("Nama Pengguna");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sandi");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("                 POLKAM MART");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());
        getContentPane().add(jLabel4, new java.awt.GridBagConstraints());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //variabel username dan password akan mengambil String yang di masukkan melalui form
        String username=jTextField1.getText();
        //enkripsi passord yang diperoleh dati jLabel2 ke MD5 lewat kelas Enkripsi
        String password=enkrip.encryptPasswordMD5(jPasswordField1.getText());
        //mencoba melakukan query kedalam database yang telah terhubung pada konstruktor
        try{
            /*
                query untuk menampilkan semua data yang terdapat pada 
                tabel pengguna database yang terkoneksi
                pada kelas Koneksi.java
            */
            query="SELECT * FROM pengguna WHERE nama ='" +username+"'AND sandi='"+password+"'";
            //proses eksekusi query
            hasil=stat.executeQuery(query);
            //jika hasilnya true query tersebut dan memberikan return tidak null maka lanjut
            //jika tidak maka akan leuar messege box dan kembali ke form login
            if(hasil.next()){
//                GetData data=new GetData();
                GetData.setUserLogin(username); 
//             if(username.equals(hasil.getString("nama"))&&password.equals(hasil.getString("sandi"))){
                Dashboard dasboard= new Dashboard();
                dasboard.setVisible(true);
                this.setVisible(false);
//                }
            }else{
                JOptionPane.showMessageDialog(this,
    "Maaf Anda Tidak Diizinkan Masuk Sistem"+password,
    "Kesalahn Pengguna dan Sandi",
    JOptionPane.WARNING_MESSAGE); 
                //JOptionPane.showMessageDialog(this, "Maaf Nama pengguna atau sandi Kurang Tepat",JOptionPane.WARNING_MESSAGE);
            }
            
        }catch(Exception e){
            System.out.println(" not okee"+e.getMessage());
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
      
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
