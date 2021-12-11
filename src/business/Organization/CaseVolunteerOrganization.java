/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */

public class CaseVolunteerOrganization extends Organization{

    public CaseVolunteerOrganization() {
        super(Organization.Type.CaseVolunteer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseVolunteer());
        return roles;
    }
     
}