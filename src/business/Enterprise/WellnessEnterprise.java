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
 * @author abhishekbagdare
 */
public class WellnessEnterprise extends Enterprise{
      
    public WellnessEnterprise(String name){
        super(name,EnterpriseType.Wellness);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
