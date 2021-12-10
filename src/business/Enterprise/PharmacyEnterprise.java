/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class PharmacyEnterprise extends Enterprise {
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.FoodMgmt);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
