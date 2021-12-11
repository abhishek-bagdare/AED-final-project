/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Employee.EmployeeDirectory;
import business.Encounter.CounsellorEncounterDirectory;
import business.Encounter.CounsellorEncounter;
import business.Encounter.PsychiatristEncounterDirectory;
import business.Encounter.LawyerEncounterDirectory;
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
    private CounsellorEncounterDirectory counsellorencounterdir;
    private LawyerEncounterDirectory lawyerencounterdir;
    private PsychiatristEncounterDirectory Psychiatricencounterdir;
    
    public enum Type{
        CaseReporter("CaseReporterOrganization"),Hospital("HospitalOrganization"),Forensic("ForensicOrganization"),
        CounsellingDept("CounsellingDeptOrganization"), Legal("LegalOrganization"), CaseVolunteer("CaseVolunteer"),
        HelpProvider("HelpProviderOrganization"),Pharmacy("PharmacyOrganization"),Rehabilitation("Rehabilitation")
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
        counsellorencounterdir=new CounsellorEncounterDirectory();
        lawyerencounterdir = new LawyerEncounterDirectory();
        Psychiatricencounterdir=new PsychiatristEncounterDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public PsychiatristEncounterDirectory getPsychiatricencounterdir() {
        return Psychiatricencounterdir;
    }

    public CounsellorEncounterDirectory getCounsellorencounterdir() {
        return counsellorencounterdir;
    }

    public LawyerEncounterDirectory getLawyerencounterdir() {
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
