package org.quangphan.java.design.patterns.cor_pattern.approval;

public class TeamLead implements Approver {

    private Approver nextApprover;
    private final double approvalLimit = 1000;

    @Override
    public void setNextApprover(Approver approver) {
        nextApprover = approver;
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < approvalLimit) {
            System.out.println("Team Lead approves the request #" + purchaseRequest.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(purchaseRequest);
        } else {
            System.out.println("Request #" + purchaseRequest.getRequestNumber() + " cannot be approved.");
        }
    }
}
