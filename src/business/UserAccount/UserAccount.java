/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author Dhaval
 */


public class UserAccount {
    
    private String username;
    private String pwd;
    private Employee emp;
    private Role role;
    private WorkQueue wrkQue;

    public UserAccount() {
        wrkQue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Role getRole() {
        return role;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmp() {
        return emp;
    }

    public WorkQueue getWrkQue() {
        return wrkQue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}