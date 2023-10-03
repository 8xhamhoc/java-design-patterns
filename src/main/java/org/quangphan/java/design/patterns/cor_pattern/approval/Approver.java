package org.quangphan.java.design.patterns.cor_pattern.approval;

public interface Approver {

    void setNextApprover(Approver approver);

    void processRequest(PurchaseRequest purchaseRequest);
}
