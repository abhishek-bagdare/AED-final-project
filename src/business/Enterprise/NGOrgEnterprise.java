/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Enterprise.Enterprise;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */

public class NGOrgEnterprise extends Enterprise {
    
    public NGOrgEnterprise(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}