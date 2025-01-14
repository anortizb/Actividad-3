/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Principal;

/**
 *
 * @author Visitante
 */
public class midPrincipal extends javax.swing.JFrame {

    private final jpRombo objRombo = new jpRombo();
    private final jpTrapecio objTrapecio = new jpTrapecio();
    private final jpCuadrado objCuadrado = new jpCuadrado();
    private final jpCirculo objCirculo = new jpCirculo();
    private final jpRectangulo objRectangulo = new jpRectangulo();
    private final jpTrianguloRectangulo objTrianguloRectangulo = new jpTrianguloRectangulo();
    
    private void inicializarFormularios(){
    jifRombo.setContentPane(objRombo);
    objRombo.setSize(300, 300);
    jifRombo.setSize(500, 400);
    
    jifTrapecio.setContentPane(objTrapecio);
    objTrapecio.setSize(300, 300);
    jifTrapecio.setSize(300, 600);
    
    jifCuadrado.setContentPane(objCuadrado);
    objCuadrado.setSize(300, 300);
    jifCuadrado.setSize(300, 300);
    
    jifCirculo.setContentPane(objCirculo);
    objCirculo.setSize(300, 300);
    jifCirculo.setSize(300, 300);
    
    jifRectangulo.setContentPane(objRectangulo);
    objRectangulo.setSize(300, 300);
    jifRectangulo.setSize(300, 400);
    
    jifTrianguloRectangulo.setContentPane(objTrianguloRectangulo);
    objTrianguloRectangulo.setSize(300, 300);
    jifTrianguloRectangulo.setSize(500, 500);
    }

    public midPrincipal() {
        initComponents();
        this.inicializarFormularios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jifRombo = new javax.swing.JInternalFrame();
        jifTrapecio = new javax.swing.JInternalFrame();
        jifCuadrado = new javax.swing.JInternalFrame();
        jifCirculo = new javax.swing.JInternalFrame();
        jifRectangulo = new javax.swing.JInternalFrame();
        jifTrianguloRectangulo = new javax.swing.JInternalFrame();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jmiRombo = new javax.swing.JMenuItem();
        jmiTrapecio = new javax.swing.JMenuItem();
        jmiCuadrado = new javax.swing.JMenuItem();
        jmiCirculo = new javax.swing.JMenuItem();
        jmiRectangulo = new javax.swing.JMenuItem();
        jmiTrianguloRectangulo = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifRombo.setClosable(true);
        jifRombo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRombo.setVisible(false);

        javax.swing.GroupLayout jifRomboLayout = new javax.swing.GroupLayout(jifRombo.getContentPane());
        jifRombo.getContentPane().setLayout(jifRomboLayout);
        jifRomboLayout.setHorizontalGroup(
            jifRomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifRomboLayout.setVerticalGroup(
            jifRomboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifRombo);
        jifRombo.setBounds(0, 0, 400, 270);

        jifTrapecio.setClosable(true);
        jifTrapecio.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifTrapecio.setVisible(false);

        javax.swing.GroupLayout jifTrapecioLayout = new javax.swing.GroupLayout(jifTrapecio.getContentPane());
        jifTrapecio.getContentPane().setLayout(jifTrapecioLayout);
        jifTrapecioLayout.setHorizontalGroup(
            jifTrapecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifTrapecioLayout.setVerticalGroup(
            jifTrapecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifTrapecio);
        jifTrapecio.setBounds(0, 0, 400, 280);

        jifCuadrado.setClosable(true);
        jifCuadrado.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifCuadrado.setVisible(false);

        javax.swing.GroupLayout jifCuadradoLayout = new javax.swing.GroupLayout(jifCuadrado.getContentPane());
        jifCuadrado.getContentPane().setLayout(jifCuadradoLayout);
        jifCuadradoLayout.setHorizontalGroup(
            jifCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifCuadradoLayout.setVerticalGroup(
            jifCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifCuadrado);
        jifCuadrado.setBounds(0, 0, 400, 280);

        jifCirculo.setClosable(true);
        jifCirculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifCirculo.setVisible(false);

        javax.swing.GroupLayout jifCirculoLayout = new javax.swing.GroupLayout(jifCirculo.getContentPane());
        jifCirculo.getContentPane().setLayout(jifCirculoLayout);
        jifCirculoLayout.setHorizontalGroup(
            jifCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifCirculoLayout.setVerticalGroup(
            jifCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifCirculo);
        jifCirculo.setBounds(0, 0, 400, 280);

        jifRectangulo.setClosable(true);
        jifRectangulo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRectangulo.setVisible(false);

        javax.swing.GroupLayout jifRectanguloLayout = new javax.swing.GroupLayout(jifRectangulo.getContentPane());
        jifRectangulo.getContentPane().setLayout(jifRectanguloLayout);
        jifRectanguloLayout.setHorizontalGroup(
            jifRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifRectanguloLayout.setVerticalGroup(
            jifRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifRectangulo);
        jifRectangulo.setBounds(0, 0, 400, 280);

        jifTrianguloRectangulo.setClosable(true);
        jifTrianguloRectangulo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifTrianguloRectangulo.setVisible(false);

        javax.swing.GroupLayout jifTrianguloRectanguloLayout = new javax.swing.GroupLayout(jifTrianguloRectangulo.getContentPane());
        jifTrianguloRectangulo.getContentPane().setLayout(jifTrianguloRectanguloLayout);
        jifTrianguloRectanguloLayout.setHorizontalGroup(
            jifTrianguloRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jifTrianguloRectanguloLayout.setVerticalGroup(
            jifTrianguloRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane.add(jifTrianguloRectangulo);
        jifTrianguloRectangulo.setBounds(0, 0, 400, 280);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        jmiRombo.setMnemonic('o');
        jmiRombo.setText("Rombo");
        jmiRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRomboActionPerformed(evt);
            }
        });
        fileMenu.add(jmiRombo);

        jmiTrapecio.setMnemonic('s');
        jmiTrapecio.setText("Trapecio");
        jmiTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrapecioActionPerformed(evt);
            }
        });
        fileMenu.add(jmiTrapecio);

        jmiCuadrado.setText("Cuadrado");
        jmiCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCuadradoActionPerformed(evt);
            }
        });
        fileMenu.add(jmiCuadrado);

        jmiCirculo.setText("Circulo");
        jmiCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCirculoActionPerformed(evt);
            }
        });
        fileMenu.add(jmiCirculo);

        jmiRectangulo.setText("Rectangulo");
        jmiRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRectanguloActionPerformed(evt);
            }
        });
        fileMenu.add(jmiRectangulo);

        jmiTrianguloRectangulo.setText("Triangulo Rectangulo");
        jmiTrianguloRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTrianguloRectanguloActionPerformed(evt);
            }
        });
        fileMenu.add(jmiTrianguloRectangulo);

        jmiExit.setMnemonic('x');
        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        fileMenu.add(jmiExit);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRomboActionPerformed
        // TODO add your handling code here:
        jifRombo.setVisible(true);
    }//GEN-LAST:event_jmiRomboActionPerformed

    private void jmiTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrapecioActionPerformed
        // TODO add your handling code here:
        jifTrapecio.setVisible(true);
    }//GEN-LAST:event_jmiTrapecioActionPerformed

    private void jmiCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCuadradoActionPerformed
        // TODO add your handling code here:
        jifCuadrado.setVisible(true);
    }//GEN-LAST:event_jmiCuadradoActionPerformed

    private void jmiCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCirculoActionPerformed
        // TODO add your handling code here:
        jifCirculo.setVisible(true);
    }//GEN-LAST:event_jmiCirculoActionPerformed

    private void jmiRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRectanguloActionPerformed
        // TODO add your handling code here:
        jifRectangulo.setVisible(true);
    }//GEN-LAST:event_jmiRectanguloActionPerformed

    private void jmiTrianguloRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTrianguloRectanguloActionPerformed
        // TODO add your handling code here:
        jifTrianguloRectangulo.setVisible(true);
    }//GEN-LAST:event_jmiTrianguloRectanguloActionPerformed

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
            java.util.logging.Logger.getLogger(midPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(midPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(midPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(midPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new midPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JInternalFrame jifCirculo;
    private javax.swing.JInternalFrame jifCuadrado;
    private javax.swing.JInternalFrame jifRectangulo;
    private javax.swing.JInternalFrame jifRombo;
    private javax.swing.JInternalFrame jifTrapecio;
    private javax.swing.JInternalFrame jifTrianguloRectangulo;
    private javax.swing.JMenuItem jmiCirculo;
    private javax.swing.JMenuItem jmiCuadrado;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiRectangulo;
    private javax.swing.JMenuItem jmiRombo;
    private javax.swing.JMenuItem jmiTrapecio;
    private javax.swing.JMenuItem jmiTrianguloRectangulo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
