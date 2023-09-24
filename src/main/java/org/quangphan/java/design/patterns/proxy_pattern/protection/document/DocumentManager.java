package org.quangphan.java.design.patterns.proxy_pattern.protection.document;

import java.util.ArrayList;
import java.util.List;

public class DocumentManager {

    private List<Document> documents;

    public DocumentManager() {
        documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void viewDocuments(String userRole) {
        System.out.println("Documents for user with role: " + userRole);
        for (Document document : documents) {
            ((ProtectionProxyDocument) document).view();
        }
    }
}
