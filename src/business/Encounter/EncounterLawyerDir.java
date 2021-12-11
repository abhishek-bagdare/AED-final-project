/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Encounter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author abhishekbagdare
 */
public class EncounterLawyerDir {
    
private ArrayList<LawyerEncounter> Encounters;
    private HashMap<String,ArrayList<LawyerEncounter>> EncounterDirectory;

    public LawyerEncounterDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<LawyerEncounter>>();
       Encounters=new ArrayList<LawyerEncounter>();
    }

    public ArrayList<LawyerEncounter> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<LawyerEncounter>> getEncounterDirectory() {
        return EncounterDirectory;
    }
}
