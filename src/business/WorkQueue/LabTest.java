/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

/**
 *
 * @author virajshah
 */
public class LabTest {
    private String test;
    private String Result;

    public LabTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }
    
    @Override
    public String toString() {
        return this.getTest();
    }
    
}
