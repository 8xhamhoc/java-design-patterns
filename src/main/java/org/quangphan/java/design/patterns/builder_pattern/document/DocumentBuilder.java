package org.quangphan.java.design.patterns.builder_pattern.document;

public interface DocumentBuilder {

    void buildTitle(String title);
    void buildContent(String content);
    Document buildDocument();
}
