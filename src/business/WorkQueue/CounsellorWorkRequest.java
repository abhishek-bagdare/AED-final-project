/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Encounter.EncounterCounsellor;
import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class CounsellorWorkRequest extends WorkRequest {
     CaseReporterWorkRequest hswr;
    ArrayList<EncounterCounsellor> ConslrEncounter = new ArrayList<EncounterCounsellor>();

    public CaseReporterWorkRequest getHswr() {
        return hswr;
    }

    public void setHswr(CaseReporterWorkRequest hswr) {
        this.hswr = hswr;
    }

    public ArrayList<EncounterCounsellor> getConslrEncounter() {
        return ConslrEncounter;
    }

    public void setConslrEncounter(ArrayList<EncounterCounsellor> ConslrEncounter) {
        this.ConslrEncounter = ConslrEncounter;
    }
}
