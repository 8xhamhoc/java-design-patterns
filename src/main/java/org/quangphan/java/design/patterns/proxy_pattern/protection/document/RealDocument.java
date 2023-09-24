package org.quangphan.java.design.patterns.proxy_pattern.protection.document;

public class RealDocument implements Document {

    private String content;
    private String accessRole;

    public RealDocument(String content, String accessRole) {
        this.content = content;
        this.accessRole = accessRole;
    }

    @Override
    public void view() {
        System.out.println("Show content: " + content);
    }

    public String getAccessRole() {
        return accessRole;
    }
}
