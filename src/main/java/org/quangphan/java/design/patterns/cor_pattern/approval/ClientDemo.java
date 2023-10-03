package org.quangphan.java.design.patterns.cor_pattern.approval;

public class ClientDemo {

    public static void main(String[] args) {

        Approver ceo = new CEO();
        Approver director = new Director();
        Approver teamLead = new TeamLead();

        director.setNextApprover(ceo);
        teamLead.setNextApprover(director);

        PurchaseRequest purchaseRequest1 = new PurchaseRequest(1, 900);

        System.out.println("Handle for purchaseRequest1");
        teamLead.processRequest(purchaseRequest1);

        PurchaseRequest purchaseRequest2 = new PurchaseRequest(2, 9000);
        System.out.println("Handle for purchaseRequest2");
        teamLead.processRequest(purchaseRequest2);

        PurchaseRequest purchaseRequest3 = new PurchaseRequest(3, 19000);
        System.out.println("Handle for purchaseRequest3");
        teamLead.processRequest(purchaseRequest3);
    }
}
