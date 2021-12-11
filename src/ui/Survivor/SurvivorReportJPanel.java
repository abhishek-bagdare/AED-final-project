/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Survivor;


//import UI.Hospital.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
//import Business.Enterprise.HelpSeekerEnterprise;
import Business.Network.Network;
//import Business.Organization.CaseManagerOrganization;
//import Business.Organization.HelpSeekerOrganization;
//import Business.Organization.Organization;
//import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import Business.WorkQueue.HelpSeekerWorkRequest;
/**
 *
 * @author virajshah
 */
public class SurvivorReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SurvivorReportJPanell
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    HelpSeekerOrganization organization;
    Network network;
    public SurvivorReportJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = (HelpSeekerOrganization) organization;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblSurvivorName = new javax.swing.JLabel();
        txtSurvivorName = new javax.swing.JTextField();
        lblSurvivorEmail = new javax.swing.JLabel();
        txtSurvivorEmail = new javax.swing.JTextField();
        lblRelationSurvivor = new javax.swing.JLabel();
        btnFriendRadioButton = new javax.swing.JRadioButton();
        btnParentRadioButton = new javax.swing.JRadioButton();
        btnSelfRadioButton = new javax.swing.JRadioButton();
        btnOtherRadioButton = new javax.swing.JRadioButton();
        lblTypeOfHelp = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblLocation = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblGender = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        lblSurvivorAge = new javax.swing.JLabel();
        txtSurvivorAge = new javax.swing.JTextField();
        btnReport = new javax.swing.JButton();

        lblDate.setText("Date:");

        lblSurvivorName.setText("Name of Survivor : ");

        txtSurvivorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurvivorNameActionPerformed(evt);
            }
        });

        lblSurvivorEmail.setText("Email:");

        txtSurvivorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurvivorEmailActionPerformed(evt);
            }
        });

        lblRelationSurvivor.setText("Relation with Survivor : ");

        btnFriendRadioButton.setText("Friend");

        btnParentRadioButton.setText("Parent");
        btnParentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentRadioButtonActionPerformed(evt);
            }
        });

        btnSelfRadioButton.setText("Self");

        btnOtherRadioButton.setText("Other");

        lblTypeOfHelp.setText("Type of Help Needed: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Child Abuse", "Sexual Assault", "Food Donation" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblLocation.setText("Location of Incident :");

        lblGender.setText("Gender :");

        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        lblSurvivorAge.setText("Age of Survivor :");

        btnReport.setBackground(new java.awt.Color(255, 0, 51));
        btnReport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblRelationSurvivor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSurvivorName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSurvivorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(btnFriendRadioButton)))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSurvivorName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSurvivorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSelfRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOtherRadioButton)
                                        .addGap(339, 339, 339))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtSurvivorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(337, 337, 337)))
                                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFemale)
                        .addGap(361, 361, 361))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 214, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(btnParentRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTypeOfHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSurvivorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 487, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurvivorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurvivorName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurvivorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSurvivorEmail))
                .addGap(18, 18, 18)
                .addComponent(lblRelationSurvivor)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtherRadioButton)
                    .addComponent(btnFriendRadioButton)
                    .addComponent(btnSelfRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFemale)
                    .addComponent(btnMale))
                .addGap(18, 18, 18)
                .addComponent(txtSurvivorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReport)
                .addGap(111, 111, 111))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(btnParentRadioButton)
                    .addGap(21, 21, 21)
                    .addComponent(lblTypeOfHelp)
                    .addGap(29, 29, 29)
                    .addComponent(lblLocation)
                    .addGap(25, 25, 25)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(lblGender)
                    .addGap(23, 23, 23)
                    .addComponent(lblSurvivorAge)
                    .addGap(0, 180, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSurvivorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurvivorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurvivorNameActionPerformed

    private void txtSurvivorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurvivorEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurvivorEmailActionPerformed

    private void btnParentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnParentRadioButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        HelpSeekerWorkRequest request = new HelpSeekerWorkRequest();
        request.setStatus("Waiting");
        request.setSender(userAccount);

        request.setNameofvictim(txtSurvivorName.getText());
        request.setEmail(txtSurvivorEmail.getText());
        //for choosing relations
        if(btnFriendRadioButton.isSelected())
        {
            request.setRelation("Friend");
        }
        else if(btnParentRadioButton.isSelected())
        {
            request.setRelation("Parent");
        }
        else if(btnSelfRadioButton.isSelected())
        {
            request.setRelation("Self");

        }
        else if(btnOtherRadioButton.isSelected())
        {
            request.setRelation("Other");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a relation");

        }
        //for choosing type
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Select one"))
        {
            JOptionPane.showMessageDialog(null, "Please select a type");
        }
        else{
            request.setTypeofsa(jComboBox1.getSelectedItem().toString());
        }
        //location
        request.setLocation(jTextField4.getText());
        //date
        if(jDateChooser1.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Please select a date");
        }else{
            request.setDoi(jDateChooser1.getDate());
        }
        //more detaisl
        //        if(jTextField3.getText()==null)
        //        {
            //            JOptionPane.showMessageDialog(null, "Please fill more details");
            //            return;
            //        }
        //        request.setMoredetails(jTextField3.getText());
        //suspect
        if(btnMale.isSelected())
        {
            request.setSuspecttype("Known");
        }
        else if(btnFemale.isSelected())
        {
            request.setSuspecttype("Unknown");
        }else{JOptionPane.showMessageDialog(null, "Please select a suspect type");}

        //Survivor Age
        request.setNameofsuspect(txtSurvivorAge.getText());

        if(request.getDoi()!=null && request.getLocation()!=null && request.getRelation()!=null && request.getSuspecttype()!=null
            && request.getNameofvictim()!=null && request.getTypeofsa()!=null)
        {
            Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            Organization org = null;
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof CaseManagerOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getHelpSeekerworkRequestList().add(request);
                //userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            }

            //organization.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            txtSurvivorName.setText("");
            txtSurvivorAge.setText("");
            //            jTextField3.setText("");
            jTextField4.setText("");
            txtSurvivorEmail.setText("");
            btnFriendRadioButton.setSelected(false);
            btnParentRadioButton.setSelected(false);
            btnSelfRadioButton.setSelected(false);
            btnOtherRadioButton.setSelected(false);
            btnMale.setSelected(false);
            btnFemale.setSelected(false);
            jComboBox1.setSelectedIndex(0);
            jDateChooser1.setDate(null);
            userAccount.getWorkQueue().getHelpSeekerworkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Incident is reported successfully.");

        }
    }//GEN-LAST:event_btnReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnFriendRadioButton;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOtherRadioButton;
    private javax.swing.JRadioButton btnParentRadioButton;
    private javax.swing.JButton btnReport;
    private javax.swing.JRadioButton btnSelfRadioButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblRelationSurvivor;
    private javax.swing.JLabel lblSurvivorAge;
    private javax.swing.JLabel lblSurvivorEmail;
    private javax.swing.JLabel lblSurvivorName;
    private javax.swing.JLabel lblTypeOfHelp;
    private javax.swing.JTextField txtSurvivorAge;
    private javax.swing.JTextField txtSurvivorEmail;
    private javax.swing.JTextField txtSurvivorName;
    // End of variables declaration//GEN-END:variables
}