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
 * @author Ajinkya
 */
public class NGOEnterprise extends Enterprise {
    
    public NGOEnterprise(String name){
        super(name,EnterpriseType.NGO);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
