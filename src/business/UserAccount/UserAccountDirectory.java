/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount searchUserAccount(String username, String Password){
        for (UserAccount ua : userAccountList){
            if(ua.getUsername().equals(username)&& ua.getPassword().equals(Password)){
                return ua;
            }
        }
        return null;
    }
    
    public boolean IsValidInput(String s) {

        boolean status = false;    
        char [] array = s.toCharArray();
        int lower=0, upper=0, digits=0;

        if (s.length() > 8) 
        status = true;

        for ( int i = 0;  i < array.length; i++) {
            if(Character.isDigit(array[i]))
                digits++;
            if(Character.isLowerCase(array[i]))
                lower++;
            if(Character.isUpperCase(array[i]))
                upper++;
            
            
        }

        if ( !(lower  > 0 ))
            status = false;

        if ( !(upper  > 0 ))
            status = false;

        if ( !(digits > 0 ))
            status = false;

        return status;
    }

}
