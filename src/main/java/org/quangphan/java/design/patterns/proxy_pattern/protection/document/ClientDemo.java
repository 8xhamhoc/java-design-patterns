package org.quangphan.java.design.patterns.proxy_pattern.protection.document;

public class ClientDemo {

    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        // Add documents with different access roles
        documentManager.addDocument(new ProtectionProxyDocument("Confidential Report", "Admin", "Admin"));
        documentManager.addDocument(new ProtectionProxyDocument("Public Article", "Guest", "Guest"));
        documentManager.addDocument(new ProtectionProxyDocument("Employee Handbook", "HR", "Employee"));

        // Simulate viewing documents for different user roles
        documentManager.viewDocuments("Admin");
        documentManager.viewDocuments("Guest");
        documentManager.viewDocuments("Employee");
    }
}
