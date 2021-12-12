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
    
private ArrayList<EncounterLawyer> Encounters;
    private HashMap<String,ArrayList<EncounterLawyer>> EncounterDirectory;

    public EncounterLawyerDir() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterLawyer>>();
       Encounters=new ArrayList<EncounterLawyer>();
    }

    public ArrayList<EncounterLawyer> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterLawyer>> getEncounterDirectory() {
        return EncounterDirectory;
    }
}
