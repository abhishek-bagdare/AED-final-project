/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Lawyer;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.HospitalOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author virajshah
 */
public class CaseReportLJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseReportLJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    CaseReporterWorkRequest request;
    UserAccount userAccount;
    Network network;
    public CaseReportLJPanel(JPanel userProcessContainer, EcoSystem system, CaseReporterWorkRequest request,UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        PopulateReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblRelationwithSurvivor = new javax.swing.JLabel();
        lblTypeofAssault = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSuspectType = new javax.swing.JLabel();
        lblSuspectName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSuspectName = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtRelationwithSurvivor = new javax.swing.JTextField();
        txtTypeofAssault = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtSuspectType = new javax.swing.JTextField();
        btnSendInvite = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblName.setText("Name of Survivor : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lblName, gridBagConstraints);

        lblRelationwithSurvivor.setText("Relation with Survivor : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 42, 0, 0);
        jPanel1.add(lblRelationwithSurvivor, gridBagConstraints);

        lblTypeofAssault.setText("Type of Sexual Assault : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lblTypeofAssault, gridBagConstraints);

        lbllocation.setText("Location of Incident :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lbllocation, gridBagConstraints);

        lblDate.setText("Date of Incident :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 42, 0, 0);
        jPanel1.add(lblDate, gridBagConstraints);

        lblSuspectType.setText("Suspect :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 42, 0, 0);
        jPanel1.add(lblSuspectType, gridBagConstraints);

        lblSuspectName.setText("Name of Suspect : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 42, 0, 0);
        jPanel1.add(lblSuspectName, gridBagConstraints);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txtName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 82);
        jPanel1.add(txtSuspectName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txtlocation, gridBagConstraints);

        txtRelationwithSurvivor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationwithSurvivorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 2, 0, 0);
        jPanel1.add(txtRelationwithSurvivor, gridBagConstraints);

        txtTypeofAssault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeofAssaultActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txtTypeofAssault, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanel1.add(txtDate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 82);
        jPanel1.add(txtSuspectType, gridBagConstraints);

        btnSendInvite.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendInvite.setText("Send Invite");
        btnSendInvite.setBorderPainted(false);
        btnSendInvite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendInviteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendInviteMouseExited(evt);
            }
        });
        btnSendInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendInviteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorderPainted(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(btnSendInvite)
                .addGap(671, 671, 671))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(488, 488, 488))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(114, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(btnSendInvite)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtRelationwithSurvivorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationwithSurvivorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationwithSurvivorActionPerformed

    private void txtTypeofAssaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeofAssaultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeofAssaultActionPerformed

    private void btnSendInviteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendInviteMouseEntered
        btnSendInvite.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendInviteMouseEntered

    private void btnSendInviteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendInviteMouseExited
        btnSendInvite.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendInviteMouseExited

    private void btnSendInviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendInviteActionPerformed

        String FromEmail="sexualawareness.help@gmail.com";
        String FromEmailPass="Fin@lProject21";
        String Subject = "Sign up successful";
        String ema=request.getEmail();
        String nv=request.getChildName();
        Properties properties=new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail,FromEmailPass);
            }
        });

        try
        {
            Message msg=new MimeMessage(session);
            msg.setFrom(new InternetAddress(FromEmail));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(ema));
            msg.setSubject("A Lawyer has been assigned.");
            msg.setText("Dear "+nv +"\n"+"I am here to help you. Please schedule an appointment through the following link."+"\n"+"calendly.link"+"\n"+"Best,"+"\n"+userAccount.getEmp().getName());
            Transport.send(msg);
            JOptionPane.showMessageDialog(this, "Invitation has been sent successfully.");

        }catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(this, "Incorrect E-mail id.Invitation cannot be been sent.");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendInviteActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LawyerJPanel sysAdminwjp = (LawyerJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendInvite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRelationwithSurvivor;
    private javax.swing.JLabel lblSuspectName;
    private javax.swing.JLabel lblSuspectType;
    private javax.swing.JLabel lblTypeofAssault;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRelationwithSurvivor;
    private javax.swing.JTextField txtSuspectName;
    private javax.swing.JTextField txtSuspectType;
    private javax.swing.JTextField txtTypeofAssault;
    private javax.swing.JTextField txtlocation;
    // End of variables declaration//GEN-END:variables

private void PopulateReport() {
        txtName.setText(request.getChildName());
        txtRelationwithSurvivor.setText(request.getRelation());
        txtTypeofAssault.setText(request.getAssaultType());
        txtlocation.setText(request.getLocation());
        txtDate.setText(request.getDoi().toString());
        txtSuspectType.setText(request.getSuspecttype());
        txtSuspectName.setText(request.getNameofsuspect());
        
        
    }

}
