/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patel
 */
public class LabAssistantWorkRequest extends WorkRequest{
    
    DrWorkRequest DoctorWorkRequest;
    private String testResult;
    //private LabTest labtest;
    private String labsign;
    private ArrayList<LabTest> LabTestList = new ArrayList<LabTest>();

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    /*public LabTest getLabtest() {
        return labtest;
    }

    public void setLabtest(LabTest labtest) {
        this.labtest = labtest;
    }*/

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    } 

    public String getLabsign() {
        return labsign;
    }

    public void setLabsign(String labsign) {
        this.labsign = labsign;
    }

    public ArrayList<LabTest> getLabTestList() {
        return LabTestList;
    }

    public void setLabTestList(ArrayList<LabTest> LabTestList) {
        this.LabTestList = LabTestList;
    }
    
    
    
    

}
