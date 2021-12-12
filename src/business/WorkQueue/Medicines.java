/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

/**
 *
 * @author abhishekbagdare
 */
public class Medicines {
     private String medicine;
    private int amount;

    public Medicines(String med, int qty) {
        this.medicine = med;
        this.amount = qty;
    }
    
    

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    
    @Override
    public String toString() {
        return this.getMedicine();
    }
    
}
