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
public class DrWorkRequest extends WorkRequest{
     RehabilitationCaretakerWorkRequest  rehabilitationCaretakerWorkRequest;

    public RehabilitationCaretakerWorkRequest getRehabilitationCaretakerWorkRequest() {
        return rehabilitationCaretakerWorkRequest;
    }

    public void setRehabilitationCaretakerWorkRequest(RehabilitationCaretakerWorkRequest rehabilitationCaretakerWorkRequest) {
        this.rehabilitationCaretakerWorkRequest = rehabilitationCaretakerWorkRequest;
    }
}
