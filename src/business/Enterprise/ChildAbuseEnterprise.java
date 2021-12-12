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
public class ChildAbuseEnterprise extends Enterprise {
    
    public ChildAbuseEnterprise(String name){
        super(name,EnterpriseType.ChildAbuse);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
