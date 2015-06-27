package pointofsalesystem;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.swing.ImageIcon;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Daniel
 */
public class OrderStockGUI extends javax.swing.JFrame 
{
    
    PointOfSaleSystem pos = new PointOfSaleSystem("");
    
    public OrderStockGUI()
    {
        initComponents();
     
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/POS_Icon_blue.png")).getImage()); //Set taskbar icon to logo.
    }

    public void orderStock() 
    {
        //http://www.tutorialspoint.com/javamail_api/javamail_api_gmail_smtp_server.htm - Sending a GMAIL email through TLS 
        
        String to = "xyz@gmail.com";                //Recipient's email

        final String from = "abc@gmail.com";              //Sender's email
        final String username = "abc";              //Sender email accounts
        final String password = "*****";            //Sender password

        String host = "smtp.gmail.com";             //GMAIL server address

        Properties props = new Properties();        //Instantiate new Properties object
        props.put("mail.smtp.auth", "true");        //Server details
        props.put("mail.smtp.starttls.enable", "true"); //Connect to server
        props.put("mail.smtp.host", host);          //More details
        props.put("mail.smtp.port", "587");         //SMTP Port 

        Session session = Session.getInstance(props, // Get the Session object.
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("Testing Subject");

            // Now set the actual message
            message.setText("Hello, this is sample for to check send "
                    + "email using JavaMailAPI ");

            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tfTotalPrice = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfSupplierName = new javax.swing.JTextField();
        tfOrderID = new javax.swing.JTextField();
        tfOrderDate = new javax.swing.JTextField();
        tfBarcode = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        spnQuantity = new javax.swing.JSpinner();
        lblPlaceOrder = new javax.swing.JLabel();
        lblPOSLogo = new javax.swing.JLabel();
        lblQuit = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS Order Stock");
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfTotalPrice.setBackground(new Color(0, 0, 0, 0));
        tfTotalPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        tfTotalPrice.setBorder(null);
        tfTotalPrice.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfTotalPrice.setEnabled(false);
        getContentPane().add(tfTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 120, 30));

        tfPricePerUnit.setBackground(new Color(0, 0, 0, 0));
        tfPricePerUnit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfPricePerUnit.setForeground(new java.awt.Color(255, 255, 255));
        tfPricePerUnit.setBorder(null);
        tfPricePerUnit.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfPricePerUnit.setEnabled(false);
        getContentPane().add(tfPricePerUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 30));

        tfSupplierName.setBackground(new Color(0, 0, 0, 0));
        tfSupplierName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfSupplierName.setForeground(new java.awt.Color(255, 255, 255));
        tfSupplierName.setBorder(null);
        tfSupplierName.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfSupplierName.setEnabled(false);
        getContentPane().add(tfSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 460, 40));

        tfOrderID.setBackground(new Color(0, 0, 0, 0));
        tfOrderID.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfOrderID.setForeground(new java.awt.Color(255, 255, 255));
        tfOrderID.setBorder(null);
        tfOrderID.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfOrderID.setEnabled(false);
        getContentPane().add(tfOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 210, 40));

        tfOrderDate.setBackground(new Color(0, 0, 0, 0));
        tfOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfOrderDate.setForeground(new java.awt.Color(255, 255, 255));
        tfOrderDate.setBorder(null);
        tfOrderDate.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfOrderDate.setEnabled(false);
        getContentPane().add(tfOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 210, 40));

        tfBarcode.setBackground(new Color(0, 0, 0, 0));
        tfBarcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBarcode.setForeground(new java.awt.Color(255, 255, 255));
        tfBarcode.setBorder(null);
        tfBarcode.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        tfBarcode.setEnabled(false);
        getContentPane().add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 460, 40));

        tfProductName.setBackground(new Color(0, 0, 0, 0));
        tfProductName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfProductName.setForeground(new java.awt.Color(255, 255, 255));
        tfProductName.setBorder(null);
        getContentPane().add(tfProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 106, 340, 40));
        getContentPane().add(spnQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 80, 30));

        lblPlaceOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlaceOrder.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPlaceOrderMouseReleased(evt);
            }
        });
        getContentPane().add(lblPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 364, 190, 20));

        lblPOSLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPOSLogo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblPOSLogoMouseReleased(evt);
            }
        });
        getContentPane().add(lblPOSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 40, 50));

        lblQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblQuitMouseReleased(evt);
            }
        });
        getContentPane().add(lblQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 30));

        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblBackMouseReleased(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 14, 60, 30));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OrderStockGUI.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseReleased
        pos.fadeOut(this);                                  //Fade out this window
        new ManagerPortalGUI().setVisible(true);            //Bring up the manager screen
    }//GEN-LAST:event_lblBackMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pos.fadeIn(this);                                   //Fade in this window
    }//GEN-LAST:event_formWindowOpened

    private void lblQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuitMouseReleased
        pos.fadeOut(this);                                  //Fade out current screen
        System.exit(0);                                     //Quit program
    }//GEN-LAST:event_lblQuitMouseReleased

    private void lblPOSLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPOSLogoMouseReleased
        pos.loadWebSite("https://github.com/iggnoreza/pointofsalesystem"); //Load the github repository for this project. 
    }//GEN-LAST:event_lblPOSLogoMouseReleased

    private void lblPlaceOrderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlaceOrderMouseReleased
        String productName = tfProductName.getText();
        int quantity = (int) spnQuantity.getValue();
        String barcode = tfBarcode.getText();
        String orderDate = tfOrderDate.getText() + ":00.0";
        Calendar cal = new GregorianCalendar();
        
        
        
    }//GEN-LAST:event_lblPlaceOrderMouseReleased

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
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderStockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderStockGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPOSLogo;
    private javax.swing.JLabel lblPlaceOrder;
    private javax.swing.JLabel lblQuit;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfOrderDate;
    private javax.swing.JTextField tfOrderID;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfSupplierName;
    private javax.swing.JTextField tfTotalPrice;
    // End of variables declaration//GEN-END:variables
}
