package org.quangphan.java.design.patterns.cor_pattern.approval;

public class CEO implements Approver {

    @Override
    public void setNextApprover(Approver approver) {
        // CEO is the final approver, no next approver needed
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        System.out.println("CEO approves the request #" + purchaseRequest.getRequestNumber());
    }
}
