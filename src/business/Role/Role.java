/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Network.Network;
//import business.Business;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author virajshah
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
    
}
