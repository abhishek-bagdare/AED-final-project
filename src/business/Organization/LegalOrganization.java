/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.LawyerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author virajshah
 */
public class LegalOrganization extends Organization{

    public LegalOrganization() {
        super(Organization.Type.Legal.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LawyerRole());
        return roles;
    }
    
}
