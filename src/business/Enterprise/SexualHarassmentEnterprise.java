
package business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class SexualHarassmentEnterprise extends Enterprise {
    
    public SexualHarassmentEnterprise(String name){
        super(name,EnterpriseType.SexualHarassment);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
