package org.quangphan.java.design.patterns.proxy_pattern.protection.document;

public class ProtectionProxyDocument implements Document {

    private RealDocument realDocument;
    private String userRole;

    public ProtectionProxyDocument(String content, String userRole, String accessRole) {
        if (userRole.equals(accessRole)) {
            realDocument = new RealDocument(content, accessRole);
        }
        this.userRole = userRole;
    }

    @Override
    public void view() {
        if (realDocument != null) {
            realDocument.view();
        } else {
            System.out.println("Access denied for user with role: " + userRole);
        }
    }
}
