/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author ASUS
 */
public class TampilanGUI extends javax.swing.JFrame {

    private Timer refreshTimer;

    /**
     * Creates new form TampilanGUI
     */
    public TampilanGUI() {
        try {
            dataBuku = new ArrayList<>();
            initComponents();
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/buku", "postgres", "5432");
            tampil(conn);

            // Membuat dan mengatur timer untuk auto-refresh setiap 5 detik (5000 milidetik)
            refreshTimer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tampil(conn);
                }
            });
            refreshTimer.start();
        } catch (SQLException ex) {
            Logger.getLogger(TampilanGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<Buku> dataBuku;

    private int masukkanData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit_buku) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO buku (isbn, judul_buku, tahun_terbit, penerbit_buku) VALUES(?,?,?,?)");
        pst.setString(1, isbn);
        pst.setString(2, judul_buku);
        pst.setString(3, tahun_terbit);
        pst.setString(4, penerbit_buku);
        return pst.executeUpdate();
    }

    private int perbaruiData(Connection conn, String isbn, String judul_buku, String tahun_terbit, String penerbit_buku) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("UPDATE buku SET judul_buku=?, tahun_terbit=?, penerbit_buku=? WHERE isbn=?");
        pst.setString(1, judul_buku);
        pst.setString(2, tahun_terbit);
        pst.setString(3, penerbit_buku);
        pst.setString(4, isbn);
        return pst.executeUpdate();
    }

    private int hapusData(Connection conn, String isbn) throws SQLException {
        PreparedStatement pst = conn.prepareStatement("DELETE FROM buku WHERE isbn = ?");
        pst.setString(1, isbn);
        return pst.executeUpdate();
    }

    private void tampil(Connection conn) {
        dataBuku.clear();
        try {
            String sql = "select * from buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Buku data = new Buku();
                data.setIsbn(String.valueOf(rs.getObject(1)));
                data.setJudul_buku(String.valueOf(rs.getObject(2)));
                data.setTahun_terbit(String.valueOf(rs.getObject(3)));
                data.setPenerbit_buku(String.valueOf(rs.getObject(4)));
                dataBuku.add(data);
            }
            DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
            model.setRowCount(0);
            for (Buku data : dataBuku) {

                Object[] baris = new Object[4];
                baris[0] = data.getIsbn();
                baris[1] = data.getJudul_buku();
                baris[2] = data.getTahun_terbit();
                baris[3] = data.getPenerbit_buku();
                model.addRow(baris);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TampilanGUI.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldjudul = new javax.swing.JTextField();
        jTextFieldisbn = new javax.swing.JTextField();
        jTextFieldpenerbit = new javax.swing.JTextField();
        jTextFieldtahun = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonCetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jButtonUpload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setText("DAFTAR BUKU ANGKATAN 2022");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 50, 720, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ISBN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 140, 46, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Judul Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 210, 101, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tahun Terbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 280, 116, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Penerbit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 350, 77, 22);
        getContentPane().add(jTextFieldjudul);
        jTextFieldjudul.setBounds(490, 210, 369, 30);

        jTextFieldisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldisbnActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldisbn);
        jTextFieldisbn.setBounds(490, 140, 369, 30);
        getContentPane().add(jTextFieldpenerbit);
        jTextFieldpenerbit.setBounds(490, 350, 369, 31);
        getContentPane().add(jTextFieldtahun);
        jTextFieldtahun.setBounds(490, 280, 369, 34);

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(520, 440, 157, 34);

        jButtonSimpan.setText("SIMPAN");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimpan);
        jButtonSimpan.setBounds(300, 440, 154, 34);

        jButtonHapus.setText("HAPUS");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHapus);
        jButtonHapus.setBounds(740, 440, 149, 34);

        jButtonCetak.setText("CETAK");
        jButtonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCetak);
        jButtonCetak.setBounds(330, 670, 230, 40);

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul Buku", "Tahun Terbit", "Penerbit"
            }
        ));
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 500, 741, 130);

        jButtonUpload.setText("UPLOAD");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpload);
        jButtonUpload.setBounds(600, 670, 240, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldisbnActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();
        String judul = jTextFieldjudul.getText();
        String tahun = jTextFieldtahun.getText();
        String penerbit = jTextFieldpenerbit.getText();

        EntityManager entityManager = Persistence.createEntityManagerFactory("pboutsPU").createEntityManager();
        entityManager.getTransaction().begin();
        Buku_1 b = new Buku_1();
        b.setIsbn(isbn);
        b.setJudulBuku(judul);
        b.setTahunTerbit(tahun);
        b.setPenerbit(penerbit);
        entityManager.persist(b);
        entityManager.getTransaction().commit();

        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pboutsPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Buku_1 b = em.find(Buku_1.class, isbn);
        em.remove(b);

        em.getTransaction().commit();

        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");

    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String isbn = jTextFieldisbn.getText().trim();
        String judul = jTextFieldjudul.getText();
        String tahun = jTextFieldtahun.getText();
        String penerbit = jTextFieldpenerbit.getText();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pboutsPU");
        EntityManager em = emf.createEntityManager();
        Buku_1 b = new Buku_1();
        b.setIsbn(isbn);
        b.setJudulBuku(judul);
        b.setTahunTerbit(tahun);
        b.setPenerbit(penerbit);
        em.getTransaction().begin();
        em.merge(b);
        em.getTransaction().commit();

        jTextFieldisbn.setText("");
        jTextFieldjudul.setText("");
        jTextFieldtahun.setText("");
        jTextFieldpenerbit.setText("");

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        // TODO add your handling code here:
        int baris = jTableBuku.rowAtPoint(evt.getPoint());

        String isbn = jTableBuku.getValueAt(baris, 0).toString();
        jTextFieldisbn.setText(isbn);

        String judul = jTableBuku.getValueAt(baris, 1).toString();
        jTextFieldjudul.setText(judul);

        String tahun = jTableBuku.getValueAt(baris, 2).toString();
        jTextFieldtahun.setText(tahun);

        String penerbit = jTableBuku.getValueAt(baris, 3).toString();
        jTextFieldpenerbit.setText(penerbit);
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();

        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {

            EntityManager entityManager = Persistence.createEntityManagerFactory("pboutsPU").createEntityManager();
            entityManager.getTransaction().begin();

            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            String fi = f.getName();
            //Parsing CSV Data
            System.out.print(filepath);
            DefaultTableModel csv_data = new DefaultTableModel();

            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {

                    Buku_1 b = new Buku_1();
                    b.setIsbn(csvRecord.get(0));
                    b.setJudulBuku(csvRecord.get(1));
                    b.setTahunTerbit(csvRecord.get(2));
                    b.setPenerbit(csvRecord.get(3));
                    entityManager.persist(b);
                }

            } catch (Exception ex) {
                System.out.println("Error in Parsing CSV File");
            }
            entityManager.getTransaction().commit();
        }

    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jButtonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakActionPerformed
        // TODO add your handling code here:
        //        InputStream reportTemplate = Buku_1.class.getResourceAsStream("src/pbouts/Book.jrxml");
        //        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pboutsPU");
        //        EntityManager em = emf.createEntityManager();
        //        List<Buku_1> data = em.createQuery("SELECT b FROM Buku_1 b", Buku_1.class).getResultList();
        //        JasperReport jasperReport;
        //
        //        try {
        //            jasperReport = JasperCompileManager.compileReport(reportTemplate);
        //            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JRBeanCollectionDataSource(dataBuku));
        //            JasperViewer.viewReport(jasperPrint, false);
        //
        //        } catch (JRException ex) {
        //            ex.printStackTrace();
        //        } finally {
        //
        //            em.close();
        //            emf.close();
        //        }
        //

        String reportPath = "src/pbouts/Book.jrxml";
        // awal persistence
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pboutsPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku_1> cq = cb.createQuery(Buku_1.class);
        Root<Buku_1> bok = cq.from(Buku_1.class);
        cq.select(bok);

        TypedQuery<Buku_1> q = em.createQuery(cq);
        List<Buku_1> list = q.getResultList();
        Query query = em.createQuery("SELECT b FROM Buku_1 b");
        List<Buku_1> result = query.getResultList();

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(result);

        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(TampilanGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
        // akhir persistence
    }//GEN-LAST:event_jButtonCetakActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TampilanGUI guiBuku = new TampilanGUI();
                guiBuku.setVisible(true);

                // Menambahkan window listener untuk mematikan timer saat aplikasi ditutup
                guiBuku.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        guiBuku.refreshTimer.stop();
                        System.exit(0);
                    }
                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCetak;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTextField jTextFieldisbn;
    private javax.swing.JTextField jTextFieldjudul;
    private javax.swing.JTextField jTextFieldpenerbit;
    private javax.swing.JTextField jTextFieldtahun;
    // End of variables declaration//GEN-END:variables
}
