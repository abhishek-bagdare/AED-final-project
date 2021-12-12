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
public class EncounterCounsellorDir {
      private ArrayList<EncounterCounsellor> Encounters;
    private HashMap<String,ArrayList<EncounterCounsellor>> EncounterDirectory;

    public EncounterCounsellorDir() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterCounsellor>>();
       Encounters=new ArrayList<EncounterCounsellor>();
    }

    public ArrayList<EncounterCounsellor> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterCounsellor>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
    
    
    
    
}
