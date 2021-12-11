/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList <RehabilitationCaretakerWorkRequest> rehabilitationCaretakerWorkRequest;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
        rehabilitationCaretakerWorkRequest=new ArrayList<RehabilitationCaretakerWorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public ArrayList<RehabilitationCaretakerWorkRequest> getRehabilitationCaretakerWorkRequest() {
        return rehabilitationCaretakerWorkRequest;
    }
}