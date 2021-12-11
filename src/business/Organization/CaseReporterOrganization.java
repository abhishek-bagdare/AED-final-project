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

public class CaseReporterOrganization extends Organization{

    public CaseReporterOrganization() {
        super(Organization.Type.CaseReport.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseReportRole());
        return roles;
    }
     
}
