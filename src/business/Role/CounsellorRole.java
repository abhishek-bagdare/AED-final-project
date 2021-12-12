/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import UI.Counsellar.CounsellarJPanel;
import javax.swing.JPanel;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CounsellingOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import Business.WorkQueue.HelpSeekerWorkRequest; 
import javax.swing.JPanel;
import ui.Counsellor.CounsellorJPanel;
/**
 *
 * @author abhishekbagdare
 */
public class CounsellorRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business,Network network) {
        return new CounsellorJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
}
