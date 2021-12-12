/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class CaseReporterEnterprise extends Enterprise {
    
     public CaseReporterEnterprise(String name){
        super(name,EnterpriseType.CaseReporter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

