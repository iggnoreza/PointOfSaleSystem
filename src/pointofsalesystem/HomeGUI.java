package pointofsalesystem;

import java.io.IOException;
import javax.swing.ImageIcon;

public class HomeGUI extends javax.swing.JFrame 
{

    public HomeGUI() 
    {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyLogo = new javax.swing.JLabel();
        lblManagerPortal = new javax.swing.JLabel();
        lblLock = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCompanyLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCompanyLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCompanyLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblCompanyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 860, 140));

        lblManagerPortal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManagerPortal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblManagerPortalMouseReleased(evt);
            }
        });
        getContentPane().add(lblManagerPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 174, 150, 150));

        lblLock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblLockMouseReleased(evt);
            }
        });
        getContentPane().add(lblLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, 30));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 30));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 40, 50));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HomeGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        new PointOfSaleSystem().fadeOut(this);  //Fade out the current screen
        System.exit(0);                         //Quit the program.
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblLockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLockMouseReleased
        new PointOfSaleSystem().fadeOut(this);  //Fade out the current screen using fadeOut method
        new LockScreenGUI().setVisible(true);   //Bring up new screen
    }//GEN-LAST:event_lblLockMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new PointOfSaleSystem().fadeIn(this);   //Fade in the current screen as soon as it is selected.
    }//GEN-LAST:event_formWindowOpened

    private void lblCompanyLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyLogoMouseReleased
//        new PointOfSaleSystem().loadWebSite("http://www.spar.co.za/home"); //Load the company webpage.
        loadWebSite("http://www.spar.co.za/home"); //Load the company webpage.
    }//GEN-LAST:event_lblCompanyLogoMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
//        new PointOfSaleSystem().loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
        loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblManagerPortalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManagerPortalMouseReleased
        new PointOfSaleSystem().fadeOut(this);
        new ManagerPortalGUI().setVisible(true);
    }//GEN-LAST:event_lblManagerPortalMouseReleased

    public void loadWebSite(String url) //Display a certain webpage 
    {
        try 
        {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } 
        catch (IOException ex) 
        {
            System.out.println("Failed to load website. " + ex);
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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompanyLogo;
    private javax.swing.JLabel lblLock;
    private javax.swing.JLabel lblManagerPortal;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblQuit;
    // End of variables declaration//GEN-END:variables
}
