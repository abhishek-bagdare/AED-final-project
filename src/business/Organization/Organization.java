/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Encounter.EncounterCounsellor;
import business.Encounter.EncounterCounsellorDir;
import business.Encounter.EncounterLawyer;
import business.Encounter.EncounterPsychiatrist;
import business.Encounter.EncounterPsychiatristDir;
import business.Encounter.EncounterLawyerDir;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private EncounterCounsellorDir counsellorencounterdir;
    private EncounterLawyerDir lawyerencounterdir;
    private EncounterPsychiatristDir Psychiatricencounterdir;
    
    public enum Type{
        CaseReporter("CaseReporterOrganization"),Hospital("HospitalOrganization"),Forensic("ForensicOrganization"),
        CounsellingOrganization("CounsellingOrganization"), Legal("LegalOrganization"), CaseVolunteer("CaseVolunteer"),
        PsychiatricOrganization("PsychiatricOrganization"),Pharmacy("PharmacyOrganization"),Rehabilitation("Rehabilitation")
        ;
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        counsellorencounterdir=new EncounterCounsellorDir();
        lawyerencounterdir = new EncounterLawyerDir();
        Psychiatricencounterdir=new EncounterPsychiatristDir();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EncounterPsychiatristDir getPsychiatricencounterdir() {
        return Psychiatricencounterdir;
    }

    public EncounterCounsellorDir getCounsellorencounterdir() {
        return counsellorencounterdir;
    } 

    public EncounterLawyerDir getLawyerencounterdir() {
        return lawyerencounterdir;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
