package test;

import java.awt.Image;
import java.awt.event.MouseEvent;
import javaswingde.PanelGlowingGradient;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class test extends javax.swing.JFrame {

    static boolean entered = false;
    static String direction = "src/images/";
    static String url1 = direction + "estrella1.png", url2 = direction + "estrella2.png", url3 = direction + "estrella3.png";

    public test() {
        initComponents();
        initialImage();
    }

    private void initialImage() {
        initImage(lbl1, url1);
        initImage(lbl2, url1);
        initImage(lbl3, url1);
        initImage(lbl4, url1);
        initImage(lbl5, url1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shadowRenderer1 = new javaswingdev.shadow.ShadowRenderer();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });

        jLabel2.setText("qualification");

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl2MouseEntered(evt);
            }
        });

        lbl3.setBackground(new java.awt.Color(255, 255, 255));
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl3MouseEntered(evt);
            }
        });

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl4MouseEntered(evt);
            }
        });

        lbl5.setBackground(new java.awt.Color(255, 255, 255));
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
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

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseEntered
        entered = true;
        eventComplet(lbl1, evt);
    }//GEN-LAST:event_lbl1MouseEntered

    private void lbl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseEntered
        entered = true;
        eventComplet(lbl2, evt);
    }//GEN-LAST:event_lbl2MouseEntered

    private void lbl3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseEntered
        entered = true;
        eventComplet(lbl3, evt);
    }//GEN-LAST:event_lbl3MouseEntered

    private void lbl4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseEntered
        entered = true;
        eventComplet(lbl4, evt);
    }//GEN-LAST:event_lbl4MouseEntered

    private void lbl5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseEntered
        entered = true;
        eventComplet(lbl5, evt);
    }//GEN-LAST:event_lbl5MouseEntered

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed
        if (evt.getClickCount() == 1) {
            eventComplet(lbl1, evt);
        }
    }//GEN-LAST:event_lbl1MousePressed

    private void lbl5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseExited
       
    }//GEN-LAST:event_lbl5MouseExited
    private void initImage(JLabel image, String url) {
        image.setIcon(new ImageIcon(getToolkit().getImage(url).getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH)));
    }

    private void eventComplet(JLabel image, MouseEvent event) {
        try {
            if (image.getMousePosition().x > 15) {
                initImage(image, url3);
            } else {
                initImage(image, url2);
            }
        } catch (Exception e) {
        }
    }

    private void initMouseEntered(int count, MouseEvent evt) {
        try {
            switch (count) {
                case 1:
                    eventComplet(lbl1, evt);
                    initImage(lbl2, url1);
                    initImage(lbl3, url1);
                    initImage(lbl4, url1);
                    initImage(lbl5, url1);
                    break;
                case 2:
                    initImage(lbl1, url3);
                    eventComplet(lbl2, evt);
                    initImage(lbl3, url1);
                    initImage(lbl4, url1);
                    initImage(lbl5, url1);
                    break;
                case 3:
                    initImage(lbl1, url3);
                    initImage(lbl2, url3);
                    eventComplet(lbl3, evt);
                    initImage(lbl4, url1);
                    initImage(lbl5, url1);
                case 4:
                    initImage(lbl1, url3);
                    initImage(lbl2, url3);
                    initImage(lbl3, url3);
                    eventComplet(lbl4, evt);
                    initImage(lbl5, url1);
                    break;
                case 5:
                    initImage(lbl1, url3);
                    initImage(lbl2, url3);
                    initImage(lbl3, url3);
                    initImage(lbl4, url3);
                    eventComplet(lbl5, evt);
                    break;
            }
        } catch (Exception e) {

        }
    }

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javaswingdev.shadow.ShadowRenderer shadowRenderer1;
    // End of variables declaration//GEN-END:variables
}
