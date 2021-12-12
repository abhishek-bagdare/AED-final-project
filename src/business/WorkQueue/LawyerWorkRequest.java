/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Encounter.EncounterLawyer;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class LawyerWorkRequest extends WorkRequest {
      CaseReporterWorkRequest CaseReporterWorkRequest;
    ArrayList<EncounterLawyer> LawyerEncounter = new ArrayList<EncounterLawyer>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public ArrayList<EncounterLawyer> getLawyerEncounter() {
        return LawyerEncounter;
    }

    public void setLawyerEncounter(ArrayList<EncounterLawyer> LawyerEncounter) {
        this.LawyerEncounter = LawyerEncounter;
    }
    
}
