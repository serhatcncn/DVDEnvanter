
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameMain extends javax.swing.JFrame {
    public static DoublyLinkedList linkedList = new DoublyLinkedList();
    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ekleButonu = new javax.swing.JButton();
        silButonu = new javax.swing.JButton();
        secButonu = new javax.swing.JButton();
        aZsıralaButonu = new javax.swing.JButton();
        zASıralaButonu = new javax.swing.JButton();
        ikiBinÖncesiGetirButonu = new javax.swing.JButton();
        kaydetButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        ekleButonu.setText("Envantere Ekle");
        ekleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonuActionPerformed(evt);
            }
        });

        silButonu.setText("Envanterden Sİl");
        silButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonuActionPerformed(evt);
            }
        });

        secButonu.setText("Envanterden Seç");
        secButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secButonuActionPerformed(evt);
            }
        });

        aZsıralaButonu.setText("A-Z Sırala");
        aZsıralaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aZsıralaButonuActionPerformed(evt);
            }
        });

        zASıralaButonu.setText("Z-A Sırala");
        zASıralaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zASıralaButonuActionPerformed(evt);
            }
        });

        ikiBinÖncesiGetirButonu.setText("2000 Yılından Önce Çıkmış Albümleri Listele");
        ikiBinÖncesiGetirButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiBinÖncesiGetirButonuActionPerformed(evt);
            }
        });

        kaydetButonu.setText("KAYDET");
        kaydetButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(secButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ekleButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(aZsıralaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zASıralaButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ikiBinÖncesiGetirButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kaydetButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aZsıralaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zASıralaButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addComponent(ikiBinÖncesiGetirButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kaydetButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonuActionPerformed
        JPanelEkleme eklemePanel = new JPanelEkleme();
        eklemePanel.setVisible(true);
    }//GEN-LAST:event_ekleButonuActionPerformed

    private void silButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonuActionPerformed
        JPanelSilme silmePanel = new JPanelSilme();
        silmePanel.setVisible(true);
    }//GEN-LAST:event_silButonuActionPerformed

    private void secButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secButonuActionPerformed
        JPanelSecme secmePanel = new JPanelSecme();
        secmePanel.setVisible(true);      
    }//GEN-LAST:event_secButonuActionPerformed

    private void aZsıralaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aZsıralaButonuActionPerformed
        JPanelAZSırala aZSırala = new JPanelAZSırala();
        aZSırala.setVisible(true);
    }//GEN-LAST:event_aZsıralaButonuActionPerformed

    private void zASıralaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zASıralaButonuActionPerformed
        JPanelZASirala zASirala = new JPanelZASirala();
        zASirala.setVisible(true);
    }//GEN-LAST:event_zASıralaButonuActionPerformed

    private void ikiBinÖncesiGetirButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiBinÖncesiGetirButonuActionPerformed
        JPanel2000 panel2000 = new JPanel2000();
        panel2000.setVisible(true);
    }//GEN-LAST:event_ikiBinÖncesiGetirButonuActionPerformed

    private void kaydetButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetButonuActionPerformed
        PrintWriter outputStream =null;
        String bilgiler = JFrameMain.linkedList.print();
        try {
            outputStream = new PrintWriter(new FileOutputStream("bilgiler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        outputStream.println(bilgiler);
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_kaydetButonuActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Main İşlemlerim
        
        
        try { 
            Scanner data = new Scanner(new FileInputStream("data.txt"));
            while (data.hasNextLine()) {
                String dataLine = data.nextLine();
                String[] dataArray = dataLine.split(", ");
                String sonSarkiAdi = dataArray[dataArray.length-1]; // bu ve devamındaki 2 satır nokta silme işlemi
                String sonSarki = sonSarkiAdi.substring(0, sonSarkiAdi.length()-1);
                dataArray[dataArray.length-1] = sonSarki;
                String sanatci = dataArray[0];
                String albumAdi = dataArray[1];
                int cikisTarihi = Integer.parseInt(dataArray[2]);
                int fiyat = Integer.parseInt(dataArray[3]);
                DVD dvd = new DVD(sanatci, albumAdi, cikisTarihi, fiyat);
                for (int i=4; i < dataArray.length; i++) {
                    dvd.sarkiIsimleri.add(dataArray[i]);
                }
                linkedList.add(dvd);
                
            }
            
        } catch (FileNotFoundException ex) {
            System.exit(0);
        }
           

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aZsıralaButonu;
    private javax.swing.JButton ekleButonu;
    private javax.swing.JButton ikiBinÖncesiGetirButonu;
    private javax.swing.JButton kaydetButonu;
    private javax.swing.JButton secButonu;
    private javax.swing.JButton silButonu;
    private javax.swing.JButton zASıralaButonu;
    // End of variables declaration//GEN-END:variables
}
