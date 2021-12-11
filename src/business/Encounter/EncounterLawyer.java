/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Encounter;

/**
 *
 * @author abhishekbagdare
 */
public class EncounterLawyer {

    private String encounter;
    private String minutes;
    private String name;
    
    public EncounterLawyer(){
    
    }

public String getEncounter() {
        return encounter;
    }

    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
