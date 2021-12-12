/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

/**
 *
 * @author abhishekbagdare
 */
public class DrWorkRequest extends WorkRequest{
      CaseReporterWorkRequest CaseReporterWorkRequest;
    LabAssistantWorkRequest LabAssistanceWorkRequest;
    PharmacistWorkRequest PharmacistWorkRequest;
    RehabilitationCaretakerWorkRequest  rehabilitationCaretakerWorkRequest;

    public RehabilitationCaretakerWorkRequest getRehabilitationCaretakerWorkRequest() {
        return rehabilitationCaretakerWorkRequest;
    }

    public void setRehabilitationCaretakerWorkRequest(RehabilitationCaretakerWorkRequest rehabilitationCaretakerWorkRequest) {
        this.rehabilitationCaretakerWorkRequest = rehabilitationCaretakerWorkRequest;
    }
    private String docsign;

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public String getDocsign() {
        return docsign;
    }

    public void setDocsign(String docsign) {
        this.docsign = docsign;
    }

    public LabAssistantWorkRequest getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setLabAssistanceWorkRequest(LabAssistantWorkRequest LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public PharmacistWorkRequest getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setPharmacistWorkRequest(PharmacistWorkRequest PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
    
    
}
