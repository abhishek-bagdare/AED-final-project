/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.PsychiatristRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class PsychiatricOrganization extends Organization{
     public PsychiatricOrganization() {
        super(Organization.Type.PsychiatricOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
       // roles.add(new PsychiatristRole());
        return roles;
    }
}
