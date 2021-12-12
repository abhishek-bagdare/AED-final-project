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
      CaseReporterWorkRequest HelpSeekerWorkRequest;
    ArrayList<EncounterLawyer> LawyerEncounter = new ArrayList<EncounterLawyer>();

    public CaseReporterWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(CaseReporterWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }

    public ArrayList<EncounterLawyer> getLawyerEncounter() {
        return LawyerEncounter;
    }

    public void setLawyerEncounter(ArrayList<EncounterLawyer> LawyerEncounter) {
        this.LawyerEncounter = LawyerEncounter;
    }
    
}
