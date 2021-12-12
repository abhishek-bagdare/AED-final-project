/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.Date;

/**
 *
 * @author abhishekbagdare
 */
public class CaseReporterWorkRequest {
      
    private String childName;
    private String relation;
    private String assaultType;
    private String location;
    private Integer Age;

   
    private Date doi;
    private String moredetails;
    private String suspecttype;
    private String nameofsuspect;
    private String email;
    private DrWorkRequest doctorWorkRequest;
    private CounsellorWorkRequest counsellorWorkRequest;
    private LawyerWorkRequest lawyerWorkRequest;
    private PsychiatristWorkRequest hpWorkRequest;
    
    public String getRelation() {
        return relation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChildName() {
        return childName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAssaultType() {
        return assaultType;
    }

    public void setAssaultType(String assaultType) {
        this.assaultType = assaultType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDoi() {
        return doi;
    }

    public void setDoi(Date doi) {
        this.doi = doi;
    }

    public String getMoredetails() {
        return moredetails;
    }

    public void setMoredetails(String moredetails) {
        this.moredetails = moredetails;
    }

    public String getSuspecttype() {
        return suspecttype;
    }

    public void setSuspecttype(String suspecttype) {
        this.suspecttype = suspecttype;
    }

    public String getNameofsuspect() {
        return nameofsuspect;
    }

    public void setNameofsuspect(String nameofsuspect) {
        this.nameofsuspect = nameofsuspect;
    }

    public DrWorkRequest getDoctorWorkRequest() {
        return doctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest doctorWorkRequest) {
        this.doctorWorkRequest = doctorWorkRequest;
    }

    public CounsellorWorkRequest getCounsellorWorkRequest() {
        return counsellorWorkRequest;
    }

    public void setCounsellorWorkRequest(CounsellorWorkRequest counsellorWorkRequest) {
        this.counsellorWorkRequest = counsellorWorkRequest;
    }

    public LawyerWorkRequest getLawyerWorkRequest() {
        return lawyerWorkRequest;
    }

    public void setLawyerWorkRequest(LawyerWorkRequest lawyerWorkRequest) {
        this.lawyerWorkRequest = lawyerWorkRequest;
    }

    public PsychiatristWorkRequest getHpWorkRequest() {
        return hpWorkRequest;
    }

    public void setHpWorkRequest(PsychiatristWorkRequest hpWorkRequest) {
        this.hpWorkRequest = hpWorkRequest;
    }
  
}
