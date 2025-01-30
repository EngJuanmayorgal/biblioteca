package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.lang.System.exit;
import javax.swing.JPanel;

public class VistaPrincipalApp extends javax.swing.JFrame {

    private int xMouse, yMouse;

    public VistaPrincipalApp() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void CambiarPanel(String pag) {
        switch (pag) {
            case "Fondo" -> {
                cambiarPaguina();
            }
            case "AdminLibros" -> {
                VistaGestLibros VGLibros=new VistaGestLibros();
                cambiarPaguina(VGLibros);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        move = new javax.swing.JPanel();
        fond1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        PBottons = new javax.swing.JPanel();
        BLibros = new javax.swing.JButton();
        BPrestamos = new javax.swing.JButton();
        BUsuarios = new javax.swing.JButton();
        JbotonLibro = new javax.swing.JLabel();
        Jbotonprestamo = new javax.swing.JLabel();
        Jbotonusuarios = new javax.swing.JLabel();
        panelImages = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        move.setBackground(new java.awt.Color(255, 255, 255));
        move.setOpaque(false);
        move.setPreferredSize(new java.awt.Dimension(917, 38));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveMousePressed(evt);
            }
        });
        move.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Fondo.add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 840, 30));

        fond1.setOpaque(false);
        fond1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        fond1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 240, 200));

        PBottons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BLibros.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        BLibros.setForeground(new java.awt.Color(255, 255, 255));
        BLibros.setText("LIBROS");
        BLibros.setBorder(null);
        BLibros.setBorderPainted(false);
        BLibros.setContentAreaFilled(false);
        BLibros.setDefaultCapable(false);
        BLibros.setFocusPainted(false);
        BLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BLibrosMouseExited(evt);
            }
        });
        PBottons.add(BLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        BPrestamos.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        BPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        BPrestamos.setText("PRESTAMOS");
        BPrestamos.setBorder(null);
        BPrestamos.setBorderPainted(false);
        BPrestamos.setContentAreaFilled(false);
        BPrestamos.setDefaultCapable(false);
        BPrestamos.setFocusPainted(false);
        BPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BPrestamosMouseExited(evt);
            }
        });
        PBottons.add(BPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 50));

        BUsuarios.setFont(new java.awt.Font("Pristina", 1, 36)); // NOI18N
        BUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BUsuarios.setText("USUARIOS");
        BUsuarios.setBorder(null);
        BUsuarios.setBorderPainted(false);
        BUsuarios.setContentAreaFilled(false);
        BUsuarios.setDefaultCapable(false);
        BUsuarios.setFocusPainted(false);
        BUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BUsuariosMouseExited(evt);
            }
        });
        PBottons.add(BUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 50));

        JbotonLibro.setVisible(false);
        JbotonLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton1_2.png"))); // NOI18N
        PBottons.add(JbotonLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        Jbotonprestamo.setVisible(false);
        Jbotonprestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton2.png"))); // NOI18N
        Jbotonprestamo.setText("jLabel3");
        PBottons.add(Jbotonprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, -1));

        Jbotonusuarios.setVisible(false);
        Jbotonusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton3.png"))); // NOI18N
        Jbotonusuarios.setText("jLabel3");
        PBottons.add(Jbotonusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 230, 50));

        panelImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fond2.png"))); // NOI18N
        PBottons.add(panelImages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 310));

        fond1.add(PBottons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 140));

        Fondo.add(fond1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFocusable(false);

        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");
        exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exittxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        Panel.setOpaque(false);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        Fondo.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 640, 530));

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fond.png"))); // NOI18N
        Fondo.add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveMouseDragged

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void exittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseClicked
        exit(0);
    }//GEN-LAST:event_exittxtMouseClicked

    private void exittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseEntered
        exit.setBackground(Color.RED);
        exittxt.setForeground(Color.WHITE);
    }//GEN-LAST:event_exittxtMouseEntered

    private void exittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseExited
        exit.setBackground(Color.WHITE);
        exittxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_exittxtMouseExited

    private void BPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPrestamosMouseEntered
        Jbotonprestamo.setVisible(true);
    }//GEN-LAST:event_BPrestamosMouseEntered

    private void BPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BPrestamosMouseExited
        Jbotonprestamo.setVisible(false);
    }//GEN-LAST:event_BPrestamosMouseExited

    private void BLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLibrosMouseEntered
        JbotonLibro.setVisible(true);
    }//GEN-LAST:event_BLibrosMouseEntered

    private void BLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLibrosMouseExited
        JbotonLibro.setVisible(false);
    }//GEN-LAST:event_BLibrosMouseExited

    private void BUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUsuariosMouseEntered
        Jbotonusuarios.setVisible(true);
    }//GEN-LAST:event_BUsuariosMouseEntered

    private void BUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUsuariosMouseExited
        Jbotonusuarios.setVisible(false);
    }//GEN-LAST:event_BUsuariosMouseExited

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        CambiarPanel("Fondo");
    }//GEN-LAST:event_iconMouseClicked

    public void cambiarPaguina(JPanel panel) {
        panel.setSize(640, 530);
        panel.setLocation(0, 0);
        Panel.removeAll();
        Panel.add(panel, BorderLayout.CENTER);
        Panel.revalidate();
        Panel.repaint();
    }
    public void cambiarPaguina() {
        Panel.removeAll();
        Panel.revalidate();
        Panel.repaint();
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
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipalApp();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BLibros;
    public javax.swing.JButton BPrestamos;
    public javax.swing.JButton BUsuarios;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel JbotonLibro;
    private javax.swing.JLabel Jbotonprestamo;
    private javax.swing.JLabel Jbotonusuarios;
    private javax.swing.JPanel PBottons;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel exittxt;
    private javax.swing.JLabel fond;
    private javax.swing.JPanel fond1;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel move;
    private javax.swing.JLabel panelImages;
    // End of variables declaration//GEN-END:variables
}
