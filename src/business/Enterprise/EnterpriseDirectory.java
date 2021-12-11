/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Enterprise;

import business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.CaseReporter){
            enterprise=new CaseReporterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Wellness){
            enterprise=new WellnessEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.JusticeEnterprise){
            enterprise=new JusticeEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOrgEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Pharmaceutical){
            enterprise=new PharmaceuticalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Rehabilitation){
            enterprise=new RehabilitationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise searchEnterprisebyname(String Name){
        for(Enterprise etp: enterpriseList){
            if(Name.equalsIgnoreCase(etp.getName())){
                return etp;
            }
        }
        return null; 
    }
    
    public Enterprise searchEnterprisebyType(Enterprise.EnterpriseType type){
        for(Enterprise etp : enterpriseList){
            if(type.equals(etp.getEnterpriseType())){
                return etp;
            }
        }
        return null;
    }
       
}

