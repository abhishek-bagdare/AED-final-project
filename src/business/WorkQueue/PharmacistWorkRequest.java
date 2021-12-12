/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author abhishekbagdare
 */
public class PharmacistWorkRequest extends WorkRequest {
     DrWorkRequest DoctorWorkRequest;
    private ArrayList<Medicines> medicines = new ArrayList<Medicines>();

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    }

    public ArrayList<Medicines> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicines> medicines) {
        this.medicines = medicines;
    }
    
    
}
