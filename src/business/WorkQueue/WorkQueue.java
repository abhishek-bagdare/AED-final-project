/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;
/**
 *
 * @author virajshah
 */
public class WorkQueue {
    
    private ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList;
    private ArrayList<LawyerWorkRequest> LawyerworkRequestList;
    private ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList;
    private ArrayList<CounsellorWorkRequest> CounsellarworkRequestList;
    private ArrayList<DrWorkRequest> DoctorworkRequestList;
    private ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest;
    private ArrayList<PharmacistWorkRequest> PharmacistWorkRequest;
     
    
    public WorkQueue() {
        caseReporterWorkRequestList = new ArrayList<CaseReporterWorkRequest>();
        LawyerworkRequestList=new ArrayList<LawyerWorkRequest>();
        psychiatristWorkRequestList=new ArrayList<PsychiatristWorkRequest>();
        CounsellarworkRequestList = new ArrayList<CounsellorWorkRequest>();
        DoctorworkRequestList = new ArrayList<DrWorkRequest>();
        LabAssistanceWorkRequest = new ArrayList<LabAssistantWorkRequest>();
        PharmacistWorkRequest = new ArrayList<PharmacistWorkRequest>();
    }

    public ArrayList<CaseReporterWorkRequest> getCaseReporterWorkRequestList() {
        return caseReporterWorkRequestList;
    }

    public ArrayList<LawyerWorkRequest> getLawyerworkRequestList() {
        return LawyerworkRequestList;
    }

    public ArrayList<PsychiatristWorkRequest> getPsychiatristWorkRequestList() {
        return psychiatristWorkRequestList;
    }

    public ArrayList<CounsellorWorkRequest> getCounsellarworkRequestList() {
        return CounsellarworkRequestList;
    }

    public ArrayList<DrWorkRequest> getDoctorworkRequestList() {
        return DoctorworkRequestList;
    }

    public ArrayList<LabAssistantWorkRequest> getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public ArrayList<PharmacistWorkRequest> getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setCaseReporterWorkRequestList(ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList) {
        this.caseReporterWorkRequestList = caseReporterWorkRequestList;
    }

    public void setLawyerworkRequestList(ArrayList<LawyerWorkRequest> LawyerworkRequestList) {
        this.LawyerworkRequestList = LawyerworkRequestList;
    }

    public void setPsychiatristWorkRequestList(ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList) {
        this.psychiatristWorkRequestList = psychiatristWorkRequestList;
    }

    public void setCounsellarworkRequestList(ArrayList<CounsellorWorkRequest> CounsellarworkRequestList) {
        this.CounsellarworkRequestList = CounsellarworkRequestList;
    }

    public void setDoctorworkRequestList(ArrayList<DrWorkRequest> DoctorworkRequestList) {
        this.DoctorworkRequestList = DoctorworkRequestList;
    }

    public void setLabAssistanceWorkRequest(ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public void setPharmacistWorkRequest(ArrayList<PharmacistWorkRequest> PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
    
    public int getcountbytypesa(String type)
    {
        int count=0;
        
        for(CaseReporterWorkRequest hp: caseReporterWorkRequestList)
        {
            
            if(hp.getAssaultType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }
    
}
