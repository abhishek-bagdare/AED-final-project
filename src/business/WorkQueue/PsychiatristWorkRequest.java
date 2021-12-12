/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Encounter.EncounterPsychiatrist;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class PsychiatristWorkRequest extends WorkRequest {
     CaseReporterWorkRequest caseReporterWorkRequest;
    ArrayList<EncounterPsychiatrist> HPEncounter = new ArrayList<EncounterPsychiatrist>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return caseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest caseReporterWorkRequest) {
        this.caseReporterWorkRequest = caseReporterWorkRequest;
    }

    public ArrayList<EncounterPsychiatrist> getHPEncounter() {
        return HPEncounter;
    }

    public void setHPEncounter(ArrayList<EncounterPsychiatrist> HPEncounter) {
        this.HPEncounter = HPEncounter;
    }
}
