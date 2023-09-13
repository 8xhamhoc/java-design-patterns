package org.quangphan.java.design.patterns.builder_pattern.document;

public class SimpleDocumentBuilder implements DocumentBuilder {

    SimpleDocument simpleDocument = new SimpleDocument();

    @Override
    public void buildTitle(String title) {
        simpleDocument.setTitle(title);
    }

    @Override
    public void buildContent(String content) {
        simpleDocument.setContent(content);
    }

    @Override
    public Document buildDocument() {
        return simpleDocument;
    }
}
