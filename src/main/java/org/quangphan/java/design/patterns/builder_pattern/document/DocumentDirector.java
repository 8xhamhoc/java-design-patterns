package org.quangphan.java.design.patterns.builder_pattern.document;

public class DocumentDirector {

    private DocumentBuilder documentBuilder;

    public DocumentDirector(DocumentBuilder documentBuilder) {
        this.documentBuilder = documentBuilder;
    }

    public void construct(String title, String content) {
        this.documentBuilder.buildTitle(title);
        this.documentBuilder.buildContent(content);
    }
}
