/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author virajshah
 */
public class JusticeEnterprise extends Enterprise {
    
    public JusticeEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Justice);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
