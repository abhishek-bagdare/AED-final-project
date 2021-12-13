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
public class RehabilitationCaretakerWorkRequest extends WorkRequest {
     public RehabilitationCaretakerWorkRequest rehabCaretakerWorkReq;
    private ArrayList<Child> children = new ArrayList<Child>();
    public RehabilitationCaretakerWorkRequest getRehabCaretakerWorkReq() {
        return rehabCaretakerWorkReq;
    }

    public void setRehabCaretakerWorkReq(RehabilitationCaretakerWorkRequest rehabCaretakerWorkReq) {
        this.rehabCaretakerWorkReq = rehabCaretakerWorkReq;
    }
     public ArrayList<Child> getChildren() {
        return children;
    }
     public void addChild(Child c){
         children.add(c);
     }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }
}
