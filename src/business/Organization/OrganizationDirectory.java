/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class OrganizationDirectory {
      private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        /*if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else*/ if (type.getValue().equals(Type.CaseReporter.getValue())){
            organization = new CaseReporterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Forensic.getValue())){
            organization = new ForensicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CounsellingDept.getValue())){
            organization = new CounsellingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Legal.getValue())){
            organization = new LegalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CaseVolunteer.getValue())){
            organization = new CaseVolunteerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PsychiatricOrganization.getValue())){
            organization = new PsychiatricOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Rehabilitation.getValue())){
            organization = new RehabilitationOrganization();
            organizationList.add(organization);
        }
        /*
        else if (type.getValue().equals(Type.NGOAdmin.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthAdmin.getValue())){
            organization = new HealthAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacyAdmin.getValue())){
            organization = new PharmacyAdminOrganization();
            organizationList.add(organization);
        }*/
        return organization;
    }
    
    public Organization searchOrganizationbyname(String Name){
        for(Organization org: organizationList){
            if(Name.equalsIgnoreCase(org.getName())){
                return org;
            }
        }
        return null; 
    }
}
