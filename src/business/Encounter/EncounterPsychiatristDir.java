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
public class EncounterPsychiatristDir {

    private ArrayList<EncounterPsychiatrist> HPEncounters;
    private HashMap<String,ArrayList<EncounterPsychiatrist>> HPEncounterDirectory;
    
    public EncounterPsychiatristDir()
    {
       HPEncounterDirectory=new HashMap<String,ArrayList<EncounterPsychiatrist>>();
       HPEncounters=new ArrayList<EncounterPsychiatrist>();
    }

    public ArrayList<EncounterPsychiatrist> getHPEncounters() {
        return HPEncounters;
    }

    public HashMap<String, ArrayList<EncounterPsychiatrist>> getHPEncounterDirectory() {
        return HPEncounterDirectory;
    }

    
}
